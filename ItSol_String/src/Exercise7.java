import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập xâu 1");
        String s1 = sc.nextLine();
        System.out.println("mời bạn nhập xâu 2");
        String s2 = sc.nextLine();
        int a = s2.length();
        String b = new String();
        String kt ;
        System.out.println(" các vị trí của s2 trong s1 :");
        for(int i=0;i<s1.length()-a+1;i++){
            kt=s1.substring(i, i+a);
            if(kt.equals(s2)){
                System.out.printf(i+"  ");
            }
        }
        s1 = s1.replaceAll(s2,b);
        System.out.println(" xâu s2 bị xâu s1 xóa : ");
        System.out.println(s1);
    }

}
