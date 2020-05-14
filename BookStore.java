import java.util.nio;
import java.util.text;
import java.util.net;
import java.util.nio.files;
import java.util.math;
import java.util.time;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class BookStore {

    public BookStore(String name, String address) {
        this.storeName = name;
        this.storeAddress = address;
        titles = new ArrayList<String>();
        loadtitles();

    }

    private ArrayList<String> titles;

    public String storeName;
    public String storeAddress;
    public int squareFeet;
    public Boolean hasBooks;
    public Boolean open;
    public Boolean openWeekends;
    public Boolean openSundays;
    public String openhourDaily;
    public String closehourDaily;

    private void loadtitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

}
