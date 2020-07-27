package com.example.demo.main

import kotlin.random.Random

class Table(var x: Int, var y: Int) {
    var cells = Array(x) { BooleanArray(y) }
    var neighbourcount_matrix = Array(x) { IntArray(y) }
    var secondary_array = Array(x) { BooleanArray(y) }


    fun print(): Unit {
        var k = 0
        for (som in cells) {
            for (kel in som) {
                print(if(kel)1 else 0)
                k++
                if (k % x == 0)
                    println("")
            }
        }
    }
    fun printn(): Unit {
        var k = 0
        for (som in neighbourcount_matrix) {
            for (kel in som) {
                print (kel)
                k++
                if (k % x == 0)
                    println("")
            }
        }
    }

    fun randfill(): Unit {
        for (i in 0 until cells.size) {
            for (j in 0 until cells[i].size) {
                cells[i][j] = Random.nextBoolean()


            }
        }
    }

    fun nextgen(): Unit {
        for (i in 0 until cells.size) {
            for (j in 0 until cells[i].size) {

                secondary_array[i][j] = countNeighbours(i,j)


            }
        }
        for (i in 0 until cells.size) {
            for (j in 0 until cells[i].size) {

                cells[i][j]=secondary_array[i][j]


            }
        }

    }

    fun countNeighbours(xpoz: Int, ypoz: Int): Boolean {
        var ncount: Int = 0
        for (i in xpoz - 1..xpoz + 1) {
            for (j in ypoz - 1..ypoz + 1) {

                ncount += if (cells[Math.floorMod(i,x)][Math.floorMod(j,y)]) 1 else 0

            }
        }
        ncount-=if(cells[xpoz][ypoz]) 1 else 0
        neighbourcount_matrix[xpoz][ypoz]=ncount
        return ncount==3 || cells[xpoz][ypoz]&&ncount==2
    }


}