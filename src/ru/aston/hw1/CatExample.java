package ru.aston.hw1;

public class CatExample {

    public static void main(String[] args) {
        MutableCat mutableCat = new MutableCat("Барсик");
        System.out.println("Изменяемый кот: " + mutableCat.getName());
        mutableCat.setName("Мурзик");
        System.out.println("Новое имя изменяемого кота: " + mutableCat.getName());

        ImmutableCat immutableCat = new ImmutableCat("Вася", mutableCat);
        System.out.println("\nНеизменяемый кот: " + immutableCat.getName());
        System.out.println("Кот внутри неизменяемого: " + immutableCat.getCat().getName());

        MutableCat innerCat = immutableCat.getCat();
        innerCat.setName("Рыжик");
        System.out.println("\nПосле изменения внутреннего кота:");
        System.out.println("Кот внутри неизменяемого: " + immutableCat.getCat().getName());
        System.out.println("Оригинальный изменяемый кот: " + mutableCat.getName());
    }
}
