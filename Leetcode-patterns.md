# LeetCode Patterns Roadmap

## Goal

The approach is **pattern-first**, not problem-first.

Instead of solving hundreds of unrelated LeetCode problems, learn to
recognize the underlying pattern, understand **why** it works, then
solve progressively harder problems.

------------------------------------------------------------------------

# 1. Patterns We Have Already Discovered

These are the patterns we have already worked on or discussed.

  -----------------------------------------------------------------------
  Pattern                 Status                  Key Thinking
  ----------------------- ----------------------- -----------------------
  Two Pointers            🟡 Covered              Move left/right
                                                  pointers based on a
                                                  condition

  Sliding Window          🟡 Covered              Maintain a valid window
                                                  and expand/shrink it

  BFS                     🟡 Covered              Level-by-level
                                                  exploration using a
                                                  queue

  DFS                     🟡 Covered              Explore deeply using
                                                  recursion/stack

  Monotonic Stack         🟢 Practiced            Maintain
                                                  increasing/decreasing
                                                  order; useful for next
                                                  greater/smaller
                                                  relationships

  Binary Search           🟢 Confident            Search a
                                                  monotonic/ordered
                                                  search space rather
                                                  than only a sorted
                                                  array
  -----------------------------------------------------------------------

### Current focus

We have specifically practiced:

-   **Monotonic Stack**
    -   Stock Span
    -   Next Greater Element style thinking
    -   Understanding right-to-left / previous-element reasoning
    -   Stack-pop condition as the core pattern
-   **Binary Search**
    -   Standard binary search
    -   Recognizing that difficult LeetCode problems often hide binary
        search inside a **search space / answer**

------------------------------------------------------------------------

# 2. The Core Pattern Roadmap

Use this as the overall learning map.

## A. Array & String Patterns

### 1. Two Pointers

**Core idea:** Use two indices that move according to a condition.

Typical problems: - Two Sum II - 3Sum - Container With Most Water -
Remove Duplicates - Palindrome

**Recognition clue:** \> Can I solve this by looking at both ends or
maintaining two positions?

------------------------------------------------------------------------

### 2. Sliding Window

**Core idea:** Maintain a contiguous range and adjust its boundaries.

Typical problems: - Longest Substring Without Repeating Characters -
Minimum Window Substring - Maximum Sum Subarray of Size K - Longest
Repeating Character Replacement

**Recognition clue:** \> Is the problem asking about a contiguous
subarray/substring?

------------------------------------------------------------------------

### 3. Prefix Sum

**Core idea:** Precompute cumulative information so range calculations
become fast.

Typical problems: - Range Sum Query - Subarray Sum Equals K - Continuous
Subarray Sum

**Recognition clue:** \> Do I repeatedly need the sum/value of a range?

------------------------------------------------------------------------

### 4. Hashing / Frequency Map

**Core idea:** Trade memory for O(1) average lookup.

Typical problems: - Two Sum - Group Anagrams - Longest Consecutive
Sequence - Frequency counting

**Recognition clue:** \> Do I need fast existence, frequency, or mapping
lookup?

------------------------------------------------------------------------

# 3. Stack & Queue Patterns

## 5. Monotonic Stack ⭐

**Core idea:**

Keep the stack ordered.

``` text
Increasing Stack
    ↓
Next Smaller

Decreasing Stack
    ↓
Next Greater
```

Typical problems: - Stock Span - Next Greater Element - Daily
Temperatures - Largest Rectangle in Histogram - Trapping Rain Water

**Recognition clue:** \> Do I need to find the nearest greater/smaller
element?

Important mental model:

> Don't memorize "increasing" or "decreasing" first.\
> Ask: **When is the current element better than the stack top?**

------------------------------------------------------------------------

## 6. Monotonic Queue

**Core idea:** Maintain useful candidates inside a deque.

Typical problems: - Sliding Window Maximum - Sliding Window Minimum

**Recognition clue:** \> Sliding window + need the maximum/minimum
efficiently.

------------------------------------------------------------------------

# 4. Binary Search Patterns

## 7. Binary Search on Sorted Data ⭐

**Core idea:**

Reduce the search space by half.

``` text
left        mid        right
  |----------|----------|
```

Typical problems: - Binary Search - Search Insert Position - First/Last
Position - Search in Rotated Sorted Array

------------------------------------------------------------------------

## 8. Binary Search on Answer ⭐

**Core idea:**

