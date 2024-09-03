package java8.LambdaExpression;

interface abc
{
    void display();
}
public class LamdaExpression1 {
    public static void main(String[] args) {
        abc ref=()->{
            System.out.println("test");
        };
        ref.display();
    }
}
