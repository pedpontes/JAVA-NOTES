import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in); //INSTANCIANDO O SCANNER EM INPUT

        System.out.print("\nNumero: ");
        int value = input.nextInt();    //"SCANF()" IN C

        System.out.print("Expoente: ");
        int exp = input.nextInt();

        input.close();  //EVER NEED CLOSE SCANNER

        Math math = new Math(value);
        math.exp = exp;
        math.att();
        
        System.out.println("VALOR: " + math.value); 
        System.out.println("EXPOENTE: " + math.exp);
        System.out.println("SINAL: " + math.feature);
        System.out.println("POW: " + math.pow);
    }
}


