import java.util.Scanner;
public class jpa103{
    public static void main(String[] args){
        System.out.print("Please input:");
        Scanner a = new Scanner(System.in);
            String a1=a.nextLine();     
            String[] a2=a1.split(" ");
            int[] b=new int[3];
            for (int i=0;i<3;i++){
                b[i]=Integer.parseInt(a2[i]);
            }
        System.out.println("Average: "+(b[0]+b[1]+b[2])/3);
        a.close();
    }
}