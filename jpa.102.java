import java.util.Scanner;
public class jpa102 {    
    public static void main(String[] args) {
        System.out.print("Piease import: ");
        Scanner a = new Scanner(System.in);
            float a1=a.nextFloat();
            System.out.println(a1+" kg = "+a1*2.20462+" ponds");
        a.close();
    }
}
