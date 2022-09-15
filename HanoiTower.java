// Three towers, A B C
// src: A, dest: C
// Move disk 1 ~ n-1 from A to B
// Move disk n from A to C
// Move disk 1 ~ n-1 from B to C

// Pseudocode
// Hanoi (n, src, dest, spare)
//   if n == 1
//     Move disk from src to dest
//   else
//     Hanoi(n-1, src, spare, dest)
//     move disk from src to dest
//     Hanoi(n-1, spare, dest, src)

// Time Complexity 2T(n-1) + 1 -> O(2^n)
// Space Complexity O(n)
class Algo {
  public static void hanoi (int n, char from, char dest, char spare) {
    if (n == 0) return;
    hanoi(n-1, from, spare, dest);
    System.out.println("Move disk " + n " from " + from + " to " + dest);
    hanoi(n-1, spare, dest, from);
  }
}
