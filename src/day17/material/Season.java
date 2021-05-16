package day17.material;

public enum Season {
    SUMMER(34), WINTER(-23),AUTUMN(13),SPRING(20);

    private int temp;

    Season(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Season{" +
                "temp=" + temp +
                '}';
    }
}
