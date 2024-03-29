package app.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import app.models.Habitacion;// me guia hacia donde se trasladan los datos.
import java.util.List;


@Repository 
public interface HabitacionRepository extends CrudRepository <Habitacion, Integer > {
    // No es necesario agregar ningún método aquí, CrudRepository proporciona métodos CRUD básicos
List<Habitacion> findByEstado (String estado);
List<Habitacion> findByCama(String cama);
List<Habitacion> findByTipo (String tipo);



}
/// CRUD
