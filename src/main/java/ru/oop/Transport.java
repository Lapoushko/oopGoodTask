package ru.oop;

/**
 * Класс всего транспорта
 */
public class Transport implements Positioned {
    /**
     * Посаадить человека в машину
     */
    public void personInTransport(Person person){
        // TODO
    }

    /**
     * Выйти из транспорта
     * @param person человек
     */
    public void exitFromTransport(Person person){
        // TODO
    }

    /**
     * Узнать ближайшую точку к цели
     * @param position конечная точка
     * @return ближайшая точка
     */
    public Position getNearest(Position position){
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
