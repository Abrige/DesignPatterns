package patterns.structural.adapter;

public class MediaAdapter {
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            System.out.println("Playing vlc file. Name: " + audioType);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            System.out.println("Playing mp4 file. Name: " + audioType);
        }
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            System.out.println("Playing vlc file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            System.out.println("Playing mp4 file. Name: " + fileName);
        }
    }
}
