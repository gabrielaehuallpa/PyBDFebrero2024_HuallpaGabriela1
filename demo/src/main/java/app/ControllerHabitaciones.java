package app;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerHabitaciones {

    @GetMapping("/")
    public String index() {
        // Devuelve el nombre de la vista que quieres mostrar
        return "index";
    }
    @GetMapping("/INFORMACIONDEHABITACIONES")
    public String VistaDeHABITACIONES
     () {
        // Devuelve el nombre de la vista que quieres mostrar
        return "Habitaciones";
    }

    @GetMapping("/REGISTRODEHABITACIONES")
    public String ARCHIVODEHABITACIONES () {
        // Devuelve el nombre de la vista que quieres mostrar
        return "FormularioDeHabitaciones";
    }
}