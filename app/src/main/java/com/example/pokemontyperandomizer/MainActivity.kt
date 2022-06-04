package com.example.pokemontyperandomizer

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    var backPressedTime: Long = 0

    data class Pokemon (
        val typeOne: String,
        val typeTwo: String,
        val game: String
    )

    private var allPokemon = mutableMapOf<String, Pokemon>()
    fun populateAllPokemon() {
        //This manually writes every Pokemon to the mutable map and associates each with a list created by the data class
        allPokemon["Serperior"] = Pokemon("Grass", "---", "BW")
        allPokemon["Emboar"] = Pokemon("Fire", "Fighting", "BW")
        allPokemon["Samurott"] = Pokemon("Water", "---", "BW")
        allPokemon["Watchog"] = Pokemon("Normal", "---", "BW")
        allPokemon["Stoutland"] = Pokemon("Normal", "---", "BW")
        allPokemon["Liepard"] = Pokemon("Dark", "---", "BW")
        allPokemon["Simisage"] = Pokemon("Grass", "---", "BW")
        allPokemon["Simisear"] = Pokemon("Fire", "---", "BW")
        allPokemon["Simipour"] = Pokemon("Water", "---", "BW")
        allPokemon["Musharna"] = Pokemon("Psychic", "---", "BW")
        allPokemon["Unfezant"] = Pokemon("Normal", "Flying", "BW")
        allPokemon["Zebstrika"] = Pokemon("Electric", "---", "BW")
        allPokemon["Gigalith"] = Pokemon("Rock", "---", "BW")
        allPokemon["Swoobat"] = Pokemon("Psychic", "Flying", "BW")
        allPokemon["Excadrill"] = Pokemon("Ground", "Steel", "BW")
        allPokemon["Audino"] = Pokemon("Normal", "---", "BW")
        allPokemon["Conkeldurr"] = Pokemon("Fighting", "---", "BW")
        allPokemon["Seismitoad"] = Pokemon("Water", "Ground", "BW")
        allPokemon["Throh"] = Pokemon("Fighting", "---","BW")
        allPokemon["Sawk"] = Pokemon("Fighting", "---", "BW")
        allPokemon["Leavaanny"] = Pokemon("Bug", "Grass", "BW")
        allPokemon["Scolipede"] = Pokemon("Bug", "Poison", "BW")
        allPokemon["Whimsicott"] = Pokemon("Grass", "---", "B")
        allPokemon["Lilligant"] = Pokemon("Grass", "---", "W")
        allPokemon["Basculin"] = Pokemon("Water", "---", "BW")
        allPokemon["Krookodile"] = Pokemon("Ground", "Dark", "BW")
        allPokemon["Darmanitan"] = Pokemon("Fire", "---", "BW")
        allPokemon["Maractus"] = Pokemon("Grass", "---", "BW")
        allPokemon["Crustle"] = Pokemon("Bug", "Rock", "BW")
        allPokemon["Scrafty"] = Pokemon("Dark","Fighting", "BW")
        allPokemon["Sigilyph"] = Pokemon("Psychic", "Flying", "BW")
        allPokemon["Cofagrigus"] = Pokemon("Ghost", "---", "BW")
        allPokemon["Carracosta"] = Pokemon("Water", "Rock", "BW")
        allPokemon["Archeops"] = Pokemon("Rock", "Flying", "BW")
        allPokemon["Garbodor"] = Pokemon("Poison", "---","BW")
        allPokemon["Zoroark"] = Pokemon("Dark", "---", "BW")
        allPokemon["Cinccino"] = Pokemon("Normal", "---", "BW")
        allPokemon["Gothitelle"] = Pokemon("Psychic", "---", "B")
        allPokemon["Reuniclus"] = Pokemon("Psychic", "---", "W")
        allPokemon["Swanna"] = Pokemon("Water", "Flying", "BW")
        allPokemon["Vanilluxe"] = Pokemon("Ice", "---", "BW")
        allPokemon["Sawsbuck"] = Pokemon("Normal", "Grass","BW")
        allPokemon["Emolga"] = Pokemon("Electric", "Flying","BW")
        allPokemon["Escavalier"] = Pokemon("Bug", "Steel","BW")
        allPokemon["Amoonguss"] = Pokemon("Grass", "Poison", "BW")
        allPokemon["Jellicent"] = Pokemon("Water", "Ghost", "BW")
        allPokemon["Alomomola"] = Pokemon("Water", "---", "BW")
        allPokemon["Galvantula"] = Pokemon("Bug", "Electric", "BW")
        allPokemon["Ferrothorn"] = Pokemon("Grass", "Steel", "BW")
        allPokemon["Klinklang"] = Pokemon("Steel", "---", "BW")
        allPokemon["Eelektross"] = Pokemon("Electric", "---", "BW")
        allPokemon["Beheeyem"] = Pokemon("Psychic", "---", "BW")
        allPokemon["Chandelure"] = Pokemon("Ghost", "Fire", "BW")
        allPokemon["Haxorus"] = Pokemon("Dragon", "---", "BW")
        allPokemon["Beartic"] = Pokemon("Ice", "---", "BW")
        allPokemon["Cryogonal"] = Pokemon("Ice", "---", "BW")
        allPokemon["Accelgor"] = Pokemon("Bug", "---", "BW")
        allPokemon["Stunfisk"] = Pokemon("Ground", "Electric", "BW")
        allPokemon["Mienshao"] = Pokemon("Fighting", "---", "BW")
        allPokemon["Druddigon"] = Pokemon("Dragon", "---", "BW")
        allPokemon["Golurk"] = Pokemon("Ground", "Ghost", "BW")
        allPokemon["Bisharp"] = Pokemon("Dark", "Steel", "BW")
        allPokemon["Bouffalant"] = Pokemon("Normal", "---", "BW")
        allPokemon["Braviary"] = Pokemon("Normal", "Flying", "W")
        allPokemon["Mandibuzz"] = Pokemon("Dark", "Flying", "B")
        allPokemon["Heatmor"] = Pokemon("Fire", "---", "BW")
        allPokemon["Durant"] = Pokemon("Bug", "Steel", "BW")
        allPokemon["Hydreigon"] = Pokemon("Dark", "Dragon", "BW")
        allPokemon["Volcarona"] = Pokemon("Bug", "Fire","BW")
        allPokemon["Cobalion"] = Pokemon("Steel", "Fighting", "BW")
        allPokemon["Terrakion"] = Pokemon("Rock", "Fighting", "BW")
        allPokemon["Virizion"] = Pokemon("Grass", "Fighting", "BW")
        allPokemon["Tornadus"] = Pokemon("Flying", "---", "BW")
        allPokemon["Thundurus"] = Pokemon("Electric", "Flying", "BW")
        allPokemon["Reshiram"] = Pokemon("Dragon", "Fire", "W")
        allPokemon["Zekrom"] = Pokemon("Dragon", "Electric", "B")
        allPokemon["Landorus"] = Pokemon("Ground", "Flying","BW")
        allPokemon["Kyurem"] = Pokemon("Dragon", "Ice", "BW")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val randomizeButton = findViewById<Button>(R.id.randomize_button)
        val type1Spinner: Spinner = findViewById(R.id.type1_dropdown)
        val type2Spinner: Spinner = findViewById(R.id.type2_dropdown)
        val pokemonTypes: List<String> = listOf("Normal", "Fighting", "Flying", "Poison", "Ground", "Rock", "Bug", "Ghost", "Steel", "Fire", "Water", "Grass", "Electric", "Psychic", "Ice", "Dragon", "Dark")

        randomizeButton.setOnClickListener {
            var choice1 = type1Spinner.selectedItem.toString()
            var choice2 = type2Spinner.selectedItem.toString()
            var type1: String
            var type2: String = "---"
            //If choice1 or choice2 are random, generate random types and make sure they don't match
            if (choice1 == "Random") {
                val random = (0..16).random()
                type1 = pokemonTypes[random]
                println(type1)
            }
            else {type1 = choice1}
            if (choice2 == "Random") {
                var rollRandom: Boolean = true
                while (rollRandom) {
                    var random = (0..16).random()
                    type2 = pokemonTypes[random]
                    println(type2)
                    if (type2 == type1) {
                        random = (0..16).random()
                    }
                    else if (type2 != type1) {
                        type2 = pokemonTypes[random]
                        rollRandom = false
                    }
                }
            }
            else {type2 = choice2}
            //After choices are selected, fetch Pokemon
            if (allPokemon.isEmpty()) {
                populateAllPokemon()
            }
            val pokemonList: Map<String, Pokemon> = randomTypes(type1, type2)
            //Display results to user.
            val listItems = mutableListOf<String>()

            val headingString = "Type 1: $type1 \nType 2: $type2"
            listItems.add(headingString)
            for (key in pokemonList.keys) {
                val pokemon = "$key -> \n    Type 1: ${pokemonList[key]?.typeOne} Type 2: ${pokemonList[key]?.typeTwo} Game: ${pokemonList[key]?.game}"
                listItems.add(pokemon)
            }
            setContentView(R.layout.activity_results)
            val listView: ListView = findViewById<ListView>(R.id.results_list)
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
            listView.adapter = adapter
        }

    }
    override fun onBackPressed() {
        if (backPressedTime + 3000 > System.currentTimeMillis()) {
            super.onBackPressed()
            finish()
        } else {
            Toast.makeText(this, "Press back again to leave the app.", Toast.LENGTH_LONG).show()
        }
        backPressedTime = System.currentTimeMillis()
    }

    private fun randomTypes(type1: String, type2: String): Map<String, Pokemon> {
        var filteredMap: Map<String, Pokemon>
        filteredMap = if (type2 == "None") {
            allPokemon.filterValues { it.typeOne == type1 || it.typeTwo == type1}
        } else {
            allPokemon.filterValues { (it.typeOne  == type1 || it.typeTwo == type1) || (it.typeOne == type2 || it.typeTwo == type2)}
        }
        return filteredMap
    }
}
class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {

    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        return parent.getItemAtPosition(pos) as Unit
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }
}