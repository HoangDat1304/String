public class Exercise1 {
    public static void main(String[] args) {
        int dem = 0;
        for(int i = 100000 ; i<999999 ;i++){
            if(soThuanNghich(i)){
                System.out.println(i);
                dem++;
            }
        }
        System.out.println("số thuận nghịch có 6 chữ số là :" + dem);

    }
    public  static boolean soThuanNghich(int n){
        String number = String.valueOf(n); // chuyển đổi n thành chuỗi
        int size = number.length();
        for(int i = 0 ; i < size/2 ; i++){
            if(number.charAt(i) != number.charAt(size-i-1)){
                return false;
            }
        }
        return  true;
    }
}
