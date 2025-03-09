package com.fourpillers.interfaces.multilevelinheritance;

public class Test {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall();
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.pauseMusic();
        smartPhone.takePhoto();
        smartPhone.recordVideo();
    }
}
