import ru.yandex.practicum.model.Apple;
import ru.yandex.practicum.model.Food;
import ru.yandex.practicum.model.Meat;
import ru.yandex.practicum.model.constants.Colour;
import ru.yandex.practicum.service.ShoppingCart;


public class Main {
    public static void main (String[] args) {
        // Инициализируем данные. Создаем объекты meat, redApple и greenApple
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        // Создаем массив продуктов с типом Food
        Food[] products = {meat, redApple, greenApple};
        // Инизиализируем  корзину с помощтю массива products
        ShoppingCart cart = new ShoppingCart(products);

        // Присваиваем переменным посчитанные значения корзины
        double totalPriceWithoutDiscount = cart.getTotalPriceWithoutDiscount();
        double totalPriceWithDiscount = cart.getTotalPriceWithDiscount();
        double totalPriceVegetarianWithoutDiscount = cart.getTotalPriceVegetarianWithoutDiscount();

        // Выводим значения для созданной корзины
        String formattedString = String.format("Общая сумма товаров без скидки = %f %n", totalPriceWithoutDiscount);
        formattedString += String.format("Общая сумма товаров со скидкой = %f %n", totalPriceWithDiscount);
        formattedString += String.format("Cумма всех вегетарианских продуктов без скидки = %f %n", totalPriceVegetarianWithoutDiscount);
        System.out.println(formattedString);
    }
}
