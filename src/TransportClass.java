import java.util.*;

public class TransportClass {

    private long id;
    private String firstname;
    private String lastname;
    private String address;

    private String idJourney;
    private String desc;
    private int nbrOfPlace;
    private Date startTime;
    private Date endTime;

    private ArrayList<TransportClass> listDrivers = new ArrayList<>();
    private ArrayList<TransportClass> listJourneys = new ArrayList<>();

    public ArrayList<TransportClass> fetchDrivers() {
        return listDrivers;
    }

    public void createDriver(TransportClass arg1) {
        listDrivers.add(arg1);
    }

    public ArrayList<TransportClass> getDriver(String arg1) {
        ArrayList<TransportClass> output = new ArrayList<>();
        for (int i = 0; i < listDrivers.size(); i++)
            if (listDrivers.get(i).address.equals(arg1))
                output.add(listDrivers.get(i));
        return output;
    }

    public void updateDriver(TransportClass arg1) {
        for (int i = 0; i < listDrivers.size(); i++)
            if (listDrivers.get(i).id == arg1.id) {
                listDrivers.add(i, arg1);
                listDrivers.remove(i);
            }
    }

    public void printMetrics(TransportClass transportClass) {
        ArrayList<TransportClass> listDrivers = transportClass.getListDrivers();
        HashMap<String, String> arg1 = new HashMap<>();
        for (int i = 0; i < listDrivers.size(); i++) {
            arg1.put(listDrivers.get(i).firstname, listDrivers.get(i).desc);
        }

        System.out.println("************* Driver Metrics ******************");
        for (Map.Entry<String, String> map : arg1.entrySet()) {
            System.out.println("****** " + map.getValue() + " <=============> " + map.getKey() + " *******");
        }
        System.out.println("***********************************************");

    }

    public TransportClass findDriver(int id) {
        return listDrivers.get(id);
    }

    public TransportClass deleteDriver(int id) {
        return listDrivers.remove(id);
    }

    public ArrayList<TransportClass> fetchJourneys() {
        return listJourneys;
    }

    public void createJourney(TransportClass arg1) {
        listJourneys.add(arg1);
    }

    public ArrayList<TransportClass> getJourney(String arg1) {
        ArrayList<TransportClass> output = new ArrayList<>();
        for (int i = 0; i < listJourneys.size(); i++)
            if (listJourneys.get(i).firstname.equals(arg1))
                output.add(listJourneys.get(i));
        return output;
    }

    public void updateJourney(TransportClass arg1) {
        for (int i = 0; i < listJourneys.size(); i++)
            if (listJourneys.get(i).id == arg1.id) {
                listJourneys.add(i, arg1);
                listJourneys.remove(i);
            }
    }

    public TransportClass findJourney(int id) {
        return listJourneys.get(id);
    }

    public TransportClass deleteJourney(int id) {
        return listJourneys.remove(id);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<TransportClass> getListDrivers() {
        return listDrivers;
    }

    public void setList(ArrayList<TransportClass> listDrivers) {
        this.listDrivers = listDrivers;
    }

    public int getNbrOfPlace() {
        return nbrOfPlace;
    }

    public void setNbrOfPlace(int nbrOfPlace) {
        this.nbrOfPlace = nbrOfPlace;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setListDrivers(ArrayList<TransportClass> listDrivers) {
        this.listDrivers = listDrivers;
    }

    public ArrayList<TransportClass> getListJourneys() {
        return listJourneys;
    }

    public void setListJourneys(ArrayList<TransportClass> listJourneys) {
        this.listJourneys = listJourneys;
    }

    public String getIdJourney() {
        return idJourney;
    }

    public void setIdJourney(String idJourney) {
        this.idJourney = idJourney;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static void main(String[] args) {

    }
}
