package ec.ucacue.registro.hombre_maquina.services;

import java.util.List;

import ec.ucacue.registro.hombre_maquina.models.Producto;

public interface ProductoService {

    List<Producto> listarProductos();

    Producto guardarProducto(Producto producto);

    Producto buscarPorID(Long id);

    Producto actualizarProducto(Producto producto);

    void eliminarProducto(Long id);

}
