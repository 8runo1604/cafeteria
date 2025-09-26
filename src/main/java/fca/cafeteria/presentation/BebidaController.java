package fca.cafeteria.presentation;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import fca.cafeteria.domain.BebidaDomain;
import fca.cafeteria.data.Bebida;

@RestController
@RequestMapping("/bebidas")
public class BebidaController {

    @Autowired
    private BebidaDomain bebidaDomain;

    // Método 4: Recibir POST y crear bebida
    @PostMapping("/crear")
    public String crearBebida(@RequestBody BebidaDTO bebidaDTO) {
        Bebida bebida = new Bebida();
        bebida.setNombre(bebidaDTO.getNombre());
        bebida.setDescripcion(bebidaDTO.getDescripcion());

        Bebida guardada = bebidaDomain.guardarBebida(bebida, bebidaDTO.getTipoDescripcion());
        return guardada != null ? "Bebida guardada correctamente" : "La bebida ya existe";
    }
}
