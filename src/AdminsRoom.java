import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;

public class AdminsRoom {

    private ArrayList<HashMap<String,HashMap<String,String>>> workers=new ArrayList<HashMap<String,HashMap<String,String>>>();

    private HashMap<String,HashMap<String,String>> infoAboutTaxiWorkers=new HashMap<>();
    private HashMap<String,HashMap<String,String>> infoAboutDeliveryWorkers=new HashMap<>();
    private ArrayList<String> taxiIDs=new ArrayList<>();
    private ArrayList<String> deliveryIDs=new ArrayList<>();
    private String result="";
    private int numberResult=0;
    private boolean booleanResult=false;
    private Randomiser r=new Randomiser();
    private final String NAME="Name: ",SURNAME="Surname: ",CAR="Car: ",CARSNUMBER="Car's number: ",
    PHONE="Phone: ",STATUS="Status: ";


    protected boolean addWorkers(){
        booleanResult=true;
        return booleanResult;
    }
    protected boolean addTaxiWorker(String name,String surname,String car,String carsNumber,
                                String phone,String status){
        result="T-";
        result+=r.workersID();
        taxiIDs.add(result);
        HashMap<String,String> data=new HashMap<String,String>();
        data.put(NAME,name);
        data.put(SURNAME,surname);
        data.put(CAR,car);
        data.put(CARSNUMBER,carsNumber);
        data.put(PHONE,phone);
        data.put(STATUS,status);
        infoAboutTaxiWorkers.put(result,data);
        workers.add(infoAboutTaxiWorkers);

        return booleanResult=true;
    }
    protected boolean addDeliveryWorker(String name,String surname,String car,String carsNumber,
                                String phone,String status){
        result="D-";
        result+=r.workersID();
        deliveryIDs.add(result);
        HashMap<String,String> data=new HashMap<String,String>();
        data.put(NAME,name);
        data.put(SURNAME,surname);
        data.put(CAR,car);
        data.put(CARSNUMBER,carsNumber);
        data.put(PHONE,phone);
        data.put(STATUS,status);
        infoAboutDeliveryWorkers.put(result,data);
        workers.add(infoAboutDeliveryWorkers);

        return booleanResult=true;
    }

    public HashMap getTaxiWorkers(){
        return infoAboutTaxiWorkers;
    }
    public HashMap getDeliveryWorkers(){
        return infoAboutDeliveryWorkers;
    }

    /*
    public String getAvailableCARS(ArrayList<HashMap<String,HashMap<String,String>>> someWorkers,
                                     String ){
        numberResult=someWorkers.size();

        return result;
    }*/


}
