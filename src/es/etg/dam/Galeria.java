package es.etg.dam;

public class Galeria {

    public static final int TOTAL_OBRAS = 10;
    public static void main(String[] args) {
        
        Obra obra = new Obra();

        Thread alfarero = new Thread(new Alfarero(obra));
        Thread vendedor = new Thread(new Vendedor(obra));

        alfarero.start();
        vendedor.start();

    }

}
