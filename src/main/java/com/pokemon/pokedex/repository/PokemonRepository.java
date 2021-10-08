package com.pokemon.pokedex.repository;

import com.pokemon.pokedex.models.Pokemon;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon,Long> {
    
}
