package spring.rest.brewery.web.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.rest.brewery.web.model.BeerDto;
import spring.rest.brewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID id) {
        return CustomerDto.builder().customerId(UUID.randomUUID())
                .customerName("John")
                .build();
    }

    @Override
    public CustomerDto savedNewCustomer(CustomerDto customerDto) {
        return customerDto.builder()
                .customerId(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo implement update
        log.debug("Updating a customer");
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting a customer!");
    }
}
