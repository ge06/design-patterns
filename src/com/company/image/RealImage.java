package com.company.image;

public class RealImage implements Image{
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(this.fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying images in " + this.fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading images in " + fileName);
    }
}
