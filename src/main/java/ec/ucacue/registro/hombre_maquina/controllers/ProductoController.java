package ec.ucacue.registro.hombre_maquina.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.ucacue.registro.hombre_maquina.models.Producto;
import ec.ucacue.registro.hombre_maquina.services.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private ProductoService productoService;

    //Constructor para inyectar el servicio de producto
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }
    // Método para manejar solicitudes GET a "/productos"

    @GetMapping("/nuevo")
    public String getMethodName(Model model) {
        model.addAttribute("producto", new Producto());
        model.addAttribute("titulo", "Nuevo Producto");
        return "producto/nuevo";
    }

    @GetMapping("/guardar")
    public String guardarProducto(Producto producto) {
        productoService.guardarProducto(producto);
        return "redirect:/productos";
    }

    @GetMapping
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoService.listarProductos());
        model.addAttribute("titulo", "Listado de Productos");
        return "producto/index";
    
    }
    
}
