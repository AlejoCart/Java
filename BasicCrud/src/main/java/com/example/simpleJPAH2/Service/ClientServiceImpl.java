package com.example.simpleJPAH2.Service;

import ch.qos.logback.core.net.server.Client;
import com.example.simpleJPAH2.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository repository;

    @Override
    public Client saveClient(Client clientAux) {
        return repository.save(clientAux);
    }

    @Override
    public List<Client> fetchClientList() {
        return (List<Client>) repository.findAll();
    }

    @Override
    public Client updateClient(Client clientAux, Long clientId) {
        Client clientDB  = (Client) repository.findById(clientId).get();

        if (Objects.nonNull(clientAux.ClientName())
                && !"".equalsIgnoreCase(
                clientAux.getDepartmentName())) {
            clientAux.setDepartmentName(
                    clientAux.getDepartmentName());
        }

        if (Objects.nonNull(
                clientAux.getDepartmentAddress())
                && !"".equalsIgnoreCase(
                clientAux.getDepartmentAddress())) {
            clientDB.setDepartmentAddress(
                    clientAux.getDepartmentAddress());
        }

        if (Objects.nonNull(clientAux.getDepartmentCode())
                && !"".equalsIgnoreCase(
                clientAux.getDepartmentCode())) {
            clientDB.setDepartmentCode(
                    clientAux.getDepartmentCode());
        }

        return repository.save(clientDB);
    }

    @Override
    public void deleteClientById(Long departmentId) {
        repository.deleteById(departmentId);
    }
}
