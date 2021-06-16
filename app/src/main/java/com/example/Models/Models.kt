package com.example.Models

class Models(val nameMovie: String, val imageMovie: Int, val genres: String) {

    constructor(nameMovie: String, imageMovie: Int) : this(nameMovie, imageMovie, genres = "") {

    }

}