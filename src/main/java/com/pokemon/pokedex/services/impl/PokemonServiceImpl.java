package com.pokemon.pokedex.services.impl;

import java.util.List;

import com.pokemon.pokedex.models.Pokemon;
import com.pokemon.pokedex.repository.PokemonRepository;
import com.pokemon.pokedex.services.PokemonService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PokemonServiceImpl implements PokemonService {

    private PokemonRepository repository;

    public PokemonServiceImpl(PokemonRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<List<Pokemon>> listAll() {
        List<Pokemon> listingAll = repository.findAll();
        return new ResponseEntity<>(listingAll,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Pokemon> createNewPokemon(Pokemon pokemon) {
        repository.save(pokemon);
        return new ResponseEntity<>(pokemon,HttpStatus.CREATED);
    }
    
}
