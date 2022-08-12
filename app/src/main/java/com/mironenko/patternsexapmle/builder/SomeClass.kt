package com.mironenko.patternsexapmle.builder

class SomeClass private constructor(
    private var number: Int,
    private var word: String,
    private var letter: String
) {
    class Builder() {
        private var number = 0
        private var word = ""
        private var letter = "A"

        fun withNumber(number: Int): Builder {
            this.number = number
            return this
        }

        fun withWord(word: String): Builder {
            this.word = word
            return this
        }

        fun withLetter(letter: String): Builder {
            if(letter.length == 1) {
                this.letter = letter
            }
            return this
        }

        fun build(): SomeClass {
            return SomeClass(number, word, letter)
        }
    }
}