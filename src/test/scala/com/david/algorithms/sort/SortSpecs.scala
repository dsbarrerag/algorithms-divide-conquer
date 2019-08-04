package com.david.algorithms.sort

import com.david.algorithms.sorts.SortAlgorithm
import org.scalatest.{FlatSpec, Matchers}

trait SortSpecs extends FlatSpec with Matchers {

  def algorithmName: String
  def sortAlgorithm[A](implicit ord: Ordering[A]): Iterable[A] => Iterable[A]

  algorithmName should "sort an integer list" in {
    val unsortedList = List(8,1,4,2,5)
    val sortedList   = List(1,2,4,5,8)
    SortAlgorithm.sort(unsortedList)(sortAlgorithm) shouldBe sortedList
  }

  it should "sort an integer list with repeated items" in {
    val unsortedList = List(4,1,2,5,2,3,1)
    val sortedList   = List(1,1,2,2,3,4,5)
    SortAlgorithm.sort(unsortedList)(sortAlgorithm) shouldBe sortedList
  }

  it should "sort a string list" in {
    val unsortedList = List('x','q','y','a','i')
    val sortedList   = List('a','i','q','x','y')
    SortAlgorithm.sort(unsortedList)(sortAlgorithm) shouldBe sortedList
  }

  it should "sort a string list with repeated items" in {
    val unsortedList = List('x','q','y','a','i','a','q')
    val sortedList   = List('a','a','i','q','q','x','y')
    SortAlgorithm.sort(unsortedList)(sortAlgorithm) shouldBe sortedList
  }

  it should "sort an empty list" in{
    val unsortedList = List.empty[String]
    SortAlgorithm.sort(unsortedList)(sortAlgorithm) shouldBe List.empty[String]
  }

  it should "sort a list with one element" in {
    val unsortedList = List(1)
    SortAlgorithm.sort(unsortedList)(sortAlgorithm) shouldBe List(1)
  }

  it should "sort an integer seq" in {
    val unsortedSeq = Seq(4,1,5,2,3)
    val sortedSeq   = Seq(1,2,3,4,5)
    SortAlgorithm.sort(unsortedSeq)(sortAlgorithm) shouldBe sortedSeq
  }

  it should "sort an integer seq with repeated items" in {
    val unsortedSeq = Seq(4,1,2,5,2,3,1)
    val sortedSeq   = Seq(1,1,2,2,3,4,5)
    SortAlgorithm.sort(unsortedSeq)(sortAlgorithm) shouldBe sortedSeq
  }

  it should "sort a string seq" in {
    val unsortedSeq = Seq('x','q','y','a','i')
    val sortedSeq   = Seq('a','i','q','x','y')
    SortAlgorithm.sort(unsortedSeq)(sortAlgorithm) shouldBe sortedSeq
  }

  it should "sort a string seq with repeated items" in {
    val unsortedSeq = Seq('x','q','y','a','i','a','q')
    val sortedSeq   = Seq('a','a','i','q','q','x','y')
    SortAlgorithm.sort(unsortedSeq)(sortAlgorithm) shouldBe sortedSeq
  }

  it should "sort an empty seq" in {
    val unsortedSeq = Seq.empty[String]
    SortAlgorithm.sort(unsortedSeq)(sortAlgorithm) shouldBe Seq.empty[String]
  }

  it should "sort a seq with one element" in {
    val unsortedSeq = Seq(1)
    SortAlgorithm.sort(unsortedSeq)(sortAlgorithm) shouldBe Seq(1)
  }


}
