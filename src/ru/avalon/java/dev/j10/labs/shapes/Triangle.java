package ru.avalon.java.dev.j10.labs.shapes;

import static java.lang.Math.sin;

/**
 * Представление о треугольнике.
 * <p>
 * 
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
//класс наследует интерфейсы

public class Triangle implements Shape, Polygon {
    
    Triangle triangle;
    private float side1;
    private float side2;
    private float side3;
    public  float area;
    private int angle;
    private float perimeter;
        //генерация случайных чисел
    public Triangle() {
        
        side1 = (float) (100 * Math.random());
        side1 = (float) (100 * Math.random());
        side1 = (float) (100 * Math.random());
        angle = (int) (360 * Math.random());

    }
    
   // реализация абстрактных методов интерфейсов
    public float getArea() {
       return area = (float) (side1 * side2 / 2 * sin(angle));
    
    }
    
    public float getPerimeter() {
        return perimeter = (side1+side2+side3);
    }
    
    
    public int getRotation() {
        return angle;
    }
}
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */


