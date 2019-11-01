public class ClientFacade {
    public static void main(String[] args){
        SolicitudPrestamoVivienda spv = new SolicitudPrestamoVivienda();
        spv.solicitarPrestamo(200, "BancoSol", "Cooperativa1");
        spv.solicitarPrestamo(2000000, "MercantilSC", "Cooperativa2");
        spv.solicitarPrestamo(600, "BNB", "Cooperativa1");
    }
}
