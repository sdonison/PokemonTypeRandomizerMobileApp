package com.example.pokemontyperandomizer

import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient


class CallApi {

    data class Pokemon (
        val typeOne: String,
        val typeTwo: String
    )

    fun populateFromApi(pokedex : String): MutableMap<String, Pokemon> {
        val policy = ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        val pokeApi = PokeApiClient()
        var allPokemon = mutableMapOf<String, Pokemon>()
        when (pokedex) {
            "Kanto" -> {
                val kantoDex = pokeApi.getPokedex(2)
                for (item in kantoDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
            }
            "GSC Johto" -> {
                val johtoDex = pokeApi.getPokedex(3)
                for (item in johtoDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
            }
            "HGSS Johto" -> {
                val johtoDex = pokeApi.getPokedex(7)
                for (item in johtoDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
            }
            "RS Hoenn" -> {
                val hoennDex = pokeApi.getPokedex(4)
                for (item in hoennDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
            }
            "E Hoenn" -> {
                val hoennDex = pokeApi.getPokedex(15)
                for (item in hoennDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
            }
            "DP Sinnoh" -> {
                val sinnohDex = pokeApi.getPokedex(5)
                for (item in sinnohDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
            }
            "P Sinnoh" -> {
                val sinnohDex = pokeApi.getPokedex(6)
                for (item in sinnohDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
            }
            "BW Unova" -> {
                val unovaDex = pokeApi.getPokedex(8)
                for (item in unovaDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
            }
            "B2W2 Unova" -> {
                val unovaDex = pokeApi.getPokedex(9)
                for (item in unovaDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
            }
            "Kalos" -> {
                val kalosCentralDex = pokeApi.getPokedex(12)
                for (item in kalosCentralDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
                val kalosCostalDex = pokeApi.getPokedex(13)
                for (item in kalosCostalDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
                val kalosMountainDex = pokeApi.getPokedex(14)
                for (item in kalosMountainDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
            }
            "SM Alola" -> {
                val alolaDex = pokeApi.getPokedex(16)
                for (item in alolaDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
            }
            "USUM Alola" -> {
                val alolaDex = pokeApi.getPokedex(21)
                for (item in alolaDex.pokemonEntries) {
                    val pokemonName = item.pokemonSpecies.name
                    val pokemon = pokeApi.getPokemon(item.pokemonSpecies.id)
                    val type1 = pokemon.types[0].type.name
                    val type2 = try {
                        pokemon.types[1].type.name
                    } catch (e: java.lang.IndexOutOfBoundsException) {
                        "---"
                    }
                    allPokemon[pokemonName.replaceFirstChar {it.uppercase()}] = Pokemon(type1.replaceFirstChar {it.uppercase()}, type2.replaceFirstChar {it.uppercase()})
                }
            }
        }
        return allPokemon
    }

    fun generateRandomList(typeOne : String, typeTwo: String, pokemonList : Map<String, Pokemon>): List<String> {
        val randomList: Map<String, Pokemon> = randomTypes(typeOne, typeTwo, pokemonList)
        val listItems = mutableListOf<String>()
        val headingString = "Type 1: $typeOne \nType 2: $typeTwo"
        listItems.add(headingString)
        for (key in randomList.keys) {
            val pokemon =
                "$key -> \n    Type 1: ${pokemonList[key]?.typeOne} Type 2: ${pokemonList[key]?.typeTwo}"
            listItems.add(pokemon)
        }
        return listItems
    }

    private fun randomTypes(type1: String, type2: String, pokemonList : Map<String, Pokemon>): Map<String, Pokemon> {
        println(type1)
        println(type2)
        println(pokemonList)
        val filteredMap: Map<String, Pokemon> = if (type2 == "None") {
            pokemonList.filterValues { it.typeOne == type1 || it.typeTwo == type1}
        } else {
            pokemonList.filterValues { (it.typeOne  == type1 || it.typeTwo == type1) || (it.typeOne == type2 || it.typeTwo == type2)}
        }
        return filteredMap
    }
}