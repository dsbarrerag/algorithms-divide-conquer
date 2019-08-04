package com.david.algorithms.week1


object BubbleSort {

  def sort[A](implicit ord: Ordering[A]): Iterable[A] => Iterable[A] = unsorted =>
  {
    def go(sorted: Iterable[A], current: A ,unsorted: Iterable[A], modified: Boolean): Iterable[A] = {
      println(s"sorted: $sorted, current: $current, unsorted: $unsorted, modified: $modified")
      unsorted match {
        case h :: t =>
          if (ord.gt(current, h)) go(sorted ++ Iterable(h), current, t, modified = true )
          else go(sorted ++ Iterable(current), h, t, modified = modified )
        case Nil =>
          if(modified) go(Iterable.empty, sorted.head, sorted.tail ++ Iterable(current), modified = false)
          else sorted ++ Iterable(current)

      }
    }
    val head = unsorted.headOption
    head.fold(Iterable.empty[A])(h =>
      go(Iterable.empty,h, unsorted.tail, modified = false)
    )
  }



}
