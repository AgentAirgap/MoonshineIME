package com.whispertflite.engine

import android.content.Context
import android.util.Log
import java.io.File
import java.io.FileOutputStream

object ModelAssetManager {
    private const val TAG = "ModelAssetManager"
    private const val ASSET_SUBDIR = "moonshine"

    private val REQUIRED_FILES = listOf(
        "preprocess.onnx",
        "encode.int8.onnx",
        "uncached_decode.int8.onnx",
        "cached_decode.int8.onnx",
        "tokens.txt"
    )

    fun ensureModelsExtracted(context: Context, targetDir: File) {
        if (!targetDir.exists() && !targetDir.mkdirs()) {
            Log.e(TAG, "Failed to create target model directory: ${targetDir.absolutePath}")
            return
        }

        for (fileName in REQUIRED_FILES) {
            val destFile = File(targetDir, fileName)
            if (destFile.exists() && destFile.length() > 0L) {
                continue
            }

            try {
                context.assets.open("$ASSET_SUBDIR/$fileName").use { input ->
                    FileOutputStream(destFile).use { output ->
                        input.copyTo(output)
                    }
                }
                Log.i(TAG, "Extracted $fileName to ${destFile.absolutePath}")
            } catch (e: Exception) {
                Log.e(TAG, "Failed to extract $fileName from assets/$ASSET_SUBDIR", e)
            }
        }
    }
}