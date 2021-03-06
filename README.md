#  算法学习的学习笔记

#1. 概述

算法就是将输入的数据转化为我们期望的结果，但是对于数据输入的数据，可能不仅仅一种方法是不能完美解决的，也就是说算法可能在一定程度上是多解，例如有些追求的耗时少，有些追求的是耗费的空间少，所以不同的算法在空间和时间上也是不同的。



#2. 算法的入门

学习算法首先必须学习数据结构和一些简单的数学知识，这些对于程序员来说是必须的。因为一些算法就是数学上的常见模型，我们只是用这种模型建立起来，通过相关的语言实现。

对于算法这门课程我们，可能使用的不是很多，但是我们对于常见的算法还是要了解的，例如几种排序。

现在就让我们从排序开始：
>输入：n个数（a<sub>1</sub>,a<sub>2</sub>,a<sub>3</sub>, …… a<sub>n</sub>）

>输出：输入序列的一个排列（即重新排序）<a<sup>'</sup><sub>1</sub>,a<sup>'</sup><sub>2</sub>,a<sup>'</sup><sub>3</sub>,……，a<sup>'</sup><sub>n</sub>>


我们首先用插入排序的方式来排序：

	INSERT-SORT（A）
	   for j<- 2 to length[A]
	   	do key <-- A[j]
	   	 |> insert A[j] into the sorted sequence A[1..j-1]
	   	 i<- j-1
	   	 while i >0 and A[i] >key
	   	 	do A[i+1] <-- A[i]
	   	 		i<-- i-1
	   	 	A[i+1] <- key
	   	 	
那就解释下，就是将已经排好序的数组(或队列)，插入到这个数组(或队列)，这样原来排好序的队列又成了有序的数组(或队列)，直到最后一个。

就举个例子吧
假设数组A = <5,2,4,6,1,3>




![image](http://ownwell.github.io/image/insert_sort.png)

[附上java代码](https://github.com/ownwell/learn_to_study_algorithm/blob/master/java/src/me/cyning/algorithm/chapter2/InsertSort.java)

其他代码可以在项目的文件夹下看到
	   	