package guru.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import guru.springframework.msscbrewery.web.model.BeerDto;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		
		return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		
		return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		// TODO Auto-generated method stub
		
	}

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
