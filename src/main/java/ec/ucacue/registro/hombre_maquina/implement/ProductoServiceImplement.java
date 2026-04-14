package ec.ucacue.registro.hombre_maquina.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.ucacue.registro.hombre_maquina.models.Producto;
import ec.ucacue.registro.hombre_maquina.repositorios.ProductoRepository;
import ec.ucacue.registro.hombre_maquina.services.ProductoService;
@Service
public class ProductoServiceImplement implements ProductoService {

    private final ProductoRepository productoRepository;
    public ProductoServiceImplement(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> listarProductos() {
        return this.productoRepository.findAll();
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return this.productoRepository.save(producto);
    }

    @Override
    public Producto buscarPorID(Long id) {
        return this.productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return this.productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        this.productoRepository.deleteById(id);
    }
    
}
