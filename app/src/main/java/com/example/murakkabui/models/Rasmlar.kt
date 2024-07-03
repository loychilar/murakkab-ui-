package com.example.murakkabui.models

class Rasmlar {
    var rasm:Int?=null
    var ismi:String?=null
    var odamlar:String?=null
    var kun:String?=null
    constructor()
    constructor(rasm: Int?, ismi: String?,odamlar:String?,kun:String?) {
        this.rasm = rasm
        this.ismi = ismi
        this.odamlar = odamlar
        this.kun = kun
    }
}