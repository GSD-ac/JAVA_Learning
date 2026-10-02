package OOP.Learn.test_3_private_get_set;

public class Dog {
    private String name;
    private int age;
    //私有化成员变量，防止年龄不合理

    //get/set

    //name
    //name是将来赋的值
    public void setName(String name) {
        this.name=name;
    }
    public String getName(){
        return name;
    }

    //age
    public void setAge(int age){
        if (age >=0&& age <=15){
            this.age= age;
        }
        else{
            System.out.println("当前age不在合理范围");
        }
    }
    public int getAge(){
        return age;
    }
}
