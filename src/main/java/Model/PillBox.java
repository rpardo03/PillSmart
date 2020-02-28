package Model;

import java.util.ArrayList;

public class PillBox {

    private User user;
    private ArrayList<Compartment> compartments;
    private Schedule schedule;

    public PillBox(User user) {
        this.user = user;
        this.compartments = new ArrayList<Compartment>(8);
        this.schedule = new Schedule();
    }

    private void availableCompartments() {
        ArrayList<Integer> available = new ArrayList<Integer>();
        System.out.println("Los siguientes compartimientos están disponibles:");
        for (int i = 0; i < compartments.size(); i++) {
            if (compartments.get(i).isEmpty()) {
                available.add(i + 1);
            }
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Compartment> getCompartments() {
        return compartments;
    }

    public void setCompartments(ArrayList<Compartment> compartments) {
        this.compartments = compartments;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
