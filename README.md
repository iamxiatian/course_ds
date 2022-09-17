# 数据结构课件

《数据结构》是计算机程序设计和数据处理的重要理论与技术基础，是信息资源管理领域专业人员应具备的核心知识。内容包括：线性表、栈和队列、字符串、树与森林、图、排序、查找等。通过本课程的学习，使学生掌握数据结构的特点、存储方法和基本运算，初步掌握算法的时间和空间分析技术，能够针对不同数据对象的特性，选择适当的数据结构和存储结构以及相应的算法，解决实际问题，为后续技术类专业课程的学习打下坚实的基础。

为方便课件编写，本课件采用LaTex Beamer编写，并采用tikz对一些重要图形进行绘制，保证效果。读者也可直接下载编译后的pdf文件。

欢迎反馈问题和建议。


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

## 直接查看编译好的课件

概论：pdf/introduction.pdf

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
