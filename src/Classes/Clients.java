
package Classes;

//import java.sql.Date;
import java.util.Date;

public class Clients {
    private String codclient;
    private int identclient;
    private String name;
    private String sname;
    private String endereco;
    private String tel;
    private int city;
    private Date nascd;
    private Date salesd;
    private String email;

    public Clients(String codclient, int identclient, String name, String sname, String endereco, String tel, int city, Date nascd, Date salesd, String email) {
        this.codclient = codclient;
        this.identclient = identclient;
        this.name = name;
        this.sname = sname;
        this.endereco = endereco;
        this.tel = tel;
        this.city = city;
        this.nascd = nascd;
        this.salesd = salesd;
        this.email = email;
    }

    public String getCodclient() {
        return codclient;
    }
    public void setCodclient(String codclient) {
        this.codclient = codclient;
    }

    public int getIdentclient() {
        return identclient;
    }
    public void setIdentclient(int identclient) {
        this.identclient = identclient;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getCity() {
        return city;
    }
    public void setCity(int city) {
        this.city = city;
    }

    public Date getNascd() {
        return nascd;
    }
    public void setNascd(Date nascd) {
        this.nascd = nascd;
    }

    public Date getSalesd() {
        return salesd;
    }
    public void setSalesd(Date salesd) {
        this.salesd = salesd;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String tS() {
        return codclient + "-"
        +identclient + "-"
        +name + "-"
        +sname + "-"
        +endereco + "-"
        +tel + "-" 
        +city + "-"
        +Utility.fDt(nascd) + "-"
        +Utility.fDt(salesd) + "-"
        +email;
 
    }
   
}
