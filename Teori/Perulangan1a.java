class Perulangan1a{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
            if(i < 100){
                System.out.print(i + " + ");
            }
            else System.out.print(i);
        }
    System.out.println("\nHasil: " +sum);
    }
}