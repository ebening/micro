package guru.springframework.msscbeerservice.web.controller;

import com.sun.xml.bind.v2.TODO;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerDto(@PathVariable("beerId") UUID beerId){

        //TODO IMPL
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){

        //TODO: impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerID}")
    public ResponseEntity updateBeerById(@PathVariable("beerID") UUID beerId, @RequestBody BeerDto beerDto){

        //TODO: impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
