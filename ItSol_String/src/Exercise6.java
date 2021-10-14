import java.util.*;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập 1 câu : ");
        String st = sc.nextLine();
        boolean check = false;
        do {
            String[] a = st.split("\\s");
            if (a.length > 20) {
                System.out.println("Câu phải nhỏ hơn 20 : ");
                check = false;
            } else {
                int count = 0;
                for (int i = 0; i < a.length; i++) {
                    if (a[i].length() > 10) {
                        count += 1;
                    }
                }
                if (count > 0) {
                    System.out.println("mời bạn nhập lại chuỗi : ");
                    check = true;
                } else {
                    check = false;
                }
            }
        } while (check);
        sapXepAlphab(st);
    }

    public static void sapXepAlphab(String s) {
        StringTokenizer s1 = new StringTokenizer(s);
        ArrayList<String> arr = new ArrayList<>();
        while (s1.hasMoreTokens()) {
            String s2 = s1.nextToken();
            arr.add(s2);
        }
        Collections.sort(arr);
        System.out.println(arr.toString());
    }

}
