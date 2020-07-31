package service;

import model.Encuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EncuestaRepository;

import java.util.List;

@Service
public class EncuestaServiceImpl implements EncuestaService {

    @Autowired
    private EncuestaRepository encuestaRepository;

    public List<Encuesta> getAllEncuestas() {
        return encuestaRepository.findAll();
    }

}
