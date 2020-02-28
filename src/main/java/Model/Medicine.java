package Model;

import java.util.ArrayList;

public class Medicine {

    private String name;
    private int units;
    private int mg;
    private ArrayList<String> components;

    public Medicine(String name, int units, int mg) {
        this.name = name;
        this.units = units;
        this.mg = mg;
        this.components = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getMg() {
        return mg;
    }

    public void setMg(int mg) {
        this.mg = mg;
    }

    public ArrayList<String> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<String> components) {
        this.components = components;
    }
}
