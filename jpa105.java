import java.util.Scanner;
public class jpa105 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("請輸入您的姓名 : ");
        String n = a.nextLine();
        System.out.println("Hi,"+n+",請輸入您的銅板數量 : ");
        System.out.print("請輸入1元的數量 : ");
        int n1 = a.nextInt();
        System.out.print("請輸入5元的數量 : ");
        int n2 = a.nextInt();
        System.out.print("請輸入10元的數量 : ");
        int n3 = a.nextInt();
        System.out.print("請輸入50元的數量 : ");
        int n4 = a.nextInt();
        int t=1*n1+5*n2+10*n3+50*n4;
        int p1=t/1000;
        int p2=t/100-p1*10;
        int p3=t/10-p2*10-p1*100;
        int p4=t-p3*10-p2*100-p1*1000;
        System.out.printf("您的前總共有 : %d 千 %d 百 %d 十 %d 元",p1,p2,p3,p4);
        a.close();
    }
}
