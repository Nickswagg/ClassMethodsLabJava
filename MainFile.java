import java.util.nio;
import java.util.text;
import java.util.net;
import java.util.nio.files;
import java.util.math;
import java.util.time;
import java.util.ArrayList;
import java.util.LinkedList;

public class MainFile {

    public static void main(String[] args) {
        // System.out.println("Hello World!");

        BookStore myStore = new BookStore("Nick's Book Store", "4261 Belle Meade");
        myStore.squareFeet = 4;
        myStore.hasBooks = false;
        myStore.open = true;
        myStore.openWeekends = true;
        myStore.openSundays = false;
        myStore.openhourDaily = "8am";
        myStore.closehourDaily = "5pm";

        System.out.println("What is the address of your bookstore ? ");
        System.out.println(myStore.storeAddress);

        System.out.println("Is the store open today ? ");
        if (myStore.open == true) {
            System.out.println("Yes we are open today ! ");
        }
        System.out.println("What time does it close ? ");
        System.out.println("Our Bookstore closes at " + myStore.closehourDaily);

        System.out.println("How big is the store ?");
        System.out.println("Our Bookstore has " + myStore.squareFeet + " Square Feets");

        System.out.println("Does the store has new books ?");
        if (myStore.hasBooks == false) {
            System.out.println("No our store has no books for now.");
        }

    }

}