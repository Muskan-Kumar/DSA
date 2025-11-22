

public class Polymorphism{

    // compile time or static polymorphism (method overloading)
    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args){
        // Shape shape = new Shape();
        // Circle circle = new Circle();
        // Triangle triangle = new Triangle();

        // System.out.prinltn(shape.area());
        // System.out.prinltn(circle.area());
        // System.out.prinltn(triangle.area());

        System.out.println(sum(2, 5));
        System.out.println(sum(2, 5, 3));
    }
}

// class Shape{
//     public void area(
//         System.out.println("This is an area of shape");
//     }
// }

// class Circle extends Shape{
//     public void area(){
//         System.out.println("This is an area of circle");
//     }
// }

// class Triangle extends Shape{
//     public void area(){
//         System.out.println("This is an area of triangle");
//     }
// }