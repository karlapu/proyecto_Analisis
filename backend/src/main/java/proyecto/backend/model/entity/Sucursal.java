package proyecto.backend.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sucursal") 
@Data

public class Sucursal {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "IdSucursal")
private Integer id;






    
}
