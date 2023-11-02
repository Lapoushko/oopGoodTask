package ru.oop;

/**
 * Класс всего транспорта
 */
public class Transport implements Positioned {

    /**
     * Посаадить человека в машину
     */
    public void personInCar(){
        // TODO
    }

    /**
     * Узнать ближайшую точку к цели
     * @param destination
     * @return
     */
    public Position getNearest(Position destination){
        // TODO
        return null;
    }

    /**
     * Получить позицию транспорта
     * @return
     */
    @Override
    public Position getPosition() {
        // TODO
        return null;
    }

    /**
     * Отправиться к конечной точке
     * @param destination
     */
    @Override
    public Position setPosition(Position destination) {
        // TODO
        return null;
    }
}
