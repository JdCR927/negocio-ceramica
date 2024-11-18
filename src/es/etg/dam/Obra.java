package es.etg.dam;

public class Obra {

    private static final int TAMANYO_OBRAS = 1;

    private byte numObras = 0;


    public synchronized void exponer() throws InterruptedException {

        if(numObras >= TAMANYO_OBRAS ) {
            this.wait();
        }

        numObras++;
        System.out.println("Se ha expuesto una obra");
        this.notify();
    }

    public synchronized void vender() throws InterruptedException {
        if (numObras == 0) {
            this.wait();
        }

        numObras--;
        System.out.println("Se ha vendido una obra");
        this.notify();
    }

}
