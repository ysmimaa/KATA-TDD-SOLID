import java.util.ArrayList;
import java.util.Date;

public class TransportClass {

    private String idJourney;
    private String desc;
    private int nbrOfPlace;
    private Date startTime;
    private Date endTime;

    private ArrayList<TransportClass> listJourneys = new ArrayList<>();

    public ArrayList<TransportClass> fetchJourneys() {
        return listJourneys;
    }

    public void createJourney(TransportClass ar-g1) {
        listJourneys.add(arg1);
    }

    public ArrayList<TransportClass> getJourney(String arg1) {
        ArrayList<TransportClass> output = new ArrayList<>();
        for (int i = 0; i < listJourneys.size(); i++)
            if (listJourneys.get(i).desc.equals(arg1))
                output.add(listJourneys.get(i));
        return output;
    }

    public void updateJourney(TransportClass arg1) {
        for (int i = 0; i < listJourneys.size(); i++)
            if (listJourneys.get(i).idJourney == arg1.idJourney) {
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

    public ArrayList<TransportClass> getListJourneys() {
        return listJourneys;
    }

    public void setListJourneys(ArrayList<TransportClass> listJourneys) {
        this.listJourneys = listJourneys;
    }
}
