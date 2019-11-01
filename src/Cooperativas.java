public class Cooperativas {

    public boolean checkCooperativa(String cooperativa){
        if(cooperativa.equals("Cooperativa1") || cooperativa.equals("Cooperativa2")){
            System.out.println("Cooperativa: " + cooperativa + " fue verificada");
            return true;
        }
        System.out.println("No se pudo verificar la cooperativa");
        return false;
    }


}
