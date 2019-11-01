public class SolicitudPrestamoVivienda {

    Bancos bancos;
    Cooperativas cooperativas;
    FondoFinanciero fondoFinanciero;
    Abogados abogados;
    Notario notario;
    Arquitectos arquitectos;

    public SolicitudPrestamoVivienda(){
        bancos = new Bancos();
        cooperativas = new Cooperativas();
        fondoFinanciero = new FondoFinanciero();
        abogados = new Abogados();
        notario = new Notario();
        arquitectos = new Arquitectos();
    }

    public void solicitarPrestamo(int monto, String banco, String cooperativa){
        if(bancos.checkBanco(banco) && cooperativas.checkCooperativa(cooperativa) && fondoFinanciero.checkPrestamo(monto)){
            String codigoContrato = abogados.generarContrato(monto);
            String codigoVivienda = notario.checkContrato(codigoContrato);
            arquitectos.elaborarPlanos(codigoVivienda);
            System.out.println("Se genero un prestamo de vivienda de " + monto + "\n");
        }else{
            System.out.println("No se pudo generar prestamo de " + monto + "\n");
        }
    }

}
