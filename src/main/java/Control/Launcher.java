package Control;

import Model.Compartment;
import Model.Medicine;
import Model.PillBox;
import Model.User;

import java.util.Scanner;

public class Launcher {

    private PillBox pillSmart;

    public Launcher() {
        this.pillSmart = new PillBox(enterUser());
    }

    public void addMedicine() {
        if (pillSmart.getCompartments().size() < 8) {
            for (int i=0;i<pillSmart.getCompartments().size();i++){
                if (pillSmart.getCompartments().get(i).isEmpty()){

                }
            }
            pillSmart.getCompartments().add(new Compartment(createMedicine()));
        } else {
            System.out.println("Error ¡Su pastillero esta lleno!");
        }
    }

    private Medicine createMedicine() {
        String name = requestTextInput("Ingrese el nombre del medicamento:");
        int units = requestNumberInput("Ingrese las unidades del medicamento:");
        int mg = requestNumberInput("Ingrese los mg del medicamento:");
        return new Medicine(name, units, mg);
    }

    private User enterUser() {
        String nombre = requestTextInput("Ingrese su nombre completo:");
        int edad = requestNumberInput("Ingrese su edad:");
        String gender = requestTextInput("Ingrese su sexo:");
        return new User(nombre, edad, gender);
    }

    private String requestTextInput(String message) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    private int requestNumberInput(String message) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

}
