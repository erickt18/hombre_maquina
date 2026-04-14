package ec.ucacue.registro.hombre_maquina.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.ucacue.registro.hombre_maquina.models.Producto;

public interface  ProductoRepository extends JpaRepository <Producto, Long>{ 
    
}
