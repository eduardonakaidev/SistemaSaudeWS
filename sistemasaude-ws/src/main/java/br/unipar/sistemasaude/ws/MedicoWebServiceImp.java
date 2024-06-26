/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.sistemasaude.ws;

import java.sql.SQLException;
import java.util.ArrayList;

import br.unipar.sistemasaude.ws.dto.MedicoRequest;
import br.unipar.sistemasaude.ws.dto.MedicoUpdateRequestDTO;
import br.unipar.sistemasaude.ws.errors.EspecialidadeException;
import br.unipar.sistemasaude.ws.interfaces.MedicoInterface;
import br.unipar.sistemasaude.ws.models.Medico;
import br.unipar.sistemasaude.ws.service.medicoService;
import jakarta.validation.ValidationException;

/**
 *
 * @author lucia
 */
public class MedicoWebServiceImp implements MedicoInterface{

    @Override
    public ArrayList<Medico> listAll() {
        medicoService medicoService = new medicoService();
        return medicoService.listAll();
    }

    @Override
    public Medico findById(int id) {
        medicoService medicoService = new medicoService();
        return medicoService.findById(id);
    }


    @Override
    public MedicoUpdateRequestDTO atualizar(MedicoUpdateRequestDTO medico) throws Exception {
       medicoService medicoService = new medicoService();
       return medicoService.atualizar(medico);
    }

    @Override
    public void deletar(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }

    @Override
    public MedicoRequest inserir(MedicoRequest medicoDto) throws SQLException, ValidationException, EspecialidadeException {
        medicoService medicoService = new medicoService();
        return medicoService.insert(medicoDto);
    }
    
}
