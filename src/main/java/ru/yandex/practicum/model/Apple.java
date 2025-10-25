package ru.yandex.practicum.model;
import ru.yandex.practicum.model.constants.Colour;
import ru.yandex.practicum.model.constants.Discount;

// Объявляем класс Apple наследника класса Food и интерфейса Discountable
public class Apple extends Food implements Discountable{
    private String colour;

    // Конструктор класса Apple
    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.isVegetarian = true;
        this.colour = colour;
    }

    //Переопределям метод getDiscount()
    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return Discount.RED_APPLE_DISCOUNT;
        } else {
            return Discount.NO_DISCOUNT;
        }
    }
}
