package OOP.Learn.test_2;

public class Test {
    public static void main(String[] args) {
        Teacher t=new Teacher();

        //赋值
        t.name="阿玮";
        t.age=18;

        //打印信息
        System.out.println(t.name);

        //让老师去干活
        //如果有参数的话，会自动传入
        t.teach();
        t.eat();
    }
}
