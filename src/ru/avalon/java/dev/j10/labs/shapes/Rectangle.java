package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
//класс наследует интерфейсы

public class Rectangle implements Shape, Figure {
    
    /*  TODO (Замечания№1 ЛР№2)
        - Подключены не все интерфейсы! Исправить!
    */
    
    public float area; //площадь
    private float perimeter; //периметр
    private int angle; // угол
    private float length; //длина
    private float width; //ширина
    
    /*  TODO (Замечания№1 ЛР№2)
        - Некоторые поля лишние, area и perimeter вычисляются при вызове, так как ширина 
        и длина может меняться! Убрать лишнее!
    */
    
    //генерация случайных чисел
     public Rectangle() {
        length = (float) (100 * Math.random());
        width = (float) (100 * Math.random());
        angle = (int) (360 * Math.random());
     }
        // реализация абстрактных методов интерфейсов
    public float getArea() {
       return area = (length*width);
       /*  TODO (Замечания№1 ЛР№2)
            - "area =" здесь не надо! Убрать лишнее!
        */
    }
    
    float getPerimeter() {
        return perimeter = (length + length + width + width);
        /*  TODO (Замечания№1 ЛР№2)
            - "perimeter =" здесь не надо! Убрать лишнее!
        */
    }
    
    public int getRotation() {
        return angle;
    }
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
