package com.company.image;

public class LazyImageProxy implements Image{
    public final String fileName;
    private RealImage realImage;

    public LazyImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null) realImage = new RealImage(this.fileName);
        realImage.display();
    }
}
