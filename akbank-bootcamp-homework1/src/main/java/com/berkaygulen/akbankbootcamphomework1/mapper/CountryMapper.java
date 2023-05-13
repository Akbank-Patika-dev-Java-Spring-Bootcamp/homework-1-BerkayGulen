package com.berkaygulen.akbankbootcamphomework1.mapper;

import com.berkaygulen.akbankbootcamphomework1.dto.CountryDto;
import com.berkaygulen.akbankbootcamphomework1.dto.CountrySaveRequestDto;
import com.berkaygulen.akbankbootcamphomework1.dto.CountryUpdatePresidentRequestDto;
import com.berkaygulen.akbankbootcamphomework1.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    Country convertToCountry(CountrySaveRequestDto countrySaveRequestDto);

    CountryDto convertToCountryDto(Country country);

    List<CountryDto> convertToCountryDtoList(List<Country> countryList);

    Country convertToCountry(CountryUpdatePresidentRequestDto countryUpdatePresidentRequestDto);


    Country updateCountry(@MappingTarget Country country, CountryUpdatePresidentRequestDto countryUpdatePresidentRequestDto);








}
