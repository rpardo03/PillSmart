package Model;

import java.awt.*;

public class Compartment {

    private Medicine medicine;
    private Color color;

    public Compartment(Medicine medicine) {
        this.medicine = medicine;
        this.color = new Color(234);
    }

    public boolean isEmpty() {
        if (medicine == null) {
            return true;
        } else {
            return false;
        }
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
