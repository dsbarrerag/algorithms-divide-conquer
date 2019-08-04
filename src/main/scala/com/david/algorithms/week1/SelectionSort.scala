package com.david.algorithms.week1

object SelectionSort {
  def sort[A](implicit ord: Ordering[A]): Iterable[A] => Iterable[A] = unsorted => {

    def go(sorted: Iterable[A], unsorted: Iterable[A]): Iterable[A] = unsorted match {
      case h :: Nil => sorted ++ Iterable(h)
      case Nil => unsorted
      case list =>
        val min: A = list.min
        go(sorted ++ Iterable(min), filterFirst(unsorted)(_ == min))

    }
    go(Iterable.empty, unsorted)
  }

  def filterFirst[A]( list : Iterable[A] )( filter: A => Boolean ): Iterable[A] =
    list.head match {
    case item if filter(item) => list.tail
    case other => Iterable(other) ++ filterFirst(list.tail)(filter)
  }
}
