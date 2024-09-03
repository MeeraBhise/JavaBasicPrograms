package java8.LambdaExpression;

interface Java2
{
    void run(String s,String m);
}

public class LambdaExpression2 {
    public static void main(String[] args) {
       Java2 ref=(String s,String s1)->
       {
           System.out.println("String1:"+s+"String2:"+s1);
       };
        ref.run("meeera","mehae");
    }
}
