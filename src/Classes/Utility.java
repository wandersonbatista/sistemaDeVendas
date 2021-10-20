
package Classes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {
    public static boolean isNum(String Numero){
        try{
            Integer.parseInt(Numero);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public static Date stDt(String dt){
        SimpleDateFormat fttext=new SimpleDateFormat("yyyy/MM/dd");
        Date x= null;
        
        try{
            x=fttext.parse(dt);
        }catch(ParseException ex){
        }
        return x;
    }
    public static String fDt(Date dt){
        SimpleDateFormat ftxt = new SimpleDateFormat("yyyy/MM/dd");
        return ftxt.format(dt);
    }
    public static int objToInt(Object obj){
        int numint = Integer.parseInt(objToSt(obj));
        return numint;
    }
    public static double objToDbl(Object obj){
        String st=obj.toString();
        double ndbl=Double.valueOf(st).doubleValue();
        return ndbl;
    }
    public static boolean objToBool(Object obj){
        String cdbool=objToSt(obj);
        Boolean bool= new Boolean(cdbool);
        return bool;
    }
    public static String objToSt(Object obj){
        String str= "";
        if(obj!=null){
            str=obj.toString();
        }
        return str;
    }    
}
