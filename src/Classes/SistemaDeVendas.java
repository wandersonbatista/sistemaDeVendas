package Classes;
import Formulários.frmLog;

public class SistemaDeVendas {

    public static void main(String[] args) {
        Dados clsDados= new Dados();
        frmLog Login= new frmLog();
        Login.setDados(clsDados);
        Login.setLocationRelativeTo(null); 
        Login.setVisible(true);
        
    }
    
}
