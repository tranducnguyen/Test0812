package loop;

public class LoopDemo {
    public static void main(String[] args) {
        // In ra tu 1 -> 100 su dung vong lap for
        /*for (int i = 1; i <= 100; i++){
            if (i == 50){
                continue;
            }
            System.out.println(i);
            if (i == 50){
                break;
            }
        }*/

        //In ra tu 1 -> 100 su dung vong lap while
        /*
        int i= 1;
        while (i <= 100){
            System.out.println(i);
            i ++;
        }
        */

        //Su dung do-While
        int a = 1;
        int sum = 0;
        do{
            sum =+ a; // ketqua = 1 + 2 + 3 + 4 + 5
            a++;
        }while (a <= 5);
        System.out.println(sum);

    }
}
