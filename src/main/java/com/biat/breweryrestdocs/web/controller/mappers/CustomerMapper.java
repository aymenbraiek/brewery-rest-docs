package com.biat.breweryrestdocs.web.controller.mappers;

import com.biat.breweryrestdocs.domain.Customer;
import com.biat.breweryrestdocs.web.controller.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
