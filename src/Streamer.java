import java.util.ArrayList;
import java.util.List;

public class Streamer implements Subject {
    private String name;
    private List<Observer> viewers = new ArrayList<>();

    public Streamer(String name) {
        this.name = name;
    }

    @Override
    public void attach(Observer o) {
        viewers.add(o);
    }

    @Override
    public void detach(Observer o) {
        viewers.remove(o);
    }

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
