package Perceptron
import Perceptron.PInput

open class Perceptron {
    //inputs associated with the perceptron
    private var inputList= ArrayList<PInput>()
    //how easily we trigger 1
    var bias:Double =1.0
    //learning rate
    var lr:Double=0.5
    //training set=(input,expected result)
    var D= ArrayList<Pair<PInput,Int>>()


    fun add_PInput(new_input: PInput){
        this.inputList.add(new_input)
    }
    fun learn(PInput_list:ArrayList<PInput>){

    }
    fun set_bias(new_bias:Double) {
        this.bias = new_bias
    }

    fun output():Int{
        var sum:Double=0.0
        for (i in this.inputList){
            sum+= i.get_value()!! * i.get_weight()!!
        }
        return if (sum+bias<=0){
            0
        }else{
            1
        }
    }
}