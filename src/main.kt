import Perceptron.PInput

fun main(){


    val P1:PerceptronLogicGates=PerceptronLogicGates()
    P1.gateAND(1,1)
    P1.gateAND(1,0)
    P1.gateAND(0,1)
    P1.gateAND(0,0)

    //WORKING
    P1.gateOR(1,1)
    P1.gateOR(1,0)
    P1.gateOR(0,1)
    P1.gateOR(0,0)

    P1.gateNAND(1,1)
    P1.gateNAND(1,0)
    P1.gateNAND(0,1)
    P1.gateNAND(0,0)

}