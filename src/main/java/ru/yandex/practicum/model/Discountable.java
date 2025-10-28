package ru.yandex.practicum.model;

//Объявляем интерфейс Discountable
public interface Discountable {
    //объявляем метод getDiscount, т.к. все методы интерфейса по умолчанию абстрактные и публичные, поэтому слова abstract и public опускаем
    double getDiscount();
}
