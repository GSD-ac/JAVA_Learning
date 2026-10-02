package OOP.Learn.test_3_private_get_set;

public class Test {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.setName("朵朵");
        d.setAge(10);

        //打印的时候调用函数也必须带括号
        System.out.println(d.getName());
        System.out.println(d.getAge());
        
    }
}
