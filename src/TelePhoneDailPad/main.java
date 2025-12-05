package TelePhoneDailPad;

public class main {
    public static void main(String[] args) {
        int rows =4;
        int col =3;
        char [][] tel = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'#','0','*'}
        };



        for (int i = 0; i < tel.length; i++){  // is a array with all the arrays address
            for (int j = 0; j< tel[0].length; j++){
                System.out.print(tel[i][j]+" ");


            }
            System.out.println();

        }

    }
}
