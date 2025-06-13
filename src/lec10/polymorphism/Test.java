package lec10.polymorphism;

 class Shape {

     public void area(){
         System.out.println();
     }

}

class Circle extends Shape{

    double r ;
    public Circle(double r) {
        this.r = r;
    }

    public void area() {
        double result = Math.PI* r*r;
        System.out.printf("%.2f\n" , result);
    }
}

class Rectangle extends Shape{

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void area() {
        double result = a * b;
        System.out.println(result);
    }
}


public class Test {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4,5);

        for (Shape shape : shapes) {
            shape.area();

        }
    }

}
