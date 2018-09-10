public class Main {
    public static void main(String[] args){
        for(int number = 1; number < 10000; number++){
            if(isPrime(number) == true){
                System.out.println("Prime Number is: "+number);
            }
        }
    }

    public static boolean isPrime(int number){
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }else {
            return false;
        }
    }
}
