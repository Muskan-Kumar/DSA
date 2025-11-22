

public class Main{
    public static void main(String[] args){
        Box box1 = new Box();
        Box box2 = new Box(4);
        Box box3 = new Box(2.5, 3.5, 4.5);
        Box box4 = new Box(box2);

        System.out.println(box1.l + " " + box1.w + " " + box1.h);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);
        System.out.println(box3.l + " " + box3.w + " " + box3.h);
        System.out.println(box4.l + " " + box4.w + " " + box4.h);

        box1.display();

        BoxWeight box5 = new BoxWeight();
        BoxWeight box6 = new BoxWeight(1, 2, 3, 4);

        System.out.println(box5.weight);
        System.out.println(box5.l);
        System.out.println(box6.l + " " + box6.w + " " + box6.h + " " + box6.weight);

        // Box data type contain BoxWeight object
        Box box7 = new BoxWeight(5, 6, 7, 8);  // it is allow (parent class data type contain child class object)
        System.out.println(box7.h);

        // there are many variables in both parent and vhild class
        // you are given access to variables that are in the ref type i.e BoxWeight
        // hence, tou should have access to weight variables
        // this also means, that the ones you are trying to access should be initialized
        // but here, when the obj itself is of type parent class, hoe will you call the constructor of child class
        // this is why error

        // BoxWeight box8 = new Box(5, 6, 7);  // it is not allow (it gives error) bcz child cls data type not contain parent cls object
        // System.out.println(box8.h);

        BoxPrice box8 = new BoxPrice(1, 2, 3, 4, 5);
        System.out.println(box8.weight);

    }
}


class Box{
    double l;
    double w;
    double h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube
    Box(double side){

        // super() : object class
        
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void display(){
        System.out.println("Running the Box");
    }
}

class BoxWeight extends Box{
    double weight;
    
    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double w, double h, double weight){
        super(l, w, h);

        this.weight = weight;
    }
}

class BoxPrice extends BoxWeight{
    double price;

    public BoxPrice() {
        super();
        this.price = -1;
    }

    public BoxPrice(double price) {
        this.price = price;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }

    public BoxPrice(double l, double w, double h, double weight, double price) {
        super(l, w, h, weight);
        this.price = price;
    }

}