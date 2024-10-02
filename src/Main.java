
public class Main {
    public static int sumOfSquares(int ... nums){
        int sum=1;
        for(int i: nums){
            sum*=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int answer=sumOfSquares(1,2,3,4,5,6);
        System.out.println(answer);
    }
}