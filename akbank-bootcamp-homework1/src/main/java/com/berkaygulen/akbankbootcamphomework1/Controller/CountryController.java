package com.berkaygulen.akbankbootcamphomework1.Controller;
import com.berkaygulen.akbankbootcamphomework1.dto.CountryDto;
import com.berkaygulen.akbankbootcamphomework1.dto.CountrySaveRequestDto;
import com.berkaygulen.akbankbootcamphomework1.dto.CountryUpdatePresidentRequestDto;
import com.berkaygulen.akbankbootcamphomework1.service.CountryDbService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryController {
    private final CountryDbService countryDbService;

    public CountryController(CountryDbService countryDbService) {
        this.countryDbService = countryDbService;
    }

    @GetMapping
    public ResponseEntity findAllCountries(){
        List<CountryDto> countryDtos = countryDbService.findAllCountries();
        return ResponseEntity.ok(countryDtos);

    }
    @GetMapping("/{id}")
    public ResponseEntity findCountryById(@PathVariable Long id){
       CountryDto countryDto = countryDbService.findCountryById(id);
        return ResponseEntity.ok(countryDto);
    }


    @PostMapping("/countries")
    public ResponseEntity saveCountry(@RequestBody CountrySaveRequestDto countrySaveRequestDto){

        CountryDto countryDto = countryDbService.saveCountry(countrySaveRequestDto);
        return ResponseEntity.ok(countryDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity updatePresident(@PathVariable Long id, @RequestBody CountryUpdatePresidentRequestDto countryUpdatePresidentRequestDto){
        CountryDto countryDto = countryDbService.updatePresident(id, countryUpdatePresidentRequestDto);
        return ResponseEntity.ok(countryDto);

    }
    @DeleteMapping("{id}")
    public ResponseEntity deleteCountry(@PathVariable Long id){
        CountryDto countryDto = countryDbService.deleteCountry(id);
        return ResponseEntity.ok(countryDto);
    }







}
