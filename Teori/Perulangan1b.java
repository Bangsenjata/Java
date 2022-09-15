public class Perulangan1b {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 2; i <= 500; i+=2){
            sum += i;
            if(i < 500){
                System.out.print(i + " + ");
            }
            else System.out.print(i);
        }
    System.out.println("\nHasil: " +sum);
    }
}
