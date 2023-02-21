public class App {
    public static void main(String[] args) throws Exception {
        
        //NUMEROS INTEIROS

        byte value; //valores entre -128 e 127 (8bits)
        short value1;   //valores entre -32768 e 32767 (16bits)
        int value2; //valores entre -2147483648 e 2147483647 (32bits)
        long value3;    //valores grandiosos, tamanho de 64bits

        //VALORES FLUTUANTES(DECIMAIS)

        float value4;   //Recebe valores com decimais
        double value5;  //Também recebe valores decimais, só que com maior quantidade de memória alocada 

        //CARACTERES

        char caracter;  //Valores positivos iniciado em 0 (16bits)
        String nome = "Pedro Augusto";   //Recebe string/frase

        //TRUE OU FALSE

        boolean true_or_false;  //Só recebe 2 valores (TRUE OU FALSE) (1bit)

        //TIPOS DE CONSTANTES

        final int valor;    //Pode ser atribuido valor em qualquer parte do codigo somente uma vez
    }
}
