# 💰 Dealer Ledger Balancing

This is a Java program that helps a gold dealer track and balance their daily transaction ledger.

---

## 🧩 Problem Statement

You are building a feature for a **dealer management system** in an accounting ERP. The system tracks daily transactions between a **gold dealer** and clients.

Each transaction is either a **credit** (money in) or a **debit** (money out). You're given an array `transactions[]` where each `transactions[i]` represents the net transaction on day `i`:

- Positive → credit  
- Negative → debit

The dealer wants to know the **minimum number of days** required to **balance the ledger**, i.e., find the first day `j` such that the **cumulative sum** from day `0` to day `j` becomes **0**.

If it is **impossible** to balance the ledger, return `-1`.

---

## 📥 Input

1. An integer `n` representing the number of days.
2. A list of `n` integers where each integer represents `transactions[i]`.

---

## 📤 Output

A single integer:
- The **minimum number of days** (1-based index) to balance the ledger, or  
- `-1` if it's not possible.

---

## ✅ Constraints

- `1 <= n <= 10^5`  
- `-10^4 <= transactions[i] <= 10^4`

---

## 📘 Examples

### Example 1

Input:
5
1 2 -3 4 -4

Output:
3

**Explanation:**  
Day 1: 1  
Day 2: 1 + 2 = 3  
Day 3: 3 + (-3) = 0 ✅ → Ledger balanced on day 3

---

### Example 2
Input:
3
1 2 3

Output:
-1

**Explanation:**  
Balance never becomes 0.

---

### Example 3
Input:
6
5 -2 -3 2 -1 -1

Output:
3


**Explanation:**  
Day 1: 5  
Day 2: 3  
Day 3: 0 ✅

---

### Example
