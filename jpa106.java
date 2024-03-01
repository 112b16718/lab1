public class jpa106 {
    
    public static void main(String[] args) {
        System.out.printf("f(-3.2) = %.4f",f(-3.2));
        System.out.printf("\nf(-2.1) = %.4f",f(-2.1));
        System.out.printf("\nf(0.0) = %.4f",f(0.0));
        System.out.printf("\nf(2.1) = %.4f",f(2.1));
    }

    public static Double f(Double a){
        Double ans=3*(Math.pow(a,3))+2*a-1;
        return ans;
    }
}
