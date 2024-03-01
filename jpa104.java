
import java.util.Scanner;
public class jpa104 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("輸入第1組的x和y座標 : ");
        String a1=a.nextLine();
        System.out.print("輸入第2組x和y座標 : ");
        String b1=a.nextLine();
        String[] a2=a1.split(" ");
        String[] b2=b1.split(" ");
        float[] x={Float.parseFloat(a2[0]),Float.parseFloat(b2[0])};
        float[] y={Float.parseFloat(a2[1]),Float.parseFloat(b2[1])};
        double h=Math.sqrt(Math.pow(x[0]-x[1],2)+Math.pow(y[0]-y[1],2));
        System.out.printf("介於<%.2f,%.2f>和<%.2f,%.2f>之間的距離是%.2f",x[0],y[0],x[1],y[1],h);
    a.close();
    }
}
