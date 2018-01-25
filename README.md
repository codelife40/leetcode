# leetcode
## 每日一题
从今天开始，每天必须完成至少2题。即为保持写代码的手感，也巩固一下编码的基础知识。


### 2018.1.23
题目：Remove Duplicates from Sorted Array

Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example:

```
Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.
```

分析：

- 给定的是一个排序好的列表，只要去掉重复元素即可获取新数组的长度
- 但是题目中要求不能额外的再分配给另一个数组空间，必须在原有数值中操作。
- int[] 类型变量跟List变量不一样，它不提供remove这样的方法。
- 要求用常量的时间复杂度。意味着只能一层循环。
- It doesn't matter what you leave beyond the new length. 这句话也是关键，刚开始没仔细看，一直在想int[]如果不再创建一个新的数组，怎么实现把重复的元素删除。这句话的意思说的很清楚了，就是不在意新数组之后保留的是什么，就是int[]本书数组长度是不变的。只要保证前面的都是唯一即可。


基础知识点：

**时间频度：** 一个算法中的语句执行次数被称为语句频度或时间频度。记为 T(n)

**时间复杂度**

- O() 表示算法的时间复杂度
    - O(1) 表示常数阶复杂度。比如执行次数是一个常数（一层循环）
    - O(n) 表示线性阶复杂度
    - O(n^2) 表示平方阶复杂度
    


解题：RemoveDuplicateFromArray.java

### 2018.1.24
-

题目：查找斐波纳契数列中第 N 个数。
   
   所谓的斐波纳契数列是指：
   
   前2个数是 0 和 1 。
   第 i 个数是第 i-1 个数和第i-2 个数的和。
   斐波纳契数列的前10个数字是：
   
   0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
   
分析：这道题考察的还是基础的基础语法，但是花的时间比想像中多很多，只能证明基础是多么的不扎实。

首先理解什么是斐波纳契数列，从上述例子可以了解清楚。这道题有多种解法，可以递归，但是递归性能不好。
最后用了for循环。

代码：lintcode/easy/FibonacciArray.java

### 2018.1.25
-
题目：来自LintCode
删除链表中等于给定值val的所有节点。

样例：

给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5。

分析：主要还是考察ListNode的基础知识

- 循环链表，当前节点的val值如果等于传进来的值，就将当前节点的next指向到下一个节点。

解题：
RemoveElements.java  这套题先预留着。还没有完全理解。代码是网上搜的，验证通过。

题目：矩阵面积
实现一个矩阵类Rectangle，包含如下的一些成员变量与函数：

两个共有的成员变量 width 和 height 分别代表宽度和高度。
一个构造函数，接受2个参数 width 和 height 来设定矩阵的宽度和高度。
一个成员函数 getArea，返回这个矩阵的面积。

分析: 这道题很简单，主要是考察一个实体类的创建。
代码：Rectangle.java

题目：给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。
样例
对于数组 [3, 2, 1, 4, 5], 排序后为：[1, 2, 3, 4, 5]。

分析：主要考察排序算法，同时也考察java基础语法。
遗留：用不同的排序算法再做一次，获取性能最好的排序。

代码：SortIntegers.java


题目：计算链表中有多少个节点.
样例
给出 1->3->5, 返回 3.

分析：基本语法题，while语句搞定
代码：RemoveElements.java

