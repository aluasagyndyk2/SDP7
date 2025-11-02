public class Viewer implements Observer {
    private String name;

    public Viewer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("👤 " + name + " got notification: " + message);
    }
}
