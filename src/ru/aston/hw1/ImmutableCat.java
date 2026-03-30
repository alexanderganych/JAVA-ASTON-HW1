package ru.aston.hw1;

public class ImmutableCat {

    private final String name;
    private final MutableCat cat;

    public ImmutableCat(String name, MutableCat cat) {
        this.name = name;
        this.cat = new MutableCat(cat.getName());
    }

    public String getName() {
        return name;
    }

    public MutableCat getCat() {
        return new MutableCat(cat.getName());
    }
}