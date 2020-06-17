package spring.rest.brewery.web.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.rest.brewery.web.model.BeerDto;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Some Beer")
                .beerStyle("Red Ale")
                .build();
    }

    @Override
    public BeerDto savedNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();

    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo implement update
        log.debug("Updating a beer");

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer");
    }
}
