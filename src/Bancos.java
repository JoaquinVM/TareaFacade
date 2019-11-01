public class Bancos {

    public boolean checkBanco(String banco){
        if(banco.equals("BancoSol") || banco.equals("MercantilSC")){
            System.out.println("Banco: " + banco + " fue verificado");
            return true;
        }
        System.out.println("No se pudo verificar el banco");
        return false;
    }
}
