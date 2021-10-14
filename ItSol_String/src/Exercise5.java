
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời bạn nhập chuỗi ");
        String st = sc.nextLine();
        chuoiHoanDoi(st);

    }
    public static void chuoiHoanDoi(String s){
        StringTokenizer s1 = new StringTokenizer(s);      // phân tách 1 chuỗi thành các thành phần tử
        StringBuffer kq = new StringBuffer();
        String a[] = new String[100];
        int i = 1;
        while ((s1.hasMoreTokens())){
            a[i] = s1.nextToken();
            i++;
        }
        kq.append(a[1]).append(" ");
        kq.append(a[2]).append(" ");
        kq.append(a[3]).append(" ");
        System.out.println(kq);
    }
}
