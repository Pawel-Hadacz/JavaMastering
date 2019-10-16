package mastering.repetition;

public class DigitonalStar {
    public static void printSquareStar(int number){
        String star = "*";
        int cout = 1;
        int Orginalnum = number;
        if(number>=5){
            for(int i = 1;i<=number;i++){
                for(int j = 1; j <= number;j++){
                        if( j == 1 || j == number || i == 1 || i == number || i == j || (i == (number - j + 1))){
                        System.out.print(star);
                        }
                        else {
                            System.out.print(" ");
                        }
                }
                System.out.println();
            }

        }else {
            System.out.println("Invalid Value");
        }
    }
}
