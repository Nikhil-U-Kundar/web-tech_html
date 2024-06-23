public class Methods {
    public static void main(String[] args) {
        greet();
        greet1();
        sum(2,4);
    }
    static void greet(){
        System.out.println("hello nikhil ethod called first time");
    }
    static void greet1(){
        walk(); 
        System.out.println("method called second time");
    }
    static void walk(){
        System.out.println("walk method is called here");
    }
    static void sum(int a,int b){
        float c=a+b; //result is stored in float
        System.out.println("sum is "+c);
    }
    static int minimum(int a,int b){
        return a*b;
    }
}
