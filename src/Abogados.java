import java.util.Random;

public class Abogados {

    public String generarContrato(int monto){
        Random r = new Random();
        int codigo = r.nextInt(1000000);
        String codigoContrato = "CT" + codigo + "#" + monto;
        System.out.println("Se genero contrato con codigo: " + codigoContrato);
        return codigoContrato;
    }

}
