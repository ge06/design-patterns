package com.company;

public class PhoneDemo {

    private final Phone phone;

    public PhoneDemo(Phone phone) {
        this.phone = phone;
    }

    public void execute() {
        phone.hitLockButton();
        phone.hitVolumeUpButton();
        phone.hitLockButton();
        phone.hitHomeButton();
        phone.hitLockButtonWithLongDuration();
        phone.hitHomeButton();
        phone.hitVolumeDownButton();
        phone.hitLockButtonWithLongDuration();
        phone.hitVolumeDownButton();
    }
}