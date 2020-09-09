package Perceptron

import kotlin.math.*


class PInput{
        var name: String? = null
        var value: Int? = null
        var weight: Double? = null

    constructor(new_name:String?,new_value:Int?,new_weight:Double?){
        this.name = new_name
        this.value  = new_value
        this.weight= new_weight
    }
    constructor(){
        this.name = null
        this.value  = null
        this.weight= null
    }



    fun set_name(new_name: String){
        name=new_name
    }
    fun set_value(new_value:Int){
        value=new_value
    }
    fun set_weight(new_weight: Double) {
        weight = new_weight
    }
    fun get_name(): String? {
        return name
    }
    fun get_value():Int?{
        return value
    }
    fun get_weight(): Double?{
        return weight
    }
    fun get_data():Triple<String?,Int?,Double?>{
        return Triple(name,value,weight)
    }
}