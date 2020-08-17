# lab-5

## Haiku Generator

Haiku is a Japanese poetic form, typically three lines of five syllables, seven syllables, and five syllables.

Example:

```
This is a Haiku
This has seven syllables
Followed by just five
```

- Only three lines, totaling 17 syllables throughout.
- The first line must be only 5 syllables.
- The second line must be comprised of 7 syllables.
- The third line must be 5 syllables like the first.
- Punctuation and capitalization rules are up to the poet, and need not follow rigid rules used in structuring sentences.
- Haiku does not have to rhyme, and usually doesn't.
- Some haiku can include the repetition of words or sounds.

**TIP**: Devise some pattern (Line1 = "The" + one syllable adjective + one syllable noun + etc ...) and use it for all your poems.

More Examples:

```
An old silent pond...
A frog jumps into the pond,
splash! Silence again
```

```
Political ads -
Require suspended thought
and thoughtless suspense.
```

```
sugar castle melts
moat of cream, black coffee rain
pie completes my dream
```

Your assignment is to create a Java program that generates Haikus from randomly selected words from arrays containing one and two syllable nouns, verbs, and adjectives.

Use random numbers to randomly select words and construct a three line Haiku with 5-7-5 syllables

Create arrays that each contain at least ten words of your choosing. The six arrays should contain the following contents:

1. One syllable nouns.
2. Two syllable nouns.
3. One syllable adjectives.
4. Two syllable adjectives.
5. One syllable verbs.
6. Two syllable verbs.

Suggested patter:

```
The <one syllable adjective> <two syllable adjective> <one syllable noun>
<two syllable verb> the <two syllable noun> <two syllable adjective>
<two syllable adjective> <two syllable adjective> <one syllable noun>
```

Use random numbers to select random words from each of your arrays and construct a random Haiku.
Remember that it is poetic and won't read like grammatically correct prose.
Just make sure you have five syllables on the first and third lines, and seven syllables on the second line.
After displaying the Haiku, prompt the user for more (`Y` or `N`) and continue generating new Haikus until they reply with `N`.

Sample Run:

```
WANT A HAIKU? (Y/N) Y

The soft flakey spam
carried the smelly sofa
flakey perky hat.

WANT A HAIKU? (Y/N) Y
The soft smelly dog
whittled the perky beanbag
flakey tasty hat.

WANT A HAIKU? (Y/N) N

I hope you enjoyed the Haiku!!
```

## High Low Game

Create a game where you start with $100 and spin a 10-digit spinner which lands on the value 1-10 (inclusive.)
Guess whether the next spin will be higher or lower.
If you guess correctly, you win $10.
If incorrect, you lose \$10, and if you tie, your money stays intact.

Continue to prompt for another spin and high/low guess until the user chooses to Quit the game.

Sample Run:

```
SPINNER HIGH-LOW GAME
The spinner has 20 numbers from 1-20
You have $ 100
Press Enter to take the first spin...
You spun 14
Spin again... will it be (H)igher or (L)ower or (Q)uit? L
You spun 10
You won $10! You have $ 110
Spin again... will it be (H)igher or (L)ower or (Q)uit? H
You spun 11
You won $10! You have $ 120
Spin again... will it be (H)igher or (L)ower or (Q)uit? H
You spun 11
You Tied! You have $ 120
Spin again... will it be (H)igher or (L)ower or (Q)uit? Q
Ended game with $ 120
```

---

## Compile and Run

### HaikuMaker

    javac HaikuMaker.java
    java HaikuMaker

### HighLow

    javac HighLow.java
    java HighLow
