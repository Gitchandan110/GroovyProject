package com.test.groovy


//Refer this url:  https://groovy-lang.org/operators.html


assert 2 * 3==6

assert 9 / 3==3

assert 5 + 6==11

assert 2 ** 3==8

assert 10 % 3==1

assert 100 - 99 == 1

//Unary arithmetics operators

assert +3 == 3

assert -4 == 0 - 4

assert -(-1) == 1

def a = 2
def b = a++ * 3


def c = 3
def d = c-- * 2


assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2



