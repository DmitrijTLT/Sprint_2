package ru.yandex.practicum.model;

// Объявляем абстрактный класс Food
public abstract class Food {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    // Конструктор класса Food
    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    // Геттер переменной amount
    public int getAmount() {
        return amount;
    }

    // Геттер переменной price
    public double getPrice() {
        return price;
    }

    // Геттер переменной isVegetarian
    public boolean isVegetarian() {
        return isVegetarian;
    }
}
