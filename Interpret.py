#!/usr/bin/env python

file = open("Mediator.txt", "r")
list = file.readlines()
a = int(list[0])
b = int(list[1])
c = a * b
file.close()
file = open("Mediator.txt", "a")
file.write(str(c))
file.close()
