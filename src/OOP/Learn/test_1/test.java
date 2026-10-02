package OOP.Learn.test_1;

public class test {
    public static void main(String[] args) {
        //朵朵是我养的第一只狗，一只很可爱的棕色小泰迪，它最后得了癌症，走丢了......
        Dog d=new Dog();
        d.name="朵朵";
        d.age=10;
        d.weight=13.5;
        d.color="brown";

        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.weight);
        System.out.println(d.color);
    }
}
