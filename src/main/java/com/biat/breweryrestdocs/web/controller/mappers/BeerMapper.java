package com.biat.breweryrestdocs.web.controller.mappers;

import com.biat.breweryrestdocs.domain.Beer;
import com.biat.breweryrestdocs.web.controller.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
