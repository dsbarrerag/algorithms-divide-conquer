package com.david.algorithms.sorts

object SortAlgorithm {
  def sort[A](unsorted: Iterable[A])(algorithm: Iterable[A] => Iterable[A]): Iterable[A] = {
    algorithm(unsorted)
  }
}
