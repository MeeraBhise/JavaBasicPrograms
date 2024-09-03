package java8.LambdaExpression;
 interface Java1
 {
     void Displayy(String s,int a);
 }
public class LambdaExpression {
    public static void main(String[] args) {
      Java1 ref=(String st,int bb)-> {
          System.out.println("String:"+st+ "Int :"+bb);
        };
        ref.Displayy("meera",101);
    }
}
