package runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import stationBL.GasStation;

public class program {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		JAXBContext context = JAXBContext.newInstance(GasStation.class);
		Unmarshaller unMarshaller = context.createUnmarshaller();
		JAXBElement<GasStation> root = unMarshaller.unmarshal(new StreamSource(new File("test.xml")),GasStation.class);
		GasStation g = root.getValue();
		System.out.println(g.numOfPumps);
		System.out.println(g.pricePerLiter);
		System.out.println(g.MainFuelPool);
		System.out.println(g.CleaningService);
		System.out.println(g.printCars());
		
		
	}

}
