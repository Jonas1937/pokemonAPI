package com.pokemon.pokedex.resources;

import java.util.List;

import com.pokemon.pokedex.models.Pokemon;
import com.pokemon.pokedex.services.PokemonService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PokemonResource {

    private PokemonService service;

    public PokemonResource(PokemonService service) {
        this.service = service;
    }

    @GetMapping("/pokemons")
    public ResponseEntity<List<Pokemon>> listAll(){
        return service.listAll();
    }

    @PostMapping("/pokemons")
    public ResponseEntity<Pokemon> createNewPokemon(@RequestBody Pokemon pokemon){
        return service.createNewPokemon(pokemon);
    }
}
