package spring.rest.brewery.web.services;

import org.springframework.stereotype.Service;
import spring.rest.brewery.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Some Beer")
                .beerStyle("Red Ale")
                .build();
    }
}
