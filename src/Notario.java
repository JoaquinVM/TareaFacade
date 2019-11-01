public class Notario {

    public String checkContrato(String codigoContrato){
        int i = codigoContrato.indexOf("#");
        String codigo = codigoContrato.substring(2, i);
        System.out.println("Se verifico el  contrato con codigo: " + codigoContrato);
        return "VIV" + codigo;
    }
}
