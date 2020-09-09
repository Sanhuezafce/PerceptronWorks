import Perceptron.PInput
import Perceptron.Perceptron
import java.lang.Math.pow
import kotlin.random.Random.Default.nextDouble

class PerceptronLogicGates :Perceptron(){
    private val x0: PInput = PInput("x0",1,1.0)
    private val x1: PInput = PInput("x1",0,1.0)
    init{
        this.add_PInput(x0)
        this.add_PInput(x1)
    }
    fun gateAND(x0_input:Int,x1_input:Int){
        x0.set_value(x0_input)
        x1.set_value(x1_input)
        AND_weight()
        println("AND: (${x0.get_value()}, ${x1.get_value()}) = ${output()}")
    }
    fun gateOR(x0_input:Int,x1_input:Int){
        x0.set_value(x0_input)
        x1.set_value(x1_input)
        OR_weight()
        println("OR: (${x0.get_value()}, ${x1.get_value()}) = ${output()}")
    }
    fun gateNAND(x0_input:Int,x1_input:Int){
        x0.set_value(x0_input)
        x1.set_value(x1_input)
        NAND_weight()
        println("NAND: (${x0.get_value()},${x1.get_value()}) = ${output()}")
    }

    //TODO
    //doesnt work all the time
    private fun AND_weight(){
        //b<0
        set_bias(nextDouble(-1.0,0.0))
        //0<W_0<=-2b
        x0.set_weight(nextDouble(0.01, -2*bias))
        //-b-W_0<W_1<=-2B
        x1.set_weight(nextDouble(-bias- x0.get_weight()!!+0.01,-bias))
    }

    private fun OR_weight(){
        //b<=0
        set_bias(nextDouble(-pow(2.0,2.0),0.0))
        //W_0>-b
        x0.set_weight(nextDouble(-bias+1.0,pow(2.0,10.0)))
        //W_1>(-3b-2W_0)/2
        x1.set_weight(nextDouble((-3*bias-2* x0.get_weight()!!)/2, pow(2.0,14.0)))
    }
    //TODO
    //doesnt work all the time
    private fun NAND_weight(){
        //0<b
        set_bias(nextDouble(1.0,pow(2.0,2.0)))
        //-2b<W_0<=-b
        x0.set_weight(nextDouble(2*-bias+1.0,-bias))
        //-3b-W_0<W_1<=-W_0-b
        //x1.set_weight(nextDouble(-3*bias-x0.get_weight()!!+1.0,-x0.get_weight()!!-bias))
        //-3b-W_0<W_1
        x1.set_weight(nextDouble(-bias+1.0,0.0))

    }
}

