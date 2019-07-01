package com.jellyfish77;

import java.io.File;
import java.io.PrintStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.jellyfish77.Movie.Genres;

public class UnmarshallMarshalMovie {
	public static void main(String[] args) {

		try {
			
			// unmarshall Movie XML (convert XML to Obj)
			
			File file = new File("data/com/jellyfish77/Movie.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Movie.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Movie que = (Movie) jaxbUnmarshaller.unmarshal(file);

			System.out.println(que.getTitle());
			System.out.println(que.getGross());
			System.out.println(que.getImdbId());
			Genres genres = que.getGenres();
			genres.getGenre().forEach((g)->System.out.println(g));			
			
			// marshall Movie Obj (convert Obj to XML)
			
			Marshaller marshallerObj = jaxbContext.createMarshaller();
			marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			marshallerObj.marshal(que, new PrintStream(System.out));

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
