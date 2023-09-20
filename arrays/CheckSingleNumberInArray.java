/**
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once

int[] nums = {2, 4, 6, 4, 2};
We want to find the single number in this array, which is 6. Here's how the code works step by step:

Initialize bitmask to 0:

makefile
bitmask = 0
Enter the for-each loop:

i is set to the first element, which is 2.

Update bitmask by XORing it with i:
makefile
bitmask = 0 ^ 2 = 2
Move to the next element, which is 4.

Update bitmask again:
makefile
bitmask = 2 ^ 4 = 6
Continue with the loop:

i is set to 6.
Update bitmask:
makefile
bitmask = 6 ^ 6 = 0
The loop continues:

i is set to 4.
Update bitmask:
makefile
bitmask = 0 ^ 4 = 4
Finally, i is set to 2.

Update bitmask one last time:
makefile
bitmask = 4 ^ 2 = 6
The loop completes, and bitmask now holds the value 6.

The return bitmask; statement returns 6 as the result of the singleNumber method.

So, for the input array {2, 4, 6, 4, 2}, the code correctly identifies and returns the single number, which is 6, by using bitwise XOR operations to cancel out the duplicate occurrences of other numbers.

Different bit manipulation techniques are used in various scenarios depending on the specific problem you're trying to solve. Here are some common bit manipulation techniques along with examples of when to use them:

Bitwise AND (&) and Bitwise OR (|):

AND (&): Used to mask out or clear specific bits while leaving others unchanged.
OR (|): Used to set specific bits.
Example:

Use Case for AND (&): You want to clear specific bits in a binary number. For example, to clear the lower 3 bits of a number, you can use number & ~7.
Use Case for OR (|): You want to set specific bits to 1. For example, to set the 2nd and 4th bits of a number, you can use number | 10.
Bitwise XOR (^):

Used to toggle specific bits. When XORed with 1, it flips the bit's value.
Example:

Use Case for XOR (^): You want to toggle (flip) specific bits in a binary number. For example, to toggle the 3rd and 5th bits of a number, you can use number ^ 26.
Bitwise NOT (~):

Used to flip all the bits in a number, turning 1s into 0s and vice versa.
Example:

Use Case for NOT (~): You want to invert all the bits in a binary number. For example, to invert all bits in a number, you can use ~number.
Bit Shifting (<< and >>):

Left Shift (<<): Used to multiply a number by a power of 2. Shifts the bits to the left.
Right Shift (>>): Used to divide a number by a power of 2. Shifts the bits to the right.
Example:

Use Case for Left Shift (<<): You want to multiply a number by 2^n. For example, to multiply a number by 8 (2^3), you can use number << 3.
Use Case for Right Shift (>>): You want to divide a number by 2^n. For example, to divide a number by 4 (2^2), you can use number >> 2.
Bit Counting (Hamming Weight):

Used to count the number of set bits (1s) in a binary number.
Example:

Use Case for Bit Counting: You want to count the number of set bits in a binary number. For example, to count the number of 1s in the binary representation of 13 (1101), you can use a bit counting algorithm.
Bit Masks:

Used to extract or manipulate specific bits in a binary number using predefined masks.
Example:

Use Case for Bit Masks: You want to extract the middle 4 bits of a binary number. You can use a mask like 0b00111100 (0x3C) to extract those bits.

**/
lass Solution {
    public int singleNumber(int[] nums) {
        int bitmask=0;
        for(int i:nums){
          /**
          Convert 2 and 4 to binary:
2 in binary: 0010
4 in binary: 0100
Perform the bitwise XOR operation:

markdown
Copy code
0010
0100
----
0110
Convert the result back to decimal:
0110 in binary is equal to 6 in decimal.
So, 2 ^ 4 equals 6 in decimal notation because it's the result of performing a bitwise XOR operation on the binary representations of 2 and 4.
          **/
           bitmask^=i;
            
        }
        return bitmask;
    }
    
}
