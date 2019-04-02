package ru.avalon.java.dev.j10.labs.shapes;

import static java.lang.Math.PI;

/**
 * Представление об окружности.
 * <p>

 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */

//класс наследует интерфейсы

public class Circle implements Shape, Point, Ellipse, Figure {
    
    private float radius;
    private float length;
    public float area;
    private float x;
    private float y;
        //генерация случайных чисел
     public Circle() {
        radius = (float) (100 * Math.random());

    }

    public float getArea() {
        return area = (float) (PI * radius * radius);
    }

   
    public int getRotation() {
       return 0;
    }

   
    public float getX() {
       return x;
    }

   
    public float getY() {
       return y;
    }

    
    public double getR() {
        return radius = (float) Math.sqrt(area/PI);
                
                
    }

    public float getLength() {
        return length = (float) (2*PI*radius);
        }
    
    
}

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

