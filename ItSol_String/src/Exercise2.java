import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập chuỗi ");
        String a = sc.nextLine();
        String a1 = a.toLowerCase();// toLowerCase cho ký tự viết hoa thành thường
        String kt;

        for(int i = 0 ; i <a.length();i+=2){
            kt = a1.substring(i,i+1);
            a1 = a1.replaceAll(kt , kt.toUpperCase());
        }
        System.out.println(a1);
    }
}
