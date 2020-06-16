package spring.rest.brewery.web.services;

import spring.rest.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getById(UUID id);
}
