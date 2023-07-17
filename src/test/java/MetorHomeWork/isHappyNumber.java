package MetorHomeWork;

public class isHappyNumber {
    public static void main(String[] args) {
        int num = 82;
        System.out.println(isHappy(num));
    }
    public static int isHappy(int number){
        int rem =0, sum =0;
        while(number!=1)
        {
            rem = number%10;
            sum = sum+ (rem * rem);
            number = number/10;
        }
        return sum;
    }
}
