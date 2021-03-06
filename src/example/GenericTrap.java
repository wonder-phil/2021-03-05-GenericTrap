package example;

import java.util.ArrayList;

public class GenericTrap {
	
	public static void main(String[] args) {
		
		BasicContainer<ArrayList<Country>> countryListContainer0 = new BasicContainer<ArrayList<Country>>();
		countryListContainer0.setElement(new ArrayList<>());
		countryListContainer0.getElement().add(new Country("Super","Duper","everywhere"));
		
		int size = countryListContainer0.getElement().size();
		
		System.out.println("size: " + String.valueOf(size).toString());
		
		System.out.println("Next will explode since there is no ArrayList<>!");
		
		BasicContainer<ArrayList<Country>> countryListContainer = new BasicContainer<ArrayList<Country>>();
		countryListContainer.getElement().add(new Country("Super","Duper","everywhere"));
		
		size = countryListContainer.getElement().size();
		
		System.out.println("size: " + String.valueOf(size).toString());
		
	}

}
