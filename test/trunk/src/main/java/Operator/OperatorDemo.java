package Operator;

public class OperatorDemo {
    public static void main(String[] args) {
        /*Toan tu so hoc*/
        int x = 9;
        x += 1; //x=x+1;
        System.out.println(x);

        //Chia lay du
        int y = x%3;
        System.out.println(y);

        /*Toan tu quan he*/
        if(y == x){
            System.out.println("y = x = "+ y);
        }else if(y != x){
            System.out.println("y != x va y = "+ y);
        }

        /*Toan tu logic*/
        if(!(y == x || x > 0)){
            System.out.println("y = x va y = "+ y);
            System.out.println("x > 0");
        }

        /*Toan tu dieu kien*/
        int j = 0;
        j = x > 0 ? 10 : -10;
        System.out.println("Gia tri j = "+j);
    }
}
