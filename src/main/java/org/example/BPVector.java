package org.example;

import java.util.ArrayList;
import java.util.List;

public class BPVector {
    private List<Integer> coords;
    private int pointTo;

    public BPVector(int pointTo, List<Integer> coords) {
        this.coords = coords;
        this.pointTo = pointTo;
    }

    public void setCoords(ArrayList<Integer> coords) {
        this.coords = coords;
    }

    public List<Integer> getCoords() {
        return coords;
    }

    public int getPointTo() {
        return pointTo;
    }

    public void setPointTo(int pointTo) {
        this.pointTo = pointTo;
    }


    @Override
    public String toString() {
        return this.getPointTo() + "";
    }
}
