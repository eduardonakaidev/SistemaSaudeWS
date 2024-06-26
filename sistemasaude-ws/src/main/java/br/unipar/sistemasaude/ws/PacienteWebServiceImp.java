package br.unipar.sistemasaude.ws;

import br.unipar.sistemasaude.ws.interfaces.PacienteInterface;
import br.unipar.sistemasaude.ws.models.Paciente;
import br.unipar.sistemasaude.ws.service.PacienteService;

import java.sql.SQLException;
import java.util.ArrayList;

public class PacienteWebServiceImp implements PacienteInterface{

    @Override
    public ArrayList<Paciente> findPaciente(String nome) {
        PacienteService pacienteService = new PacienteService();
        return pacienteService.findPaciente(nome);
    }

    @Override
    public ArrayList<Paciente> listAll() throws SQLException {
        PacienteService pacienteService = new PacienteService();
        return pacienteService.listAll();
    }

    @Override
    public Paciente findById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Paciente inserir(Paciente paciente) throws SQLException {
        PacienteService pacienteService = new PacienteService();
        return pacienteService.insert(paciente);
    }

    @Override
    public Paciente atualizar(Paciente paciente) throws Exception {
        PacienteService pacienteService = new PacienteService();
        return pacienteService.atualizar(paciente);
    }

    @Override
    public void deletar(int id) throws SQLException {
        PacienteService pacienteService = new PacienteService();
        pacienteService.delete(id);
    }
    
    
}