The answer itself is a search space.

Example:

``` text
Possible answer:

1  2  3  4  5  6  7  8  9
        ❌ ❌ ❌  ✅  ✅  ✅
```

Find the boundary between impossible and possible.

Typical problems: - Capacity to Ship Packages - Koko Eating Bananas -
Split Array Largest Sum - Minimum Time problems

**Recognition clue:**

> Can I check whether a candidate answer is possible?

If yes, ask:

> Is feasibility monotonic?

------------------------------------------------------------------------

# 5. Tree & Graph Patterns

## 9. BFS ⭐

**Core idea:** Explore level by level.

``` text
        A
       / \
      B   C
     / \
    D   E
```

Order:

``` text
A → B → C → D → E
```

Use a **Queue**.

Typical problems: - Level Order Traversal - Shortest Path in an
Unweighted Graph - Rotten Oranges - Word Ladder

**Recognition clue:**

> Shortest path / minimum number of steps in an unweighted graph?

Think BFS.

------------------------------------------------------------------------

## 10. DFS ⭐

**Core idea:** Explore one path deeply before backtracking.

Use:

-   Recursion
-   Explicit Stack

Typical problems: - Number of Islands - Tree Traversal - Connected
Components - Cycle Detection

**Recognition clue:**

> Do I need to explore an entire component/path?

Think DFS.

------------------------------------------------------------------------

## 11. Backtracking

**Core idea:**

``` text
Choose
  ↓
Explore
  ↓
Undo
  ↓
Choose again
```

Typical problems: - Permutations - Combinations - Subsets - N-Queens -
Sudoku

**Recognition clue:**

> Need to generate all possible choices/configurations?

------------------------------------------------------------------------

# 6. Linked List Patterns

## 12. Fast & Slow Pointers

Use two pointers moving at different speeds.

Typical problems: - Detect Cycle - Find Middle - Remove Nth Node - Find
Cycle Entry

**Recognition clue:**

> Linked list + cycle/middle/relative position?

Think fast/slow pointers.

------------------------------------------------------------------------

## 13. In-place Linked List Reversal

**Core idea:**

``` text
A → B → C → null

becomes

C → B → A → null
```

Typical problems: - Reverse Linked List - Reverse Linked List II -
Reverse Nodes in K Group

------------------------------------------------------------------------

# 7. Heap / Priority Queue Patterns

## 14. Top K Elements

Use a heap to avoid sorting everything.

Typical problems: - Kth Largest Element - Top K Frequent Elements - K
Closest Points

**Recognition clue:**

> Need top/bottom K without fully sorting?

Think Heap.

------------------------------------------------------------------------

## 15. Two Heaps

Maintain two halves of the data.

Typical problem: - Find Median from Data Stream

**Recognition clue:**

> Need dynamic median / maintain lower and upper halves?

------------------------------------------------------------------------

# 8. Intervals

## 16. Merge Intervals

Sort by starting position and merge overlapping ranges.

Typical problems: - Merge Intervals - Insert Interval - Non-overlapping
Intervals

**Recognition clue:**

> Multiple ranges/appointments/time periods that may overlap?

------------------------------------------------------------------------

## 17. Interval Scheduling

Typical problems: - Meeting Rooms - Meeting Rooms II - Maximum Number of
Meetings

**Recognition clue:**

> Scheduling + overlapping time ranges?

------------------------------------------------------------------------

# 9. Greedy

## 18. Greedy

Make the best local choice while maintaining a path toward the global
solution.

Typical problems: - Jump Game - Gas Station - Activity Selection -
Partition Labels

**Recognition clue:**

> Can I make an irreversible local decision that remains optimal?

------------------------------------------------------------------------

# 10. Dynamic Programming

## 19. 1D Dynamic Programming

Typical problems: - Climbing Stairs - House Robber - Coin Change

**Recognition clue:**

> Current answer depends on previously solved smaller states.

------------------------------------------------------------------------

## 20. 2D Dynamic Programming

Typical problems: - Grid paths - Longest Common Subsequence - Edit
Distance

**Recognition clue:**

> State depends on two dimensions such as index + index or row + column.

------------------------------------------------------------------------

## 21. Knapsack Pattern

Typical problems: - 0/1 Knapsack - Partition Equal Subset Sum - Target
Sum

**Recognition clue:**

> Choose items under a capacity/target constraint.

------------------------------------------------------------------------

