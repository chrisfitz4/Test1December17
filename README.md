# Test1December17

/////////Problem 1://///////////
Summary: given a list, print out repeats 
Execution: I used a double while loop to cycle through each element once
and compare to every element afterwards. If the element is 
repeated, it is removed from the list to avoid it from comparing 
to additional elements. A double while loop avoids creating 
unnecessary containers, since everything is done on the original list
itself. Also, a forloop is not adviseable for this problem because
the length of the list may change during runtime.

////////Problem 2:///////////////
Summary: given a String, find out if it is a palindrome without using reverse().
Execution: I used an empty String and concatenated the characters from the
original String one at a time to the front of the new String, reversing it.
Then, a .equals call can tell if the strings are the same.

/////////Problem 3://////////////
Summary: for a number, print "fizz" if it is divisible by 3, 
"buzz" if it is divisible by 5, and "fizzbuzz" if it is divisible
by 15
Execution: Using the modular function "%", you can tell if a number
is divisible by 3 and 5, if the remainder is 0. Have a string, and if 
it is divisible by 3, add fizz to it. If it is divisible by 5 (not
if else), add buzz to it. You do not need to check 15 since, if the
number is divisible by 3 and 5, it is divisible by 15.

Screenshots are located in the issues tab of GitHub.

