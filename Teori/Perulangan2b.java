public class Perulangan2b {
    public static void main(String[] args){
        int sum = 0;
        for(int count = 1; count <= 30; count+=3){
            sum += count;
            if(count < 30-3){
                System.out.print(count + " + ");
            }
            else System.out.print(count);
        }
    System.out.println("\nHasil: " +sum);
    }
}
