package ru.oop;

/**
 * Класс, отвечающий за личный транспорт
 */
public class Bus extends Transport{
    /**
     * Человек, находиящийся в общественном транспорте
     */
    Person person;
    /**
     * Номер транспорта
     */
    String number;

    /**
     * Конструктор общественного транспорта
     * @param number номер транспорта
     * @param person человек
     */
    Bus(String number,Person person){
        // TODO
    }

    /**
     * Получить номер общественного транспорта
     * @return номер транспорта
     */
    public String getNumber() {
        // TODO
        return number;
    }
}
