public class Viewer implements Observer {
    private String name;
    // Constructor
    public Viewer(String name) {
        this.name = name;
    }
    // method is called when the streamer sends a notification
    @Override
    public void update(String message) {
        System.out.println("👤 " + name + " got notification: " + message);
    }
}
