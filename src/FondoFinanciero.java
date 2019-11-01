public class FondoFinanciero {

    private int fondos;

    public FondoFinanciero(){
        this.fondos = 10000;
    }

    public boolean checkPrestamo(int monto){
        if(fondos >= monto){
            fondos -= monto;
            System.out.println("Existen fondos suficientes para realizar el prestamo");
            return true;
        }
        System.out.println("No existen fondos suficientes para realizar el prestamo");
        return false;
    }

}
