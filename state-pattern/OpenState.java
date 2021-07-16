package com.company;

public class OpenState implements IState {

    private final Phone phone;

    public OpenState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void hitLockButton() {
        phone.lock();
        System.out.println("Telephone is locked now");
    }

    @Override
    public void hitVolumeUpButton() {
        System.out.println("Volume is increased");
    }

    @Override
    public void hitVolumeDownButton() {
        System.out.println("Volume is decreased");
    }

    @Override
    public void hitHomeButton() {
        System.out.println("Homepage is returned");
    }

    @Override
    public void hitLockButtonWithLongDuration() {
        phone.close();
        System.out.println("Bzzt");
    }
}
