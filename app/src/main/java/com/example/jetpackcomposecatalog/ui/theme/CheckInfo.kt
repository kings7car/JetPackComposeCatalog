package com.example.jetpackcomposecatalog.ui.theme

//data class necesita recibir al menos 1 parametro
data class CheckInfo (val title:String, var selected:Boolean = false, var onCheckedChange:(Boolean) -> Unit) {
}