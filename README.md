# 数据结构课件


为方便课件编写，本课件采用LaTex Beamer编写，并采用tikz对一些重要图形进行绘制，保证效果。普通读者请直接下载编译后的pdf文件。

## 如何编译
```
xelatex -shell-escape ds.tex
```

对于dot文件，利用dot编译：

```
dot -Tpdf filename.dot -o filename.pdf
```

## 第三方工具

1. forest – Drawing (linguistic) trees  https://www.ctan.org/pkg/forest

1. graphviz: http://mirrors.huaweicloud.com/repository/toolkit/CTAN/macros/latex/contrib/graphviz/graphviz.pdf

1. dot: https://graphviz.gitlab.io/_pages/pdf/dotguide.pdf
