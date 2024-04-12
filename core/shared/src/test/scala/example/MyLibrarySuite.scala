package example

import utest._

object MyLibrarySuite extends TestSuite {

    def tests = TestSuite {
        s"test some sqs 3" - {
        * - {
                val lib = new MyLibrary
                val sqs = lib.someSqs(3)
                assert(sqs == "1--4")
            }
        }
        
        s"test some sqs 4" - {
        * - {
                val lib = new MyLibrary
                val sqs = lib.someSqs(4)
                assert(sqs == "1--4--9")
            }
        }
        
    }
}
