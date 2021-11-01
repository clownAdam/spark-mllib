package cn.clown.two

import breeze.linalg.{DenseMatrix, DenseVector}

/**
 *
 * @author clown
 */
object Main {
  def main(args: Array[String]): Unit = {
    //全零矩阵
    val m1: DenseMatrix[Double] = DenseMatrix.zeros[Double](2, 3)
    println(m1)
    //全零向量
    val v1: DenseVector[Double] = DenseVector.zeros[Double](3)
    println(v1)
    val v2: DenseVector[Double] = DenseVector.ones[Double](3)
    println(v2)
    val v3: DenseVector[Int] = DenseVector.fill(3) {
      5
    }
    println(v3)
    val v4: DenseVector[Int] = DenseVector.range(1, 10, 1)
    println(v4)
    DenseMatrix.eye(1)
  }
}
