package com.sample.collection.operations.main;

import java.util.Arrays;
import java.util.List;

import com.sample.collection.operations.domain.Items;
import com.sample.collection.operations.sub.ItemsOperations;

public class ItemsMain {
	
	public static void main(String[] args) {
		
		// Collection of Items
	    Items biba = new Items(1234, "Apparels", 1239, "Biba");
        Items fabIndia = new Items(2345,"Kurtis",2346,"FabIndia");
        Items allenSolly = new Items(3467,"Formal Shirts",2999,"Allen Solly");
        Items westSide = new Items(1123,"Bags",3500,"WestSide");
        Items zara = new Items(1678,"Jumpsuits",1270,"Zara");
        Items tommyHilfiger= new Items(1453," T-Shirts",899,"Tommy Hilfiger");
        Items skechers= new Items(9854,"Sneakers",1549,"Skechers"); 
        Items adidas= new Items(4432,"Sports Shoes",2345,"Adidas");
        Items timberland= new Items(6758,"Wallets",799,"Timberland" );
        Items levis= new Items(2879,"Jeans",5500,"Levi's" );
        Items loreal= new Items(5438,"Accessories",1450,"L'Oréal"); 

        List<Items> items = Arrays.asList(biba, fabIndia, allenSolly, westSide, zara, 
        		tommyHilfiger, skechers, adidas, timberland, levis, loreal);
        
        ItemsOperations operations = new ItemsOperations(items);
        
        // Filter items by brands starts with "T"
        List<Items> filterBrandsStartsWithT = operations.filterByBrands("T");
        System.out.println("\nThe filtered brand");
        for (int i = 0; i < filterBrandsStartsWithT.size(); i++)
            System.out.println(filterBrandsStartsWithT.get(i));
        
        // Sort by highest price - descending order of price
        operations.sortByPrice(items);
        System.out.println("\nSorted by price");
        for (int i = 0; i < items.size(); i++)
          System.out.println(items.get(i));
	}
	
}
