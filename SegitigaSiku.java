package bangundatar;

public class SegitigaSiku implements BangunDatar {

    SegitigaSiku() {
    }
    @Override
    public double luas(double s1, double s2) {
        return (0.5 * s1 * s2);
    }
    @Override
    public double keliling(double s1, double s2) {
        return (s1 + s2 + Math.sqrt((s1 * s1) + (s2 * s2)));
    }
}
