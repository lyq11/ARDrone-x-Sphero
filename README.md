# AR.Drone x Sphero

Android AR.FreeFlight 2.0 application with option to connect one or two Spheros.
**This is a fork of the Parrot official SDK 2.0.1**

--------------------------

[Here](Builds/FreeFlightWithSpheros.apk)'s a working build.
The Sphero Mode can be enabled inside the settings menu and will allow you to connect up to 2 Spheros to control the AR.Drone.

* **One Sphero Mode**: controls the pitch/roll of the AR.Drone using the pitch/roll of the Sphero.
* **Two Spheros Mode**: enables control of the pitch/roll via the primary Sphero (indicated by purple/pink color) and throttle/yaw via the secondary Sphero (indicated by yellow color).
Pitching up the secondary Sphero to 60° angle will trigger a take off and pitching it down to -60°, while flying, will trigger a landing.
Piloting with pitch/roll AND yaw enabled can be quite difficult. As such there is an option to disable the yaw while pitch and roll commands are being sent to the AR.Drone.

--------------------------

## Seting up the environment
* The project will build only on Linux.
* Install Ant.
* Install [Android NDK r8b](http://dl.google.com/android/ndk/android-ndk-r8b-linux-x86_64.tar.bz2).
* Edit `ANDROID_SDK_PATH` and `ANDROID_NDK_PATH` in [environment.properties](Examples/Android/trunk/FreeFlightWithSpheros/environment.properties) with the paths to your Android SDK and NDK.
* Update [local.properties](Examples/Android/trunk/FreeFlightWithSpheros/environment.properties) with correct path to your Android SDK.

## Building the application
* Under the Android project folder run :
  * `$ ./build.sh clean` to clean
  * `$ ./build.sh debug` to build a debug version
  * `$ ./build.sh release` to build a release version
* After successful build, you can find the APKs under the bin folder. `$ adb install -r bin/FreeFlight-debug.apk`



