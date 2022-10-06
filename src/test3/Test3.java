package test3;

public class Test3 {

    public static void main(String[] args) {
        int razM = 15;
        for (int i=0; i < (razM+1)/2; i++){
            for(int j=0; j < razM; j++){
                if(j >= i && j <= razM - i -1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            
            }
            System.out.println("");
            
        }
        razM = 16;
        int kol = 0;
        for (int i=0; i < razM; i++){
            if(i < (razM+1)/2){
                kol++;
            }else{
                kol--;
            }
            for(int j=0; j < kol; j++){
                    System.out.print("*  ");
            }
            System.out.println("");
            
        }
    }
    
    
}
