public class Math {
    int value;
    int exp;
    int pow;
    String feature;

    //CONSTRUCTOR

    public Math(int value){
        this.value = value;
        this.feature = feature();
    }

    //EXPONENTIATION

    private int quad(){
        int x = 1;
        for( int i = 0 ; i < this.exp ; i++ ){ x *= this.value; }
        return x;
    }

    //VALUE IS POSITIVE OR NEGATIVE?

    private String feature(){ return this.value < 0 ? "Negativo" : "Positivo"; }

    //RELOADS THE METHODS OF THE OBJECT

    public void att(){
        this.pow = quad();
        this.feature = feature();
    }
}
