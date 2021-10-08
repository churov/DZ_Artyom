import java.util.Arrays;

public enum EnumSingleton {
    INSTANCE;
    private String track;
    private int ageCreating;
    private void build(SingletonBuilder builder) {
        this.track = builder.track;
        this.ageCreating = builder.ageCreating;
    }
    public static EnumSingleton getSingleton() { // static getter
        return INSTANCE;
    }
    public void print() {
        System.out.println("Track: "+track + ", age: "+ageCreating);
    }
    public static class SingletonBuilder {
        private final String track;
        private int ageCreating;
        private SingletonBuilder() {
            track = null;
        }
        public SingletonBuilder(String track) {
            this.track = track;
        }
        public SingletonBuilder ageCreating(int ageCreating) {
            this.ageCreating = ageCreating;
            return this;
        }
        public void build() {
            EnumSingleton.INSTANCE.build(this);
        }
    }
    public static void main(String[] args) {
        new SingletonBuilder("Ели мясо мужики").ageCreating(2009).build();
        EnumSingleton.getSingleton().print();
    }
}