# 11. Graph Patterns

## 22. Graph Traversal

-   BFS
-   DFS
-   Connected Components
-   Cycle Detection

------------------------------------------------------------------------

## 23. Topological Sort

Use when there are dependencies.

``` text
A → B → C
```

Typical problems: - Course Schedule - Build Order - Dependency
Resolution

**Recognition clue:**

> "A must happen before B."

------------------------------------------------------------------------

## 24. Union Find / Disjoint Set

Track connected components efficiently.

Typical problems: - Number of Connected Components - Redundant
Connection - Kruskal's MST

**Recognition clue:**

> Dynamic connectivity / grouping / merging components.

------------------------------------------------------------------------

## 25. Shortest Path

Major approaches:

  Problem Type             Pattern
  ------------------------ ----------------
  Unweighted               BFS
  Weighted, non-negative   Dijkstra
  Negative edges           Bellman-Ford
  All-pairs                Floyd-Warshall

------------------------------------------------------------------------

# 12. Advanced Patterns

These come later.

## 26. Trie

Prefix-based searching.

Examples: - Word Search - Autocomplete - Prefix Matching

------------------------------------------------------------------------

## 27. Bit Manipulation

Examples: - Single Number - Power of Two - XOR tricks - Bit masks

------------------------------------------------------------------------

## 28. Sweep Line

Useful for interval/event problems.

Examples: - Meeting overlaps - Calendar problems - Maximum concurrent
events

------------------------------------------------------------------------

## 29. Segment Tree / Fenwick Tree

For efficient dynamic range queries.

Learn later; don't prioritize initially.

------------------------------------------------------------------------

# Recommended Learning Order

Don't learn these randomly.

Follow this progression:

``` text
                    START
                      │
                      ▼
              Arrays & Hashing
                      │
          ┌───────────┴───────────┐
          ▼                       ▼
    Two Pointers            Prefix Sum
          │                       │
          └───────────┬───────────┘
                      ▼
               Sliding Window
                      │
                      ▼
              Stack / Queue
                      │
                      ▼
              Monotonic Stack
                      │
                      ▼
               Binary Search
                      │
          ┌───────────┴───────────┐
          ▼                       ▼
         Trees                  Heap
          │
      ┌───┴───┐
      ▼       ▼
     BFS     DFS
      │       │
      └───┬───┘
          ▼
      Backtracking
          │
          ▼
        Greedy
          │
          ▼
    Intervals
          │
          ▼
    Graph Patterns
          │
          ▼
         DP
          │
          ▼
       Advanced
```

------------------------------------------------------------------------

# Our Current Position

``` text
Two Pointers       🟡
Sliding Window     🟡
BFS                🟡
DFS                🟡
Monotonic Stack    🟢
Binary Search      🟢
```

### Next recommended pattern

Since you've already touched the major foundational patterns, I
recommend:

> **Prefix Sum + HashMap**

This is a very useful bridge between the simpler patterns and the
trickier LeetCode problems.

The key lesson will be:

> **"Instead of repeatedly calculating a range, can I remember what I've
> already seen?"**

After that, we can move through the remaining patterns one by one,
without going deep into every problem immediately.

------------------------------------------------------------------------

# The Learning Rule

For every new pattern, use the same process:

### 1. Recognition

> **When should I think of this pattern?**

### 2. Mental model

> **Why does this pattern work?**

### 3. Template

> **What is the basic implementation structure?**

### 4. One easy problem

Understand the pattern.

### 5. One medium problem

Learn to recognize the hidden pattern.

### 6. One tricky problem

Learn how LeetCode disguises it.

### 7. Move on

Don't spend a week mastering one pattern.

------------------------------------------------------------------------

## The ultimate goal

You should eventually see a new LeetCode problem and think:

``` text
"What is this problem really asking?"

        ↓

"Contiguous range?"
        → Sliding Window

"Nearest greater/smaller?"
        → Monotonic Stack

"Sorted / monotonic answer?"
        → Binary Search

"Shortest unweighted path?"
        → BFS

"Explore all possibilities?"
        → DFS / Backtracking

"Repeated range calculation?"
        → Prefix Sum

"Top K?"
        → Heap

"Overlapping ranges?"
        → Intervals

"Dependencies?"
        → Topological Sort

"Optimal subproblem?"
        → Dynamic Programming
```

That **pattern recognition** is the skill we're trying to build---not
memorizing LeetCode solutions.
