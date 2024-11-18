package es.etg.dam;

public class Vendedor implements Runnable {

    private Obra obra;

    public Vendedor(Obra o) {
        obra = o;
    }

    @Override
    public void run() {
        for(int i = 1; i < Galeria.TOTAL_OBRAS; i++) {
            try {
                Thread.sleep((long)Math.random()*100);
                obra.vender();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }

}
