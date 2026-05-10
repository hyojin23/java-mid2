package generic.test.ex3.unit;

import java.util.ArrayList;
import java.util.List;

public class Shuttle<T extends BioUnit> {

    private final List<T> units;

    public Shuttle() {
        units = new ArrayList<>();
    }

    public void in(T unit) {
        units.add(unit);
    }

    public void showInfo() {
        for (T unit : units) {
            System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
        }
    }
}
