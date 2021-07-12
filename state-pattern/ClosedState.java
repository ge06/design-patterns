package com.company;

public class ClosedState implements IState {

    private final Phone phone;

    public ClosedState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void hitLockButton() {
        System.out.println("Do nothing");
    }

    @Override
    public void hitVolumeUpButton() {
        System.out.println("Do nothing");
    }

    @Override
    public void hitVolumeDownButton() {
        System.out.println("Do nothing");
    }

    @Override
    public void hitHomeButton() {
        System.out.println("Do nothing");
    }

    @Override
    public void hitLockButtonWithLongDuration() {
        phone.open();
        System.out.println("Connecting people");
    }
}
