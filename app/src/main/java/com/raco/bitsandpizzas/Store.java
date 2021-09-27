package com.raco.bitsandpizzas;

public class Store {
    private String name;
    private int imageResourceId;

    public static final Store[] stores = {
            new Store("San Juan Store", R.drawable.san_juan_store),
            new Store("Caguas Store", R.drawable.caguas_store)
    };

    private Store(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
