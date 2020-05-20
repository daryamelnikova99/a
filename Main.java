package com.company;


public class Main {

    public static void main(String[] args) {
        Line l1 = new Line(1,1);
        Line l2 = new Line(-1,1);
        Line l3 = new Line(0, 0);


        if (triangle(l1,l2,l3)){
            Point p1 = Line.getPoint(l1,l2);
            Point p2 = Line.getPoint(l2,l3);
            Point p3 = Line.getPoint(l1, l3);
            Point.StoronisEqual(p1,p2,p3);
            double s = findSquare(p1,p2,p3);
            System.out.println("площадь = " + s);


        }else {
            System.out.println("Нельзя построить треугольгик"); }

    }

    public static boolean parall(Line line1, Line line2, Line line3){
        if(Line.isParallel(line1, line3) || Line.isParallel(line2, line1) || Line.isParallel(line2, line3)){
            return false;
        } return true;

    }

    public static boolean triangle(Line line1, Line line2, Line line3){
        if(parall(line1, line2, line3)){
            return true;
        }
        Point p1 = Line.getPoint(line1,line2);
        Point p2 = Line.getPoint(line2,line3);
        Point p3 = Line.getPoint(line1, line3);

        if(Point.isEqual(p1, p2) ||( Point.isEqual(p2,p3)) || Point.isEqual(p1,p3) ){
            return false;
        } return true;

    }

    public static double findSquare(Point p1, Point p2, Point p3){ // площадь находим, через формулу герона
        double p = (Point.distance(p1,p2) + Point.distance(p2,p3) + Point.distance(p1,p3)/2);
        double S = Math.sqrt((p*(p- Point.distance(p1,p2))*(p- Point.distance(p1,p3)*(p- Point.distance(p3,p2)))));
        return S;
    }

}


