package ru.oop;

/**
 * Обозначает что объект позиционируемый,
 * т.е. знает своё местоположение и может его изменить
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public interface Positioned {

    /**
     * Текущее местоположение
     */
    Position getPosition();

    /**
     * Установить новое местоположение
     * @param position необходимая позиция
     * @return позицият после перемещения
     */
    Position setPosition(Position position);
}
