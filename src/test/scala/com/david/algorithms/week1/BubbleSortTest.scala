package com.david.algorithms.week1

import com.david.algorithms.sort.SortSpecs

final class BubbleSortTest extends SortSpecs{
  override lazy val algorithmName: String = "Bubble Sort"

  override def sortAlgorithm[A](implicit ord: Ordering[A]): Iterable[A] => Iterable[A] = BubbleSort.sort[A](ord)
}
