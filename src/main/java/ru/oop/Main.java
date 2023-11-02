package ru.oop;

/**
 * Задача: нужно добраться человеку на машине до заданного места.<br>
 * Но не всегда можно подъехать прямо к нужному месту, может понадобиться дойти пешком.<br>
 * Человек знает своё текущее местоположение (у него есть метод {@link Person#getPosition()}<br>
 * <p>
 * <ul>
 *   <li>Код не должен превышать 6 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(Person person, Position destination)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class Main {
    /**
     * Переехать из текущего места в заданную точку
     */
    public static void moveTo(Person person, Position destination) {
        // TODO
        Car car = new Car();
        Position carPosition = car.getCarPosition();
        person.walk(carPosition);
        car.personInCar(person);
        carPosition = car.goPosition(destination);
        if (carPosition == destination) car.exitFromCar(person);
        assert person.getPosition() == destination;

    }
}
