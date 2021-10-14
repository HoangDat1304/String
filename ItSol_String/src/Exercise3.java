import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        bai3 a = new bai3();
        a.nhapXau();
        a.xoaKhoangTrang();
        a.chuanHoa();
        System.out.println("xâu sau khi chuẩn hóa là :");
        a.hienThi();


    }
    public static class bai3{
        String st ="";

        public  void nhapXau(){
            Scanner sc = new Scanner(System.in);
            System.out.println(" mời bạn nhập xâu ");
            st = sc.nextLine();
        }
        public  void xoaKhoangTrang(){
            st = st.trim().toLowerCase();                        // trim xóa khoảng trắng đầu và cuối xâu
            st = st.replaceAll("\\s+" , "");     //(\\s gồm các khoảng trắng liên tục
        }
        public  void chuanHoa(){
            st = st.trim().toLowerCase();
            st = st.replaceAll("\\s+" , "");
            String[] tem = st.split("");
                                                                  // sau khi tách xong thì ta gán xâu st vào xâu rỗng
            st="";
            for(int i =0; i<tem.length;i++){
                st+=String.valueOf(tem[i].charAt(0)).toUpperCase() + tem[i].substring(1);
                if(i<tem.length-1)                                // nếu tem[i] không phải từ cuối cùng
                    st+=" ";                                       // cộng thêm một khoảng trắng
            }
        }
        public  void hienThi(){
            System.out.println(st);
        }
    }
}
