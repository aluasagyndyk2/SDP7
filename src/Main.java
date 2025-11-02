public class Main {
    public static void main(String[] args) {
        Streamer streamer = new Streamer("Aluk");

        Viewer farida = new Viewer("Farida");
        Viewer altyn = new Viewer("Altynay");
        Viewer shugi = new Viewer("Shugyla");

        streamer.attach(farida);
        streamer.attach(altyn);

        streamer.startStream("Roblox");
        streamer.attach(shugi);
        streamer.startStream("Minecraft");
    }
}
