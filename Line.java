package com.company;

public class Line {
    double k;
    double b;
    public Line(double k, double b){ // задаем прямые
        this.k = k;
        this.b = b;
    }
    public static boolean isParallel(Line l1, Line l2){ // проверяем параллельность
        if(l1.k == l2.k){
            return false;
        }
        else{
            return true;
        }

    }



    public static Point getPoint(Line l1, Line l2){ // метод, который выдает точки через прямые, через пересечения прямых нахлодим
        double x = (l2.b - l1.b)/(l1.k - l2.k);
        double y = l1.valueOnX(x);
        return new Point(x,y);
    }
    public double valueOnX(double x){

        return k*x + b;
    }

    @Override
    public String toString(){
        return k + "*x" + b + " = " + "y";
    } // выводим прямую

}