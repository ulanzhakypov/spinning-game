import java.util.ArrayList;
import java.util.HashMap;

public class Workers {
    private String result="";
    private boolean booleanResult=false;
    private byte numberResult=0;
    AdminsRoom adminsRoom=new AdminsRoom();
    HashMap<String,HashMap<String,String>> info = new HashMap<>();

    public void setBusyTaxi(){

    }

    public String getAvailableTaxi(){
        info=adminsRoom.getTaxiWorkers();
        info.get(adminsRoom);
        return result;
    }

    public String getAvailableDeliverers(){
        info=adminsRoom.getDeliveryWorkers();
        return result;
    }

}
