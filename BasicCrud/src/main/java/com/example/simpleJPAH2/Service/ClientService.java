package com.example.simpleJPAH2.Service;

import ch.qos.logback.core.net.server.Client;

import java.util.List;

public interface ClientService {

    // Save operation
    Client saveClient(Client department);

    // Read operation
    List<Client> fetchClientList();

    // Update operation
    Client updateClient(Client department,
                                Long departmentId);

    // Delete operation
    void deleteClientById(Long departmentId);

}
