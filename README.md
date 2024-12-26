## Problem description
Software developers at Amazon are developing a new library for Natural Language Processing. In one of its modules, every string needts to be preprocessed in a particular manner to find the length of its longest self-sufficient proper substring.

A self-sufficient proper substring is one where
1. the substring is not the entire string s
2. no letter that occurs inside the substring also occurs outside the substring

Given the string fullString of length n, find the length of its longest self-sufficient proper substring. If none exists, return 0.

## Example
Input: fullString = "amazonservices"
Output: 11

Input: "aaaaaaa"
Output: 0

## Explaination
substrings can be amazon, services, azonse, zonservices, etc...  and they have lengths 6, 8, 6, 11, respectively.
"amazon" is self sufficient
"services" is self sufficient
"azonse" is not self sufficient | 'a' occurs outside the substring too
"zonservices" is self sufficient

Take note that zonservices is the longest satisying restrictions 1 and 2.