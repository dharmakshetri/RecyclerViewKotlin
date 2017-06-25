package co.prandroid.recylerviewkotlin

import android.content.Context
import android.widget.Toast

/**
 * Created by dharmakshetri on 6/24/17.
 */
object  Utils {

    private var movies: List<Movie> = ArrayList<Movie>()
    fun getMovies() : List<Movie> {
        movies = listOf(Movie("https://images-na.ssl-images-amazon.com/images/M/MV5BNGNjZjEyODgtMDhkNi00YjFlLWExOTYtOTUwMjVkOTY2NTg4L2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMjYzMjA3NzI@._V1_UY268_CR9,0,182,268_AL_.jpg","A Trip to the Moon", 1902),
                Movie("https://images-na.ssl-images-amazon.com/images/M/MV5BZjQzMzliN2YtYTVhNC00Zjc4LThjMmYtMTE0ZGUzMWNmYzJlXkEyXkFqcGdeQXVyMTYxNjkxOQ@@._V1_UX182_CR0,0,182,268_AL_.jpg","I Walked with a Zombie", 1943),
                Movie("https://images-na.ssl-images-amazon.com/images/M/MV5BN2RlMjIwMDMtYzA5NS00NzYxLWJiNjAtYTQxZTg1ZGUwZjU1XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UY268_CR4,0,182,268_AL_.jpg","Late Spring", 1949),
                Movie("https://images-na.ssl-images-amazon.com/images/M/MV5BOWIwODIxYWItZDI4MS00YzhhLWE3MmYtMzlhZDIwOTMzZmE5L2ltYWdlXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX182_CR0,0,182,268_AL_.jpg","Dial M for Murder", 1954),
                Movie("https://images-na.ssl-images-amazon.com/images/M/MV5BNGU3MWZhNDktNWJiOC00YmFjLTlhNDMtOWU5YWQyMjY4YTlhXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UY268_CR4,0,182,268_AL_.jpg","Dont Look Back", 1967),
                Movie("https://images-na.ssl-images-amazon.com/images/M/MV5BOWU0ZGE4YjMtNmY5Yy00M2RhLWE0ZGQtZjViMTBhZTE5MWM4XkEyXkFqcGdeQXVyNjUwNzk3NDc@._V1_UX182_CR0,0,182,268_AL_.jpg","Superman", 1978),
                Movie("https://images-na.ssl-images-amazon.com/images/M/MV5BMGFkNWI4MTMtNGQ0OC00MWVmLTk3MTktOGYxN2Y2YWVkZWE2XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX182_CR0,0,182,268_AL_.jpg","Once Upon a Time in America", 1984),
                Movie("https://images-na.ssl-images-amazon.com/images/M/MV5BZjQxYTA3ODItNzgxMy00N2Y2LWJlZGMtMTRlM2JkZjI1ZDhhXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_UX182_CR0,0,182,268_AL_.jpg","Top Gun", 1986),
                Movie("https://images-na.ssl-images-amazon.com/images/M/MV5BNmQzYjEzYTQtNzNhZi00NmEwLThiZDMtMWYyNjRmZWY0ZTdkXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg","Home Alone", 1990),
                Movie("https://images-na.ssl-images-amazon.com/images/M/MV5BNTM4MjZjNWEtMmQxMi00YzY5LTg4ZTAtODJlMDVkZWZmNTVhXkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_UX182_CR0,0,182,268_AL_.jpg","City of God", 2002),
                Movie("https://images-na.ssl-images-amazon.com/images/M/MV5BMjAzNTkzNjcxNl5BMl5BanBnXkFtZTYwNDA4NjE3._V1_UX182_CR0,0,182,268_AL_.jpg","300", 2007),
                Movie("https://images-na.ssl-images-amazon.com/images/M/MV5BMTM2ODk0NDAwMF5BMl5BanBnXkFtZTcwNTM1MDc2Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg","The Social Network", 2010))
        return movies
    }

    fun toast(context: Context, message:String, length:Int=Toast.LENGTH_SHORT){
        Toast.makeText(context,message,length).show()
    }

}