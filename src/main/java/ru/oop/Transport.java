package ru.oop;

/**
 * Класс всего транспорта
 */
public class Transport implements Positioned {

    /**
     * Посаадить человека в машину
     */
    public void personInCar(Person person){
        // TODO
    }

    /**
     * Человек выходит из машины
     */

    public void exitFromCar(Person person){
        // TODO
    }

    /**
     * Узнать ближайшую точку к цели
     * @param destination ближайшая точка
     * @return позиция
     */
    public Position getNearest(Position destination){
        // TODO
        return null;
    }

    /**
     * Получить позицию транспорта
     * @return текущая позиция
     */
    @Override
    public Position getPosition() {
        // TODO
        return null;
    }

    /**
     * Отправиться к конечной точке
     * @param destination конечная точка
     */
    @Override
    public Position setPosition(Position destination) {
        // TODO
        return null;
    }
}
