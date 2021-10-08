package Builder;

public class Main {

    public static void main(String[] args) {
        AddTrack track;
        track = new AddTrack.Builder()
                .artistName("Jane")
                .albumName("Doe")
                .yearCreating(32)

                .build();
    }

}