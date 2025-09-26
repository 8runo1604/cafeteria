package fca.cafeteria.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fca.cafeteria.data.Bebida;
import fca.cafeteria.data.TipoBebida;
import fca.cafeteria.data.BebidaRepository;
import fca.cafeteria.data.TipoBebidaRepository;

@Service
public class BebidaDomain {

    @Autowired
    private BebidaRepository bebidaRepo;

    @Autowired
    private TipoBebidaRepository tipoRepo;


    public Bebida guardarBebida(Bebida bebida, String tipoDescripcion) {
        TipoBebida tipo = tipoRepo.findByDescripcion(tipoDescripcion);
        if (tipo == null) {
            tipo = new TipoBebida();
            tipo.setDescripcion(tipoDescripcion);
            tipoRepo.save(tipo);
        }
        bebida.setIdTipoBebida(tipo.getIdTipoBebida());

        if (!existeBebida(bebida.getNombre())) {
            bebidaRepo.save(bebida);
            return bebida;
        }
        return null;
    }


    public boolean existeBebida(String nombre) {
        return bebidaRepo.findByNombre(nombre) != null;
    }


    public boolean existeTipoBebida(String descripcion) {
        return tipoRepo.findByDescripcion(descripcion) != null;
    }
}
