package com.david.algorithms.week1

import com.david.algorithms.sort.SortSpecs

final class InsertionSortTest extends SortSpecs{
  override lazy val algorithmName: String = "Insertion Sort"

  override def sortAlgorithm[A](implicit ord: Ordering[A]): Iterable[A] => Iterable[A] = InsertionSort.sort[A](ord)
}
