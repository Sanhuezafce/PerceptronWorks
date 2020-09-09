import Perceptron.PInput
import Perceptron.Perceptron

class PerceptronLearning1 : Perceptron() {
    private val x0: PInput = PInput("x0", 1, 1.0)
    private val x1: PInput = PInput("x1", 0, 1.0)

    init {
        this.add_PInput(x0)
        this.add_PInput(x1)
    }


}