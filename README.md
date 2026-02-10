# University Management System

This project is a Java application developed as part of an Object-Oriented Programming (OOP) assignment. It simulates a basic university management system, allowing the administration of courses, classes, professors, and students.

## Overview

The system models various entities within a university context and demonstrates key OOP concepts such as inheritance, polymorphism, and encapsulation.

### Key Entities

*   **Disciplina (Subject):** Represents a course subject (e.g., Object-Oriented Programming, Logic).
*   **Turma (Class):** Represents a specific class instance, associating a Subject with a Professor and a list of Students.
*   **Professor:** Represents the faculty members.
*   **Aluno (Student):**
    *   **Regular:** Standard students paying full tuition.
    *   **Bolsista (Scholarship Holder):** Students with scholarships (demonstrating polymorphic behavior in tuition payment).
*   **Visitante (Visitor):** External individuals visiting the university.

## Features

*   **Class Enrollment:** Ability to add students to different classes.
*   **Interactive Menu:** A console-based interface to select and view details of specific classes (Turma 1, Turma 2, Turma 3).
*   **Polymorphism Demonstration:**
    *   `pagarMensalidade()`: Demonstrates different implementations for Regular and Scholarship students.
*   **Lifecycle Actions:**
    *   Professors teaching classes (`darAula`).
    *   Celebrating birthdays (`fazerAniversario`).

## How to Run

1.  Ensure you have Java installed.
2.  Clone the repository or download the source code.
3.  Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
4.  Run the `Main.java` file.
5.  Follow the instructions in the console to interact with the system.