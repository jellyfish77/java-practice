package com.jellyfish77;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.jellyfish77.Movie.Genres;

public class XmlToObject {
	public static void main(String[] args) {

		try {

			File file = new File("data/com/jellyfish77/Movie.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Movie.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Movie que = (Movie) jaxbUnmarshaller.unmarshal(file);

			System.out.println(que.getTitle());
			System.out.println(que.getGross());
			System.out.println(que.getImdbId());
			Genres genres = que.getGenres();
			genres.getGenre().forEach((g)->System.out.println(g));			
			

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
