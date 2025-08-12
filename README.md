# 💰 Bank Account Simulation

A simple **Java CLI-based Bank Account Simulation** that demonstrates OOP concepts like Classes, Inheritance, and Method Overriding.

---

## 📌 Task Overview

**Task 5: Bank Account Simulation**

- **Objective:** Simulate basic bank operations such as deposit, withdrawal, interest calculation, and transaction history.
- **Tools Used:** Java, VS Code / IntelliJ, Terminal
- **Key Concepts:** Classes, Inheritance, Method Overriding, Encapsulation

---

## 📂 File Structure

```
📁 BankAccountSimulation
└── BankAccountSimulation.java   // Main Java program file
└── README.md                    // Documentation file
```

---

## 💡 Features

- ✅ Create Savings Account
- ✅ Deposit Money
- ✅ Withdraw Money
- ✅ Display Account Balance
- ✅ Add Interest to Savings
- ✅ View Transaction History
- ✅ Menu-driven CLI interface

---

## 🚀 How to Run

### Prerequisites
- Install Java JDK
- Use Terminal or Java IDE (VS Code / IntelliJ)

### Steps

1. Save the file as `BankAccountSimulation.java`
2. Open terminal in the file’s directory.
3. Compile:
   ```bash
   javac BankAccountSimulation.java
   ```
4. Run:
   ```bash
   java BankAccountSimulation
   ```

---

## 🔍 Code Overview

### 🏦 Account Class
- Private fields: `accountNumber`, `accountHolder`, `balance`, and `transactionHistory`
- Methods: `deposit()`, `withdraw()`, `displayBalance()`, `printTransactionHistory()`

### 💵 SavingsAccount Class
- Inherits from `Account`
- Adds `interestRate` and method `addInterest()`

### 🖥 Main Class
- Menu-driven CLI to interact with account

---

## 🎯 Learning Outcomes

- Applying OOP concepts in Java
- Implementing Inheritance and Method Overriding
- Managing data with Encapsulation
- Using ArrayList for transaction history

---

## 👨‍💻 Author

**Kshitij Jha**  
Java Developer Intern | Elevate Labs
