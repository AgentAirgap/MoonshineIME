```text
 __  __   ____   ____  _   _  ____  _   _ ___ _   _ _____ 
|  \/  | / __ \ / __ \| \ | |/ ___|| | | |_ _| \ | | ____|
| |\/| || |  | | |  | |  \| |\___ \| |_| || ||  \| |  _|  
| |  | || |__| | |__| | |\  | ___) |  _  || || |\  | |___ 
|_|  |_| \____/ \____/|_| \_||____/|_| |_|___|_| \_|_____|

                 ___    __   ___  ______
                |_ _|   |  \/  |  | ____|
                 | |    | |\/| |  | __|  
                 | |    | |  | |  | |___
                |___|   |_|  |_|  |_____| 
```

A modified fork of [woheller69/whisperIME](https://github.com/woheller69/whisperIME) tailored for the CAT S22 Flip running Android Go.

Replaces the original Whisper TensorFlow Lite backend with **Sherpa-ONNX Moonshine Tiny (INT8)** and overhauls the UI into a compact, 52dp stone-rune punctuation toolbar built for a 2.8" display.

---

## Highlights

* **Offline Moonshine Tiny (INT8):** Powered by `sherpa-onnx` compiled for 32-bit ARM (`armeabi-v7a`) on the Snapdragon 215. Zero network dependencies.
* **Zero-Setup Bundled Models:** All ONNX model files are bundled uncompressed inside the APK and automatically extracted on first launch.
* **Compact 2.8" Toolbar:** Single-row 52dp bar keeping >85% of the screen visible, with stone-rune punctuation keys (`,`, `.`, `?`, `!`, `'`, `⌨`), smart spacing, and a touch-to-record silver coin button.

---

## Installation

1. Download the latest `app-release.apk` from [**Releases**](https://github.com/AgentAirgap/MoonshineIME/releases/latest).
2. Install the APK on your device (or via `adb install -r app-release.apk`).
3. Enable the keyboard in **Settings → System → Languages & input → On-screen keyboard**.

Models extract automatically on first dictation—no manual `adb push` required.

---

## Attribution & Licenses

* **Upstream App:** [woheller69/whisperIME](https://github.com/woheller69/whisperIME) / [vilassn/whisper_android](https://github.com/vilassn/whisper_android) (MIT / GPL-3.0)
* **ASR Architecture:** [Useful Sensors – Moonshine](https://github.com/usefulsensors/moonshine) (MIT)
* **Inference & Bindings:** [k2-fsa/sherpa-onnx](https://github.com/k2-fsa/sherpa-onnx) (Apache-2.0)
* **Runtime:** [Microsoft ONNX Runtime](https://github.com/microsoft/onnxruntime) (MIT)
* **VAD:** [gkonovalov/android-vad](https://github.com/gkonovalov/android-vad) (MIT)
* **Chinese Conversion:** [houbb/opencc4j](https://github.com/houbb/opencc4j) (Apache-2.0)
