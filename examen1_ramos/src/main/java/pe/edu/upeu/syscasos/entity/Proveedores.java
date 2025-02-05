package pe.edu.upeu.syscasos.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name="proveedores")


public class Proveedores {
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
	
	@Column(name = "estado")
	private char estado;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "proveedores")
	@JsonIgnore
	private Set<Ordenes> ordenes;
	
}
