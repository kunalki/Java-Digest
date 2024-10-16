package com.javaDigest.interfaces.devices;

public class SmartPhone implements  Camera, MusicPlayer, Phone{

    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("stopping music");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Making call to this " + number);
    }

    @Override
    public void endCall() {
        System.out.println("Ending call.");
    }
}
