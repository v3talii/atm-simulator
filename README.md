# Java ATM Simulator

A simple Object-Oriented Programming (OOP) command-line application built with Java, designed for practicing core programming logic, modular class architecture, and user authentication flows.

## Architecture & Classes

The project is built around a clean 3-class structure, separating data management, business logic, and execution:

*   **`Account.java` (Data & Operations):** Manages user credentials (name, surname, PIN code) and financial states (balance).
*   Contains core business logic methods like `deposit()` and `withdraw()` with strict validation checks (preventing negative amounts and overdrafts).
*   **`Control.java` (Logic & Navigation):** Handles the terminal control flow.
*   It manages security through a 3-attempt PIN authentication loop and drives the interactive main menu using a `do-while` loop combined with a `switch-case` statement.
*   **`Main.java` (Entry Point):** The application starting point that initializes the account entity, binds it to the control system, and triggers the session.

## Features

*   **Secure Authentication:** 3-attempt PIN verification system with security lockout.
*   **Interactive CLI Menu:** Real-time navigation for checking balance, depositing funds, withdrawing cash, and exiting safely.
*   **Robust Error Handling:** Input validation against negative values and insufficient funds.

## Technologies Used

*   **Java** (Core OOP, Encapsulation, Methods, Control Flow)
*   **Scanner API** for console input reading
*   **VS Code** & Terminal (`javac` / `java`) for manual compilation and testing

## How to Run

1. Clone the repository:
   bash
   git clone [https://github.com/v3talii/atm-simulator.git](https://github.com/v3talii/atm-simulator.git)
