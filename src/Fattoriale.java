public class Fattoriale extends Thread{
    private int val;

    public Fattoriale(String n, int val) {
        super(n);
        this.val = val;
    }
    
    public int getVal() {
        return val;
    }
    
    public int fattoriale(int x) throws NumeroNonValido{
        if (x < 0 ) {
            throw new NumeroNonValido();
        } else {
            for (int i = x; i > 2; i--) {
                x = x * (x - 1);
            }
        }
        return x;
    }

    public void run(){
        try {
            val = fattoriale(val);
        } catch (NumeroNonValido e) {
            System.out.println("errore: numero non valido");
        }
    }
}