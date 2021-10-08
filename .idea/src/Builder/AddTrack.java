package Builder;

public class AddTrack {

    private String artistName;
    private String albumName;
    private int yearCreating;


    private static class Builder {
        public AddTrack newTrack;

        public Builder() {
            newTrack = new AddTrack();
        }

        public Builder artistName(String artistName){
            newTrack.artistName = artistName;
            return this;
        }

        public Builder albumName(String albumName){
            newTrack.albumName = albumName;
            return this;
        }

        public Builder yearCreating(int yearCreating){
            newTrack.yearCreating = yearCreating;
            return this;
        }


        public AddTrack build(){
            return newTrack;
        }

    }
}