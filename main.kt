import kotlin.math.abs
import java.util.Scanner
fun main(){
    var countx = 0
    var counto = 0
    var flagex = 0
    var flageo = 0
    var counte = 0
    val m = "_________"
    val c = mutableListOf(
        mutableListOf(m[0] ,m[1] ,m[2]),
        mutableListOf(m[3] ,m[4] ,m[5]),
        mutableListOf(m[6] ,m[7] ,m[8])
    )
    println("---------\n| ${c[0][0]} ${c[0][1]} ${c[0][2]} |\n| ${c[1][0]} ${c[1][1]} ${c[1][2]} |\n| ${c[2][0]} ${c[2][1]} ${c[2][2]} |\n" +
            "---------")
    val scanner = Scanner(System.`in`)
    loop@while (true) {
        while (true) {
            print("Enter the coordinates: ")
            val firtNum = scanner.next().toIntOrNull()
            val secNum = scanner.next().toIntOrNull()
            if ((firtNum is Int) && (secNum is Int)) {
                if (firtNum > 3 || secNum > 3) {
                    println("Coordinates should be from 1 to 3!")
                    continue
                } else {
                    if (c[firtNum - 1][secNum - 1] == '_' || c[firtNum - 1][secNum - 1] == ' ') {
                        c[firtNum - 1][secNum - 1] = 'X'
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                        continue
                    }
                }
            } else {
                println("You should enter numbers!")
                continue
            }
        }
        println("---------\n| ${c[0][0]} ${c[0][1]} ${c[0][2]} |\n| ${c[1][0]} ${c[1][1]} ${c[1][2]} |\n| ${c[2][0]} ${c[2][1]} ${c[2][2]} |\n" +
                "---------")
        for (i in 0 until 9) {
            if (m[i] == 'O') {
                counto += 1
            } else if (m[i] == 'X') {
                countx += 1
            } else if (m[i] == ' ' || m[i] == '_') {
                counte += 1
            }
        }
        for (i in 0..2) {
            if (c[i][0] == 'O' && c[i][1] == 'O' && c[i][2] == 'O' ) {
                flageo = 1 // to check the  rows
            } else if (c[0][i] == 'O' && c[1][i] == 'O' && c[2][i] == 'O') {
                flageo = 1 // to check the  col
            } else if (c[i][0] == 'X' && c[i][1] == 'X' && c[i][2] == 'X') {
                flagex = 1 // to check the rows
            } else if (c[0][i] == 'X' && c[1][i] == 'X' && c[2][i] == 'X') {
                flagex = 1 // to check the col
            }
        }
        // to check digonals
        if (c[0][0] == 'O' && c[1][1] == 'O' && c[2][2] == 'O') {
            flageo = 1
        } else if (c[0][2] == 'O' && c[1][1] == 'O' && c[2][0] == 'O') {
            flageo = 1
        } else if (c[0][0] == 'X' && c[1][1] == 'X' && c[2][2] == 'X') {
            flagex = 1
        } else if (c[0][2] == 'X' && c[1][1] == 'X' && c[2][0] == 'X') {
            flagex = 1
        }

        if ((abs(counto - countx) == 0 || abs(counto - countx) == 1) && counte == 0 && flagex == 0 && flageo == 0) {
            println("Draw")
            break@loop
        } else if (flageo == 1) {
            println("O wins")
            break
        } else if (flagex == 1) {
            println("X wins")
            break
        }
        while (true) {
            print("Enter the coordinates: ")
            val firtNum = scanner.next().toIntOrNull()
            val secNum = scanner.next().toIntOrNull()
            if ((firtNum is Int) && (secNum is Int)) {
                if (firtNum > 3 || secNum > 3) {
                    println("Coordinates should be from 1 to 3!")
                    continue
                } else {
                    if (c[firtNum - 1][secNum - 1] == '_' || c[firtNum - 1][secNum - 1] == ' ') {
                        c[firtNum - 1][secNum - 1] = 'O'
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                        continue
                    }
                }
            } else {
                println("You should enter numbers!")
                continue
            }
        }
        println("---------\n| ${c[0][0]} ${c[0][1]} ${c[0][2]} |\n| ${c[1][0]} ${c[1][1]} ${c[1][2]} |\n| ${c[2][0]} ${c[2][1]} ${c[2][2]} |\n" +
                "---------")
        for (i in 0 until 9) {
            if (m[i] == 'O') {
                counto += 1
            } else if (m[i] == 'X') {
                countx += 1
            } else if (m[i] == ' ' || m[i] == '_') {
                counte += 1
            }
        }
        for (i in 0..2) {
            if (c[i][0] == 'O' && c[i][1] == 'O' && c[i][2] == 'O' ) {
                flageo = 1 // to check the  rows
            } else if (c[0][i] == 'O' && c[1][i] == 'O' && c[2][i] == 'O') {
                flageo = 1 // to check the  col
            } else if (c[i][0] == 'X' && c[i][1] == 'X' && c[i][2] == 'X') {
                flagex = 1 // to check the rows
            } else if (c[0][i] == 'X' && c[1][i] == 'X' && c[2][i] == 'X') {
                flagex = 1 // to check the col
            }
        }
        // to check digonals
        if (c[0][0] == 'O' && c[1][1] == 'O' && c[2][2] == 'O') {
            flageo = 1
        } else if (c[0][2] == 'O' && c[1][1] == 'O' && c[2][0] == 'O') {
            flageo = 1
        } else if (c[0][0] == 'X' && c[1][1] == 'X' && c[2][2] == 'X') {
            flagex = 1
        } else if (c[0][2] == 'X' && c[1][1] == 'X' && c[2][0] == 'X') {
            flagex = 1
        }

        if ((abs(counto - countx) == 0 || abs(counto - countx) == 1) && counte == 0 && flagex == 0 && flageo == 0) {
            println("Draw")
            break@loop
        } else if (flageo == 1) {
            println("O wins")
            break
        } else if (flagex == 1) {
            println("X wins")
            break
        }
    }

}