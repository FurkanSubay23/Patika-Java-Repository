package Donguler;

public class Asal {
    public static void main(String[] args) {
        System.out.println("2");
        for (int i=3; i<=100;i++){
            boolean var =false;
            for (int j=2; j<i; j++){
                if (i % j ==0){
                    var = true;
                    break;
                }
            }
            if (var==false){
                System.out.println(i);
            }
        }
    }
}

