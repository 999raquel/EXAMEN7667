package pe.edu.upeu.syscasos.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="ordenes")

public class Ordenes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ruc", length = 100)
	private String ruc;
	
	@Column(name = "razonsocial", length = 100)
	private String razonsocial;
	
	@Column(name = "contacto", length = 100)
	private Integer contacto;
	
	@Column(name = "telefono")
	private char telefono;
	
	@ManyToOne
	@JoinColumn(name = "almacenes_id", nullable = false)
	private Almacenes almacenes;
	
	@ManyToOne
	@JoinColumn(name = "proveedores_id", nullable = false)
	private Proveedores proveedores;
	
	@ManyToOne
	@JoinColumn(name = "tipoorden_id", nullable = false)
	private Tipoorden tipoorden;
	
	@ManyToOne
	@JoinColumn(name = "formapago_id", nullable = false)
	private Formapago formapago;
	
	
	
	
}
