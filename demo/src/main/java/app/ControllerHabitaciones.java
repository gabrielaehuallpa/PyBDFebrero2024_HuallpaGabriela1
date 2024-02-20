package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import app.models.Habitacion;
//import app.models.Habitacion;
import app.service.HabitacionService;

@Controller
public class ControllerHabitaciones {

    @Autowired
    HabitacionService habitacionService;

    @GetMapping("/")
    public String index(Model model) {
        // Devuelve el nombre de la vista que quieres mostrar
        return "index";
    }

    @GetMapping("/INFORMACIONDEHABITACIONES")
    public String vistaDeHabitaciones(Model model) {
        // Devuelve el nombre de la vista que quieres mostrar
        return "Habitaciones";
    }

    @GetMapping("/REGISTRODEHABITACIONES")
    public String archivoDeHabitaciones(Model model) {
        // Devuelve el nombre de la vista que quieres mostrar
        return "FormularioDeHabitaciones";
    }

      @PostMapping("/REGISTRODEHABITACIONES")
    public String guardarHabitacion(@ModelAttribute("habitacion") Habitacion habitacion, Model model) {
        habitacionService.guardarHabitacion(habitacion);// procesa la inform
        // Puedes redirigir a una página de éxito o mostrar un mensaje de confirmación al usuario
        return "exito";
    }

    
}
