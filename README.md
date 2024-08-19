# Power of Two Max Heap

This project implements a custom heap data structure where each parent node has `2^k` children. The heap maintains the max-heap property, ensuring that the maximum value is always at the root.

## Features

- Customizable number of children per node (`2^k`).
- Efficient `insert` and `pop max` operations.
- Suitable for priority queue implementations.

## Usage

To compile and run the project:

```bash
javac -d bin src/com/malcolmsanatomy/heap/*.java
java -cp bin com.malcolmsanatomy.heap.Main

