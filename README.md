# Java Lab Experiments (B\.Tech CSE \- 4th Semester)

This repository contains the experiments performed during the **Java Lab** in the **4th semester** of my **B\.Tech (CSE)**.

## Tech Stack
- Java

## IDE
- IntelliJ IDEA

## Folder Structure
Typical structure in this repo:

- `Java/` (or your main lab folder)
    - `com/company/` \- Java package `com.company`
        - `\*.java` \- individual experiment programs (each usually has a `main` method)
- `.gitignore` (at project root and/or inside folders as needed)
- `README.md`

> Note: Java package folders must match the package name inside the file (example: `package com.company;` should be located in `com/company/`).

## How to Run (IntelliJ IDEA)
1. Open the project in IntelliJ IDEA.
2. In the Project view, go to `com/company/`.
3. Open any experiment `\*.java` file that contains `public static void main(String[] args)`.
4. Click the green **Run** icon near `main` (or right\-click the file \-\> **Run**).

## How to Run (Command Line)
From the folder that contains `com/`:

1. Compile (example using one file):
    - `javac com/company/YourClassName.java`
2. Run:
    - `java com.company.YourClassName`

Replace `YourClassName` with the class you want to execute.

## Experiments
This folder includes multiple Java lab experiments such as:
- Constructors in Java (default, parameterized, copy)
- Basic OOP concepts (classes, objects, methods)
- Input/output using `System.out.println`
- Additional lab programs added over the semester

## Notes
- Keep file name and `public class` name the same (example: `Sample.java` must contain `public class Sample`).
- Keep each experiment inside the correct package folder (example: `com/company/`).
- Some files may be intentionally ignored via `.gitignore` (example: local helper files).

## Author
- yashika\-kumari
