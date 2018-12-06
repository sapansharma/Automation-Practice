public class Parent {

    public static void main(String[] args){

        int a= 2;
        int b = 3;
        int Sum = a+b;
        System.out.println("Sum of " +a + " and " +b + " is " +Sum);

        Child c = new Child();
        System.out.println(c.test());
//        int x = c.test();
//        System.out.println(x+1);


    }
}
