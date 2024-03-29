# 数据结构课件

《数据结构》是计算机程序设计和数据处理的重要理论与技术基础，是信息资源管理领域专业人员应具备的核心知识。内容包括：线性表、栈和队列、字符串、树与森林、图、排序、查找等。通过本课程的学习，使学生掌握数据结构的特点、存储方法和基本运算，初步掌握算法的时间和空间分析技术，能够针对不同数据对象的特性，选择适当的数据结构和存储结构以及相应的算法，解决实际问题，为后续技术类专业课程的学习打下坚实的基础。

为方便课件编写，本课件采用LaTex Beamer编写，并采用tikz对一些重要图形进行绘制，保证效果。读者也可直接下载编译后的pdf文件。

欢迎反馈问题和建议。

## 知识地图
### 线性结构
  - 结构之一：线性表, 实例：约瑟夫环
  - 结构之二：栈（Stack）：同一端进行插入删除， 实例：迷宫
  - 结构之三：队列（Queue）：一端插入、一端删除，实例：迷宫
  - 两种存储：顺序（数组）、离散（链）
  - 递归：实例：汉诺塔，迷宫
  - 两个字符串相关算法：KMP, AC


## 如何编译

首先安装完整的text-live，然后安装dot2tex

dot2tex的安装：

```
pip install dot2tex
```

课件编译：

```
xelatex -shell-escape ds.tex
```

对于dot文件，利用dot编译：

```
dot -Tpdf filename.dot -o filename.pdf
```
仓库中已经提交了dot编译后得到的pdf文件。

本课件在Ubuntu系统下编译，使用了Ubuntu自带的字体，如果在其他系统中编译，可以删除或注释掉如下几行：

```tex
\setmainfont{Ubuntu}
\setsansfont{Ubuntu}
\setmonofont{Ubuntu}
```
## 章节

### 第一章 概论
1.1 课程介绍

1.2 问题求解

1.3 数据结构与抽象数据类型

1.4 算法效率与度量

1.5 SP、OOP与FP

### 第二章 线性表

2.1 线性结构

2.2 顺序表

2.3 链表

2.4 顺序表和链表的比较

### 第三章 栈与队列
3.1 栈

3.2 栈与递归

3.3 队列

3.4 栈与队列的应用

### 第四章 字符串

4.1 串的定义和表示

4.2 串的模式匹配

4.3 高级编程语言中的字符串处理

4.4 正则表达式

### 第五章 树

5.1 树与二叉树

5.2 二叉树的存储结构

5.3 二叉树的遍历

5.4 树和森林

5.5 哈夫曼树

### 第六章 图

6.1 图的基本概念

6.2 图的存储结构

6.3 图的遍历

6.4 最小生成树

6.5 最短路径

### 第七章 排序

7.1 排序问题的基本概念

7.2 插入类排序

7.3 交换类排序

7.4 选择类排序

7.5 归并排序

7.6 外部排序

### 第八章 查找

8.1 静态查找表

8.2 动态查找表

8.3 哈希表

## 直接查看编译好的课件

概论：pdf/introduction.pdf

线性表：pdf/list.pdf

栈+队列：pdf/stack_queue.pdf

树: pdf/tree.pdf

图: pdf/graph.pdf

查找: pdf/serach.pdf

排序: pdf/sort.pdf

## 第三方工具

1. forest – Drawing (linguistic) trees  https://www.ctan.org/pkg/forest

1. tikz-graph http://mirrors.ctan.org/macros/latex/contrib/tkz/tkz-graph/doc/tkz-graph-screen.pdf

1. graphviz: http://mirrors.huaweicloud.com/repository/toolkit/CTAN/macros/latex/contrib/graphviz/graphviz.pdf

1. dot: https://graphviz.gitlab.io/_pages/pdf/dotguide.pdf

1. dot2texi https://ctan.org/pkg/dot2texi

  dot2texi与xelatex冲突，minted与lualatex冲突，暂时不用dot2texi，改用tkz-graph绘制图。

1. tkz-graph
