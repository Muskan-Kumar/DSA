
public class Abstract{
    public static void main(String[] args){
        Son son = new Son(12);
        Daughter daughter = new Daughter(12);

        son.career();
        System.out.println(son.age);
        daughter.career();
    }
}

abstract class Parent{

    int age;
    
    Parent(int age){
        this.age = age;
    }

    abstract void career();
    abstract void partner();
}

class Son extends Parent{
    public Son(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void partner(){
        System.out.println("I love Neha");
    }

}

class Daughter extends Parent{
    public Daughter(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("I am going to be a Coder");
    }

    @Override
    void partner(){
        System.out.println("I love Muskan");
    }
}