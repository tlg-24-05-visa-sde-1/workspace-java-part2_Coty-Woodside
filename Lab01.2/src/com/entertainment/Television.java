package com.entertainment;

import java.util.Objects;

//fields
public class Television {
    private String brand;
    private int volume;

    //Television HAS-A Tuner (for changing channels)
    private final Tuner tuner = new Tuner();

    //constructors
    public Television() {
        super();
    }

    public Television(String brand, int volume) {
        setBrand(brand);
        setVolume(volume);
    }

    //business methods
    public int getCurrentChannel() {
        return tuner.getChannel();
    }

    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }


    //accessor methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Television other = (Television) obj;
        return getVolume() == other.getVolume() && Objects.equals(this.getBrand(), other.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getVolume());
    }
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(getBrand(), getVolume());
//
//    }
//
//
//    @Override
//    public boolean equals(Object obj) {
//        boolean result = false;
//        if (this.getClass() == obj.getClass()) {
//            Television other = (Television) obj;
//
//            result = Objects.equals(this.getBrand(), other.getBrand()) &&
//                    this.getVolume() == other.getVolume();
//        }
//        return result;
//    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + " [brand=" + getBrand() + ", volume=" +
                getVolume() + ", currentChannel=" + getCurrentChannel();
    }
}
