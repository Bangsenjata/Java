public class Perulangan2a {
    public static void main(String[] args){
        int sum = 0;
        for(int count = 0; count < 10; count++){
            sum += count;
            if(count < 9){
                System.out.print(count + " + ");
            }
            else System.out.print(count);
        }
    System.out.println("\nHasil: " +sum);
    }
}
