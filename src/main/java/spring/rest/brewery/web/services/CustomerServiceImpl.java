package spring.rest.brewery.web.services;

import org.springframework.stereotype.Service;
import spring.rest.brewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID id) {
        return CustomerDto.builder().customerId(UUID.randomUUID())
                .customerName("John")
                .build();
    }
}
