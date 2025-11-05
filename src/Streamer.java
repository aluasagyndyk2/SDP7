import java.util.ArrayList;
import java.util.List;

public class Streamer implements Subject {
    private String name;
    private List<Observer> viewers = new ArrayList<>();
    // Constructor: create a new streamer with a name
    public Streamer(String name) {
        this.name = name;
    }
    // Add a viewer to the subscriber list
    @Override
    public void attach(Observer o) {
        viewers.add(o);
    }
    // Remove a viewer from the subscriber list
    @Override
    public void detach(Observer o) {
        viewers.remove(o);
    }
    // Send a notification message to all subscribed viewers
    @Override
    public void notifyAllObservers(String message) {
        for (Observer o : viewers) {
            o.update(message);
        }
    }

    public void startStream(String game) {
        String msg = "🎮 " + name + " has started streaming: " + game;
        System.out.println("\n" + msg);
        notifyAllObservers(msg);
    }
}
