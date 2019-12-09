package basics
// terminal -> sbt "testOnly basics.FutureExampleSpec"
// sbt-console -> testOnly *FutureExampleSpec
import org.scalatest.{AsyncFreeSpec, Matchers}

import scala.concurrent.Future

class FutureExampleSpec extends AsyncFreeSpec with Matchers {
  "using with very long computation" in {

    val veryLongComputation = (x: Int) => {
      Thread.sleep(1000)
      x * x
    }

    Future(veryLongComputation(15)) map {
      case 25 => assert(true)
      case _ => assert(false)
    }

    Future(veryLongComputation(2))
      .map(veryLongComputation)
      .map(veryLongComputation)
      .map { _ shouldBe 256 }
  }

  "using with sequential executing" in {
    val example = new FutureExample
    Future(example.sequentialExecuting(1000))
      .map { _ shouldBe () }
  }

  "using with parallel executing" in {
    val example = new FutureExample

    Future(example.parallelExecuting(1000))
      .map { _ shouldBe () }
  }

  "using with a lot of parallel execution" in {
    val example = new FutureExample

    Future(example.alotOfParallelExecution(1000))
      .map { _ shouldBe () }
  }

  "using with demo" in {
    val example = new FutureExample

    Future(example.demo)
      .map { _ shouldBe () }
  }
}
