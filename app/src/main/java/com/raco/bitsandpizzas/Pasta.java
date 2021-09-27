package com.raco.bitsandpizzas;

public class Pasta {
    private String name;
    private int imageResourceId;

    public static final Pasta[] pastas = {
            new Pasta("Spaghetti and Beef", R.drawable.ground_beef_pasta),
            new Pasta("Spaghetti and Shrimp", R.drawable.shrimp_pasta)
    };

    private Pasta(String name, int imageResourceId) {
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
