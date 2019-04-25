package com.spartaglobal.xmlMovieParser;

public class App 
{
    public static void main( String[] args )
    {

//        XMLFileReader movies = new XMLFileReader("resources/movies.xml");
        MoviesDTO moviesDTO = new MoviesDTO("resources/movies.xml");
        moviesDTO.printAllMovieNames();
    }
}