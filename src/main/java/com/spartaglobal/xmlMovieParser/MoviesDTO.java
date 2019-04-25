package com.spartaglobal.xmlMovieParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MoviesDTO {

    private XMLFileReader xmlFileReader;
    private Document moviesList;

    public MoviesDTO(String filePath)
    {
        xmlFileReader = new XMLFileReader(filePath);
        moviesList = xmlFileReader.getParsedXMLFile();
    }

    private NodeList getAllRecords()
    {
       return moviesList.getElementsByTagName("record");
    }

    public int totalRecords()
    {
        return getAllRecords().getLength();
    }

//    private Element returnElement(int RecordIndex)
//    {
//        Node node = getAllRecords().item(RecordIndex);
//
//        return;
//    }

    public void printAllMovieNames()
    {
        for(int i = 0; i<totalRecords();i++)
        {
            Node node = getAllRecords().item(i);
            Element element = (Element) node;
            System.out.println(element.getElementsByTagName("movie_name").item(0).getTextContent());
        }
    }


}
