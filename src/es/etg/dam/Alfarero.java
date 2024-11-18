package es.etg.dam;

public class Alfarero implements Runnable {

    private Obra obra;

    public Alfarero(Obra o){
        obra = o;
    }

    @Override
    public void run() {
        for(int i = 1; i < Galeria.TOTAL_OBRAS; i++) {
            try {
                Thread.sleep((long)Math.random()*100);
                obra.exponer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }

}
