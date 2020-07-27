package com.example.demo.main

import tornadofx.*

class GameView(var model :Table) : View("My View") {

    private val controller: GameController by inject()

    override val root = borderpane {
        
    }
}
