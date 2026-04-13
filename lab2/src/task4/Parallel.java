package task4;

public class Parallel extends Circuit {
    private Circuit first;
    private Circuit second;

    public Parallel(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public double getResistance() {
        return 1 / (1 / first.getResistance() + 1 / second.getResistance());
    }

    @Override
    public double getPotentialDiff() {
        return first.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        first.applyPotentialDiff(V);
        second.applyPotentialDiff(V);
    }
}
