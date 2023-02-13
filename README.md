# num_to_words
*** This is a task given by Kalvium ***

There are varying opinions amongst writers as to when one should
spell out a number vs. using figures. However there are a few
generally agreed upon rules for doing so. 1 There are 2 of them:
● Numbers beginning a sentence should be spelt out.
● Hyphenate all compound numbers from twenty-one through ninety-nine

Write an implementation of these rules for numbers starting a
sentence. It should take an input of figures and return the number
spelt out. Assume all the numbers given start sentences and your
code will be used like a spell checker for grammar issues related to
numbers. Only worry about up numbers up to 4 digits long. Assume all
numbers are positive.

Examples:
1 digit
0 = zero
5 = five
8 = eight
2 digits
10 = ten
21 = twenty-one
77 = seventy-seven

3 digits
100 = one hundred
303 = three hundred three
555 = five hundred fifty-five

4 digits
2000 = two thousand
3466 = three thousand four hundred sixty-six
2400 = two thousand four hundred

additional rule: The simplest way to express large numbers is
usually best. Instead of 5300 being equal to five thousand three
hundred it should return fifty-three hundred.
