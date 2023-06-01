import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        HashMap<String,String> trackList = new HashMap();
        trackList.put("Under the influence" ,"Your body lightweight");
        trackList.put("Stay Schemin" ,"You wasn't with me shooting in the gym!!");
        trackList.put("Last time that I checked" ,"Last time that I checked, Im the voice out west");
        trackList.put("Going Bad" ,"Still going bad on you anyway");

        System.out.println(trackList.get("Stay Schemin"));


        for(String song : trackList.keySet()){
            System.out.println(String.format("Track: %s - Lyrics: %s", song, trackList.get(song)));
        }
    }
}