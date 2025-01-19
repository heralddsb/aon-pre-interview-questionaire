#Task 1: Part 1

## Solution Design

The solution uses a **Decorator Pattern** to measure how long the increment and decrement methods take, without changing the original implementation. A **TimedIncDec** class wraps the existing **IncDec** object, adding timing functionality in a clean and reusable way. This keeps the original logic simple, lets clients use the class as usual, and makes it easy to apply the same approach to other implementations.