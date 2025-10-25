package ru.yandex.practicum.model;
import ru.yandex.practicum.model.constants.Discount;

// Объявляем класс Meat наследника класса Food и интерфейса Discountable
public class Meat extends Food implements Discountable{
    // Конструктор класса Meat
    public Meat(int amount, double price) {
        super(amount, price);
        this.isVegetarian = false;
    }

    //Переопределям метод getDiscount()
    @Override
    public double getDiscount() {
        return Discount.NO_DISCOUNT;
    }
}
