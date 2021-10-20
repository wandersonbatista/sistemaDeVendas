
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class Dados {
// USUÁRIOS:
    private int maxuser=50;
    private  Users muser[]= new Users[maxuser];
    private  int contuser=0;
// PRODUTOS:
    private int maxprod=100;
    private  Products mprod[]= new Products[maxprod];
    private  int contprod=0;
//CLIENTES:
    private int maxclient=80;
    private  Clients mclient[]= new Clients[maxclient];
    private  int contclient=0;
//VENDAS:
    private int nvendas=0;
     
    public Dados(){
//CADASTRO DE USUÁRIOS:
        fillUser();     
//CADASTRO DE PRODUTOS:
        fillProd();
//CADASTRO DE CLIENTES:
        fillCli();
//VENDAS:
        fillCfg();
    }
    
    
    public int nuser(){
        return contuser;
    }
    public int nprod(){
        return contprod;
    }
    public int ncli(){
        return contclient;
    }
    
    public Users[] getUsuarios(){
        return muser;
    }
    public Products[] getProducts(){
        return mprod;
    }
    public Clients[] getCli(){
        return mclient;
    }
            
    public boolean validaUser(String usuario, String senha){
        boolean x = false;
        for(int i=0;i<contuser;i++){
            if(muser[i].getCodusuario().equals(usuario)&& muser[i].getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
    public int getPerfil(String usuario){
        for(int i=0;i<contuser;i++){
            if(muser[i].getCodusuario().equals(usuario)){
                return muser[i].getPerfil();
            }
        }
        return -1;
    }
    public void changePass(String usuario, String senha){
        for(int i=0;i<contuser;i++){
            if(muser[i].getCodusuario().equals(usuario)){
                muser[i].setSenha(senha);
            }
        }
    }
    public int getNvendas(){
        return nvendas;
    }
    public void setNvendas(int nvendas){
        this.nvendas=nvendas;
    }
    
    
    public int LUser(String usuario){
        for(int i=0;i<contuser;i++){
            if(muser[i].getCodusuario().equals(usuario)){
                return i;
            }
        }
        return -1;
    } 
    public int LProd(String product){
        for(int i=0;i<contprod;i++){
            if(mprod[i].getCodproduct().equals(product)){
                return i;
            }
        }
        return -1;
    }
    public int LCli(String client){
        for(int i=0;i<contclient;i++){
            if(mclient[i].getCodclient().equals(client)){
                return i;
            }
        }
        return -1;
    }
    
    public String cadUser(Users mmuser){
        if (contuser==maxuser){
            return "SEM ESPAÇO DE ARMAZAENAMENTO PARA CADASTRAR NOVOS USUÁRIOS";
        }
        muser[contuser]=mmuser;
        contuser++;
        return "USUÁRIO CADASTRADO!";
    }
    public String cadProd(Products mmprod){
        if (contprod==maxprod){
            return "SEM ESPAÇO DE ARMAZAENAMENTO PARA CADASTRAR NOVOS PRODUTOS";
        }
        mprod[contprod]=mmprod;
        contprod++;
        return "PRODUTO CADASTRADO!";
    }
    public String cadCli(Clients mmcli){
        if (contclient==maxclient){
            return "SEM ESPAÇO DE ARMAZAENAMENTO PARA CADASTRAR NOVOS CLIENTES";
        }
        mclient[contclient]=mmcli;
        contclient++;
        return "CLIENTE CADASTRADO!";
    }
   
    public String edUser(Users mmuser, int posline){
        muser[posline].setNome(mmuser.getNome());
        muser[posline].setSobrenome(mmuser.getSobrenome());
        muser[posline].setSenha(mmuser.getSenha());
        muser[posline].setPerfil(mmuser.getPerfil());
        
        return "USUÁRIO EDITADO!";
    }
    public String edProd(Products mmprod, int posline){
        mprod[posline].setDescproduct(mmprod.getDescproduct());
        mprod[posline].setObs(mmprod.getObs());
        mprod[posline].setPrice(mmprod.getPrice());
        mprod[posline].setTxproduct(mmprod.getTxproduct());
        
        return "PRODUTO EDITADO!";
    }
    public String edCli(Clients mmcli, int posline){
        mclient[posline].setIdentclient(mmcli.getIdentclient());
        mclient[posline].setName(mmcli.getName());
        mclient[posline].setSname(mmcli.getSname());
        mclient[posline].setEndereco(mmcli.getEndereco());
        mclient[posline].setTel(mmcli.getTel());
        mclient[posline].setCity(mmcli.getCity());
        mclient[posline].setNascd(mmcli.getNascd());
        mclient[posline].setSalesd(mmcli.getSalesd());
        mclient[posline].setEmail(mmcli.getEmail());
        
        return "CLIENTE EDITADO!";
    }
    
    public String delUser(int posline){
        for(int i=posline; i<contuser-1;i++){
            muser[i]=muser[i+1];
        }
        contuser--;
        return "USUÁRIO DELETADO!";
    }
    public String delProd(int posline){
        for(int i=posline; i<contprod-1;i++){
            mprod[i]=mprod[i+1];
        }
        contprod--;
        return "PRODUTO DELETADO!";
    }
    public String delCli(int posline){
        for(int i=posline; i<contclient-1;i++){
            mclient[i]=mclient[i+1];
        }
        contclient--;
        return "CLIENTE DELETADO!";
    }
    
    public void Cg(){
        saveUsers();
        saveProds();
        saveCli();
        saveCfg();
    }
    public void saveUsers(){
        FileWriter fw=null;
        PrintWriter pw=null;
        try{
            fw= new FileWriter("BD/users.txt");
            pw= new PrintWriter(fw);
            
            for(int i=0; i<contuser;i++){
                pw.println(muser[i].tS());
            }
        }catch(Exception e1){
            e1.printStackTrace(); 
        }finally{
            try{
                if(fw!=null){
                    fw.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();            
            }
        }
    }
    public void saveProds(){
        FileWriter fw=null;
        PrintWriter pw=null;
        try{
            fw= new FileWriter("BD/prods.txt");
            pw= new PrintWriter(fw);
            
            for(int i=0; i<contprod;i++){
                pw.println(mprod[i].tS());
            }
        }catch(Exception e1){
            e1.printStackTrace(); 
        }finally{
            try{
                if(fw!=null){
                    fw.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();            
            }
        }
    }
    public void saveCli(){
        FileWriter fw=null;
        PrintWriter pw=null;
        
        try{
            fw= new FileWriter("BD/clients.txt");
            pw= new PrintWriter(fw);
            
            for(int i=0; i<contclient;i++){
                pw.println(mclient[i].tS());
            }
        }catch(Exception e1){
            e1.printStackTrace(); 
        }finally{
            try{
                if(fw!=null){
                    fw.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();            
            }
        }
    }
    public void saveCfg(){
        FileWriter fw=null;
        PrintWriter pw=null;
        try{
            fw= new FileWriter("BD/cfgsale.ini");
            pw= new PrintWriter(fw);
            
            pw.println("[Geral]");
            pw.println("VendaAtual="+nvendas);
            
        }catch(Exception e1){
            e1.printStackTrace(); 
        }finally{
            try{
                if(fw!=null){
                    fw.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();            
            }
        }
    }
    
    private void fillUser(){
        File arq=null;
        FileReader fr=null;
        BufferedReader br=null;
        try{
            arq= new File("BD/users.txt");
            fr= new FileReader(arq);
            br= new BufferedReader(fr);
            
            int ps;
            String aux;
            String line;
            
            String codusuario;
            String nome;
            String sobrenome;
            String senha;
            int perfil;
            
            while((line=br.readLine())!=null){
                //CARREGANDO CODIGO DO USUÁRIO:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                codusuario=aux;
                line=line.substring(ps+1);
                
                //CARREGANDO NOME:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                nome=aux;
                line=line.substring(ps+1);
                
                //CARREGANDO SOBRENOME:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                sobrenome=aux;
                line=line.substring(ps+1);
                
                //CARREGANDO SENHA E PERFIL:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                senha=aux;
                line=line.substring(ps+1);
                perfil=new Integer(line);
                
                Users muses;
                muses= new Users(codusuario,nome,sobrenome,senha,perfil);
                muser[contuser]=muses;
                contuser ++;
            }
        }catch(Exception e1){
            e1.printStackTrace(); 
        }finally{
            try{
                if(fr!=null){
                    fr.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
    private void fillProd(){
        File arq=null;
        FileReader fr=null;
        BufferedReader br=null;
        try{
            arq= new File("BD/prods.txt");
            fr= new FileReader(arq);
            br= new BufferedReader(fr);
            
            int ps;
            String aux;
            String line;
            
            String codproduct;
            String descproduct;
            String obs;
            int price;
            int txproduct;
            
            while((line=br.readLine())!=null){
                //CARREGANDO CODIGO DO PRODUTO:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                codproduct=aux;
                line=line.substring(ps+1);
                
                //CARREGANDO DESCRIÇÃO DO PRODUTO:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                descproduct=aux;
                line=line.substring(ps+1);
                
                //CARREGANDO OBS DO PRODUTO:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                obs=aux;
                line=line.substring(ps+1);
                
                //CARREGANDO PREÇO E TAXA DO PRODUTO:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                price=new Integer(aux);
                line=line.substring(ps+1);
                txproduct=new Integer(line);
                
                Products mprods;
                mprods= new Products(codproduct, descproduct,obs,price, txproduct);
                mprod[contprod]=mprods;
                contprod ++;
            }
        }catch(Exception e1){
            e1.printStackTrace(); 
        }finally{
            try{
                if(fr!=null){
                    fr.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
    private void fillCli(){
        File arq=null;
        FileReader fr=null;
        BufferedReader br=null;
        try{
            arq= new File("BD/clients.txt");
            fr= new FileReader(arq);
            br= new BufferedReader(fr);
            
            int ps;
            String aux;
            String line;
            
            String codclient;
            int identclient;
            String name;
            String sname;
            String endereco;
            String tel;
            int city;
            Date nascd;
            Date salesd;
            String email;
            
            while((line=br.readLine())!=null){
                //CARREGANDO CODIGO DO CLIENTE:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                codclient=aux;
                line=line.substring(ps+1);
                
                //CARREGANDO ID DO CLIENTE:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                identclient=new Integer (aux);
                line=line.substring(ps+1);
                
                //CARREGANDO NOME DO CLIENTE:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                name=aux;
                line=line.substring(ps+1);
                
                //CARREGANDO SOBRENOME DO CLIENTE:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                sname=aux;
                line=line.substring(ps+1);
                
                //CARREGANDO ENDEREÇO DO CLIENTE:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                endereco=aux;
                line=line.substring(ps+1);
                
                //CARREGANDO TELEFONE DO CLIENTE:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                tel=aux;
                line=line.substring(ps+1);
                
               //CARREGANDO CIDADE DO CLIENTE:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                city=new Integer (aux);
                line=line.substring(ps+1);
                                
                //CARREGANDO DATA DE NASCIMENTO DO CLIENTE:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                nascd=Utility.stDt(aux);
                line=line.substring(ps+1);
                
                //CARREGANDO DATA DE VENDA DO CLIENTE:
                ps=line.indexOf("-");
                aux=line.substring(0,ps);
                salesd=Utility.stDt(aux);
                line=line.substring(ps+1);
               
                //CARREGANDO EMAIL DO CLIENTE:
                email=aux;
                
                
                
                Clients mclients;
                mclients= new Clients(codclient,identclient,name,sname,endereco,tel,city,nascd,salesd,email);
                mclient[contclient]=mclients;
        contclient ++;
            }
        }catch(Exception e1){
            e1.printStackTrace(); 
        }finally{
            try{
                if(fr!=null){
                    fr.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
    private void fillCfg(){
        File arq=null;
        FileReader fr=null;
        BufferedReader br=null;
        
        try{
            arq= new File("BD/cfgsale.ini");
            fr= new FileReader(arq);
            br= new BufferedReader(fr);
            
            String line;
            while((line=br.readLine())!=null){
                if(line.startsWith("VendaAtual=")){
                    nvendas= new Integer(line.substring(11));
                }   
            }
        }catch(Exception e1){
            e1.printStackTrace(); 
        }finally{
            try{
                if(fr!=null){
                    fr.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
    
}