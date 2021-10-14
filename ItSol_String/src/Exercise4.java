import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập xâu ");
        String st = sc.nextLine();
        String[] input = st.split("");
        int index =0;
        int timMax = 0;
        for(int i=0; i<input.length;i++){
            int tim = input[i].length();
            if(tim > timMax){
                timMax = tim;
                index =i;
            }
        }
        System.out.println("từ :"+ input[index]+  "vị trí :" + (index+1)+ "độ dài :"+ timMax);

    }






}
