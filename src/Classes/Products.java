package Classes;

public class Products {
    private String codproduct;
    private String descproduct;
    private String obs;
    private int price;
    private int txproduct;

    public Products(String codproduct, String descproduct, String obs, int price, int txproduct) {
        this.codproduct = codproduct;
        this.descproduct = descproduct;
        this.obs = obs;
        this.price = price;
        this.txproduct = txproduct;
    }

    public String getCodproduct() {
        return codproduct;
    }

    public void setCodproduct(String codproduct) {
        this.codproduct = codproduct;
    }

    public String getDescproduct() {
        return descproduct;
    }

    public void setDescproduct(String descproduct) {
        this.descproduct = descproduct;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTxproduct() {
        return txproduct;
    }

    public void setTxproduct(int txproduct) {
        this.txproduct = txproduct;
    }
    public String tS() {
        return codproduct + "-"
        +descproduct + "-"
        +obs + "-"
        +price + "-"
        +txproduct;
    }  
}
