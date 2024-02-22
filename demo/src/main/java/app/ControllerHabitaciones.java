package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import app.models.Habitacion;
import app.repository.HabitacionRepository;
import app.service.HabitacionService;
import java.util.List;



//import org.springframework.web.bind.annotation.ModelAttribute; 
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import app.models.Habitacion;

@Controller
public class ControllerHabitaciones {


    @Autowired
    HabitacionService habitacionService;


    @GetMapping("/")
    public String index() {
        // Devuelve el nombre de la vista que quieres mostrar
        return "index";
    }

    

    @GetMapping("/INFORMACIONDEHABITACIONES") // muestra la tabla con laos datos de la bd
    public String vistaDeHabitaciones(Model model) {   // Devuelve el nombre de la vista que quieres mostrar
       List<Habitacion> habitaciones= habitacionService.busacarHabitacion();
       model.addAttribute ("habitaciones",  habitaciones );// ad: añadir// se añade al modelo
        return "Habitaciones";
    
    }

    @Autowired

HabitacionRepository habitacionRepository;

    @GetMapping("/REGISTRODEHABITACIONES")
    public String archivoDeHabitaciones( Model model) {  // Devuelve el nombre de la vista que quieres mostrar
      model.addAttribute ("habitacion", new Habitacion());
        return "FormularioDeHabitaciones";
    }

      @PostMapping("/REGISTRODEHABITACIONES")
    public String guardarHabitacion( Habitacion habitacion) {
        habitacionService.guardarHabitacion(habitacion);// procesa la inform
        habitacionService.busacarHabitacion() ;
        return "exito";
    }


    
}
