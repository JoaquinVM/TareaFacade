public class ClientNoFacade {
    public static void main(String[] args){

        Bancos bancos = new Bancos();
        Cooperativas cooperativas = new Cooperativas();
        FondoFinanciero fondoFinanciero = new FondoFinanciero();
        Abogados abogados = new Abogados();
        Notario notario = new Notario();
        Arquitectos arquitectos = new Arquitectos();


        int prestamo1 = 200;

        if(bancos.checkBanco("BancoSol") && cooperativas.checkCooperativa("Cooperativa1") && fondoFinanciero.checkPrestamo(prestamo1)){
            String codigoContrato = abogados.generarContrato(prestamo1);
            String codigoVivienda = notario.checkContrato(codigoContrato);
            arquitectos.elaborarPlanos(codigoVivienda);
            System.out.println("Se genero un prestamo de vivienda de " + prestamo1 + "\n");
        }else{
            System.out.println("No se pudo generar prestamo de " + prestamo1 + "\n");
        }

        int prestamo2 = 200000;

        if(bancos.checkBanco("MercantilSC") && cooperativas.checkCooperativa("Cooperativa2") && fondoFinanciero.checkPrestamo(prestamo2)){
            String codigoContrato = abogados.generarContrato(prestamo2);
            String codigoVivienda = notario.checkContrato(codigoContrato);
            arquitectos.elaborarPlanos(codigoVivienda);
            System.out.println("Se genero un prestamo de vivienda de " + prestamo2 + "\n");
        }else{
            System.out.println("No se pudo generar prestamo de " + prestamo2 + "\n");
        }

    }
}
