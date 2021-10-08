package com.pokemon.pokedex.services;

import java.util.List;

import com.pokemon.pokedex.models.Pokemon;

import org.springframework.http.ResponseEntity;

public interface PokemonService {
    
    public ResponseEntity<List<Pokemon>> listAll();

    public ResponseEntity<Pokemon> createNewPokemon(Pokemon pokemon);
}
