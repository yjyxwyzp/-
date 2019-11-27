import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int sum=0;
            int first=0;
        String str = sc.nextLine().toUpperCase();
        String strs = sc.nextLine().toUpperCase();
        String[] strss=strs.split(" ");
        for(int i = 0;i<strss.length;i++){
            if(str.equals(strss[i])){
                    sum++;
            }
        }
        if(sum==0){
            System.out.println(-1);
        }else{

            System.out.print(sum);
            if(str.equals(strss[0])){
                System.out.println(" "+0);
            }else {
                System.out.print(" " +(strs.indexOf(" " + str + " ")+1));
            }

        }
            System.out.println();
        }
    }
}
