package com.berkaygulen.akbankbootcamphomework1.service;

import com.berkaygulen.akbankbootcamphomework1.dto.CountryDto;
import com.berkaygulen.akbankbootcamphomework1.dto.CountrySaveRequestDto;
import com.berkaygulen.akbankbootcamphomework1.dto.CountryUpdatePresidentRequestDto;
import com.berkaygulen.akbankbootcamphomework1.entity.Country;
import com.berkaygulen.akbankbootcamphomework1.mapper.CountryMapper;
import com.berkaygulen.akbankbootcamphomework1.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryDbService {
    private final CountryRepository countryRepository;

    public CountryDbService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public CountryDto saveCountry(CountrySaveRequestDto countrySaveRequestDto){

        Country country = CountryMapper.INSTANCE.convertToCountry(countrySaveRequestDto);
        country = countryRepository.save(country);
        return CountryMapper.INSTANCE.convertToCountryDto(country);

    }

    public List<CountryDto> findAllCountries(){
        List<Country> countries = (List<Country>) countryRepository.findAll();
        return CountryMapper.INSTANCE.convertToCountryDtoList(countries);

    }
    public CountryDto findCountryById(Long id){
        Country country =  countryRepository.findById(id).get();
        return CountryMapper.INSTANCE.convertToCountryDto(country);

    }
    public CountryDto deleteCountry(Long id){
        CountryDto countryDto = findCountryById(id);
        countryRepository.deleteById(id);
        return countryDto;

    }



    public CountryDto updatePresident(Long id, CountryUpdatePresidentRequestDto countryUpdatePresidentRequestDto){

        Country country =  countryRepository.findById(id).get();
        country = CountryMapper.INSTANCE.updateCountry(country, countryUpdatePresidentRequestDto);
        country = countryRepository.save(country);
        return CountryMapper.INSTANCE.convertToCountryDto(country);

    }




}
