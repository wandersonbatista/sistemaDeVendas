package Classes;

public class Users {
    private String codusuario;
    private String nome;
    private String sobrenome;
    private String senha;
    private int perfil;

    public Users(String codusuario, String nome, String sobrenome, String senha, int perfil) {
        this.codusuario = codusuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.perfil = perfil;
    }

    //Users(String wanderson, String batista, String string, String string0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    public String getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(String codusuario) {
        this.codusuario = codusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    public String tS() {
        return codusuario + "-"
        +nome + "-"
        +sobrenome + "-"
        +senha + "-"
        +perfil;
    } 
    
    
}
