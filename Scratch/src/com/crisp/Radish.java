package com.crisp;

class Radish implements Comparable<Radish> {
    private String color;
    private double size;
    private double tailLength;
    private int guysOnTop;

    //Todo: generate accessor methods
    //write toString()
    // write 4-arg ctor that takes them and delegates to setters


    // constructor
    public Radish(String color, double size, double tailLength, int guysOnTop) {
        setColor(color);
        setSize(size);
        setTailLength(tailLength);
        setGuysOnTop(guysOnTop);
    }


    //accessor methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public int getGuysOnTop() {
        return guysOnTop;
    }

    public void setGuysOnTop(int guysOnTop) {
        this.guysOnTop = guysOnTop;
    }


    //size (double) is our sort key
    @Override
    public int compareTo(Radish other) {
        return Double.compare(this.getSize(), other.getSize());
    }

    //toString
    @Override
    public String toString() {
        return "Radish color = " + getColor() + " size = " + getSize() + " tailLength = " +
                getTailLength() + " guysOnTop = " + getGuysOnTop();
    }
}
