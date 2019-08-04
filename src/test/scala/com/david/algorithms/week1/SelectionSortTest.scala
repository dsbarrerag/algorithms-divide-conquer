package com.david.algorithms.week1

import com.david.algorithms.sort.SortSpecs

final class SelectionSortTest extends SortSpecs{
  override lazy val algorithmName: String = "Selection Sort"

  override def sortAlgorithm[A](implicit ord: Ordering[A]): Iterable[A] => Iterable[A] = SelectionSort.sort[A](ord)
}
