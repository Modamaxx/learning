package com.learning.airport;

public class Suitcase<A> {
    /**
     * save color Suitcase
     */
    private String color;
    /**
     * save number Items Suitcase
     */
    private A numberItems;

    public Suitcase(String color, A numberItems) {
        this.color = color;
        this.numberItems = numberItems;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public A getNumberItems() {
        return numberItems;
    }

    public void setNumberItems(A numberItems) {
        this.numberItems = numberItems;
    }
}
