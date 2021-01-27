import java.util.*;

public class TransportClass {

    private String idJourney;
    private String desc;
    private int nbrOfPlace;
    private Date startTime;
    private Date endTime;

    private ArrayList<TransportClass> listJourneys = new ArrayList<>();

    public TransportClass findJourney(int id) {
        return listJourneys.get(id);
    }

    public TransportClass deleteJourney(int id) {
        return listJourneys.remove(id);
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
