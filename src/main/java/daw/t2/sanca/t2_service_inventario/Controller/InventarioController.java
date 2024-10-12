package daw.t2.sanca.t2_service_inventario.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    @GetMapping("/disponibilidad/{id}")
    public String verificarDisponibilidad(@PathVariable Long id) {
        return "Disponible";  // Respuesta simple
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarStock(@PathVariable Long id) {
        return "Stock actualizado para auto ID: " + id;
    }
}