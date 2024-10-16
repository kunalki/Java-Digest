package com.javaDigest.interfaces.devices;

public class Test {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("10263534");
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.stopMusic();
        smartPhone.takePhoto();
        smartPhone.recordVideo();
    }
}
