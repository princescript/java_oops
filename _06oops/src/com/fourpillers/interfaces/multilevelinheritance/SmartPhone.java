package com.fourpillers.interfaces.multilevelinheritance;

//multiple inheritance - effectively not pure
public class SmartPhone implements Camera, MusicPlayer , Phone{
    @Override
    public void takePhoto() {
        System.out.println("Clicked");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Paused");

    }

    @Override
    public void makeCall() {
        System.out.println("Calling");
    }

    @Override
    public void endCall() {
        System.out.println("ended");

    }
}
