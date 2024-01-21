Multithreaded Fibonacci Calculation

This Java program demonstrates the calculation of the Fibonacci sequence using two different approaches: dynamic programming with iteration and recursion. The calculations are performed concurrently using two separate threads.
Classes
1. Threads9 Class (Dynamic Programming)

The Threads9 class extends the Thread class and overrides the run method. It calculates the 40th Fibonacci number using dynamic programming with iteration. The time taken to perform the calculation is measured, and the result along with the execution time is printed to the console.
2. Threads8 Class (Recursion)

The Threads8 class extends the Thread class as well. It calculates the 40th Fibonacci number using a recursive approach. Similar to Threads9, the time taken for the calculation is measured, and the result, along with the execution time, is printed to the console.
3. Main Class (Threads8)

The main class initializes instances of both Threads8 and Threads9, starts the threads, waits for their completion using join(), and prints the results. This class serves as the entry point to the program.
Usage

    Run the Threads8 class.
    The program will start two threads, one for dynamic programming and one for recursion.
    Each thread calculates the 40th Fibonacci number and prints the result along with the execution time.
    The program ensures that both threads complete their calculations before printing the final results.

Note

    The use of multithreading allows for concurrent execution of the Fibonacci calculations, potentially improving overall performance.

    Adjust the Fibonacci sequence number (currently set to 40) based on your requirements.

Feel free to explore and modify the code to experiment with different Fibonacci numbers or further optimize the implementation.
