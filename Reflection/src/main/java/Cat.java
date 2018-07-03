public class Cat extends Animal implements Say {
    private static final int numberOfLegs = 4;
    private static final String phrase = "MMMM";

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public int getNumberOfLegs(int numberOfLegs) {
        return numberOfLegs;
    }

    @Override
    public void say(String phrase) {
        System.out.println(phrase);
    }
}
