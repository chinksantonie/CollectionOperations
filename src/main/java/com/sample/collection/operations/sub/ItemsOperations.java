package com.sample.collection.operations.sub;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sample.collection.operations.domain.Items;

public class ItemsOperations {
    private List<Items> itemList;
	
    public ItemsOperations() {
    	super();
    }
	public ItemsOperations(List<Items> itemList) {
		super();
		this.itemList = itemList;
	}

	public List<Items> getItemList() {
		return itemList;
	}

	public void setItemList(List<Items> itemList) {
		this.itemList = itemList;
	}

	public List<Items> filterByBrands(String token) {
		// Filter items by brands starts with "T"
        return itemList
        		  .stream()
        		  .filter(i -> i.getBrand().startsWith(token))
        		  .collect(Collectors.toList());
    }
	
	public List<Items> sortByPrice(List<Items> items) {
		items.sort(new Comparator<Items>() {
        	@Override
            public int compare(Items o1, Items o2) {
                return (int) (o2.getPrice()- o1.getPrice());
            }
        });
		return items;
    }
}
