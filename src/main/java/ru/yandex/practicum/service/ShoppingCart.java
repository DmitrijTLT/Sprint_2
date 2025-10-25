package ru.yandex.practicum.service;
import ru.yandex.practicum.model.Discountable;
import ru.yandex.practicum.model.Food;
import ru.yandex.practicum.model.constants.Discount;

// Объявляем класс ShoppingCart
public class ShoppingCart{
    private Food[] items; //массив элементов из объектов типа Food

    // Конструктор класса ShoppingCart
    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Расчет общей суммы товаров в корзине без скидки
    public double getTotalPriceWithoutDiscount() {
        double totalPriceWithoutDiscount = 0;
        for (Food item : items) {
            totalPriceWithoutDiscount += item.getPrice() * item.getAmount();
        }
        return totalPriceWithoutDiscount;
    }

    // Расчет общей суммы товаров в корзине со скидкой
    public double getTotalPriceWithDiscount() {
        double totalPriceWithDiscount = 0;
        for (Food item : items) {
            double totalPriceWithoutDiscount = item.getPrice() * item.getAmount();
            double discount = Discount.NO_DISCOUNT;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }
            double priceWithDiscount = totalPriceWithoutDiscount - (totalPriceWithDiscount / 100) * discount;
            totalPriceWithDiscount += priceWithDiscount;
        }
        return totalPriceWithDiscount;
    }

    // Расчет общей суммы вегетарианских продуктов в корзине без скидки
    public double getTotalPriceVegetarianWithoutDiscount(){
        double totalPriceVegetarianWithoutDiscount = 0;
        for (Food item :items) {
            if (item.isVegetarian()) {
                totalPriceVegetarianWithoutDiscount =+ item.getPrice() * item.getAmount();
            }
        }
        return totalPriceVegetarianWithoutDiscount;
    }
}
