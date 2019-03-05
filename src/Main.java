
public class Main {
    public static boolean asalMi (int sayi){
        for(int j = 2; j < sayi; j++){
            if (sayi % j == 0){
                return false;
            }
        }
        return true;
    
    }
    public static void main(String[] args) {
        for(int i =2; i<1000; i ++){
            if (asalMi(i)){
                System.out.println(i);
            }
        }
        
    }
    
}
