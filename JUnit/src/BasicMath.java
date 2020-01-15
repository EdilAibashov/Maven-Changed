public class BasicMath {
    public static void main(String[] args) {
        BasicMath m = new BasicMath();
        String expect1 = "Edil";
        String act = "Edil";
        double expect = 8;
        double actual = m.divide(16,2);
//        if (actual != expect){
//            System.out.println("Test failed");
//        }else
//            System.out.println("God it man!");


    }
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public double divide (double a, double b){
        return a/b;
    }
    public String str(String a){
        return a;
    }

}
