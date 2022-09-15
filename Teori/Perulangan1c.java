public class Perulangan1c {
    public static void main(String[] args){
        long productof = 1;
        for(int i = 5; i <= 50; i+=5){
            productof *= i;
            if(i < 50){
                System.out.print(i + " x ");
            }
            else System.out.print(i);
        }
    System.out.println("\nHasil: " +productof);
    }
}
