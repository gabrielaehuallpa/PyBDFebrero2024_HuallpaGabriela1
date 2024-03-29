package app.service;

//import org.hibernate.query.NativeQuery.ReturnProperty;
import org.springframework.beans.factory.annotation.Autowired;  // hace la conexion buscaar!!
import org.springframework.stereotype.Service;
import app.models.Habitacion;
import app.repository.HabitacionRepository;
import java.util.List;

@Service
public class HabitacionService {

    @Autowired // 
    HabitacionRepository habitacionRepository;

    
    @SuppressWarnings("null")// Permite cargar la estructura en blanco.
    public void guardarHabitacion(Habitacion habitacion) {  //cumple una fumcion, guarda la info// archi-objeto
        habitacionRepository.save(habitacion);// guarda la info del objeto habit en el archiv reposit.
    }
    


   
    // Otros métodos según sea necesario


    public List<Habitacion> busacarHabitacion () {

 return(List<Habitacion>) habitacionRepository.findAll(); // find (esccanea todo)


    }
public List <Habitacion> buscarHabitacionesLibres(){
    return habitacionRepository.findByEstado ("Libre");
}
    public List<Habitacion> buscarHabitacionesDobles (){
        return  habitacionRepository.findByCama ("Doble");

    }

  public List<Habitacion>buscarHabitacionesPremium(){
    return habitacionRepository.findByTipo("Premium");
  }
} 

