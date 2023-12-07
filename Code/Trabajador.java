package Code;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Trabajador implements Serializable {
    transient String tipoTrabajador;
    transient int edad;
    String profesion;

    public Trabajador(String tipoTrabajador, int edad, String profesion) {
        this.tipoTrabajador = tipoTrabajador;
        this.edad = edad;
        this.profesion = profesion;
    }

    public String toString() {
        return String.format("Soy un trabajador %s tengo %d y de profesion %s", tipoTrabajador, edad, profesion);
    }

    public static void main(String[] args) throws Exception {
        Trabajador antes = new Trabajador("dependiente", 30, "desarrollador");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("exemple.txt"));
        out.writeObject(antes);

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("exemple.txt"));
        Trabajador despues = (Trabajador)input.readObject();
        System.out.println(despues);
    }
}
