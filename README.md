# 数据结构课件


为方便课件编写，本课件采用LaTex Beamer编写，并采用tikz对一些重要图形进行绘制，保证效果。普通读者请直接下载编译后的pdf文件。

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

## 直接查看编译好的课件

tree: pdf/tree.pdf


## 第三方工具

1. forest – Drawing (linguistic) trees  https://www.ctan.org/pkg/forest

1. tikz-graph http://mirrors.ctan.org/macros/latex/contrib/tkz/tkz-graph/doc/tkz-graph-screen.pdf

1. graphviz: http://mirrors.huaweicloud.com/repository/toolkit/CTAN/macros/latex/contrib/graphviz/graphviz.pdf

1. dot: https://graphviz.gitlab.io/_pages/pdf/dotguide.pdf

1. dot2texi https://ctan.org/pkg/dot2texi

  dot2texi与xelatex冲突，minted与lualatex冲突，暂时不用dot2texi，改用tkz-graph绘制图。

1. tkz-graph
