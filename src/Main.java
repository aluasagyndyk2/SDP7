public class Main {
    public static void main(String[] args) {
        Streamer streamer = new Streamer("Aluk");

        Viewer alice = new Viewer("Farida");
        Viewer bob = new Viewer("Altynay");
        Viewer charlie = new Viewer("Shugyla");

        streamer.attach(alice);
        streamer.attach(bob);

        streamer.startStream("Roblox");

        streamer.attach(charlie);
        streamer.startStream("Minecraft");
    }
}
