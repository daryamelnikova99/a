package com.company;

public class Point {
    double x;
    double y;


    public Point(double x, double y){ //сначала мы даем координаты точек нашего треуольника
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2){ // этот метод вычисляет дистанцию точек.
        return Math.sqrt(p1.x - p2.x)* (p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y);
    }

    public static boolean StoronisEqual(Point p1, Point p2, Point p3){ // этот метод проверяет, что сумма двух сторон треугольника больше третьей стороны.
        if((distance(p1,p2) + distance(p1,p3) > distance(p2,p3))){
            return true;
        }
        else{
            return false;
        }

    }

    public static boolean isEqual(Point p1, Point p2){ // метод проверяет, что точки не равны, которые мы задали.
        if(distance(p1, p2) > 0){
            return false;
        }else {
            return true;
        }

    }
    @Override
    public String toString(){
        return "x = " + ", " + "y = " + y;
    } // вывод точек
}