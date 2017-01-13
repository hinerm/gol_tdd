# Game of Life - TDD style
Test driven starting point for game of life.

A straightforward way to approach this repo is to build it and run the tests with Maven, then add implementations until all the tests pass.

From there, think about what methods and classes might be helpful and write unit tests for these classes before creating the interfaces/method signatures (e.g. can we make more efficient methods of creating a Universe?)

Most of the tests written at this point should be "down the middle" tests for expected behavior. The next task is to add tests for edge cases (e.g. if I have two equivalent Universes created by different methods are they actually equal? What about after taking a step?).
