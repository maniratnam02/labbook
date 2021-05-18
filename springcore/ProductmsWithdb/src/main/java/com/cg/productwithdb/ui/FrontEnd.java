package com.cg.productwithdb.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.productwithdb.entities.Product;
import com.cg.productwithdb.exceptions.InvalidIdException;
import com.cg.productwithdb.exceptions.InvalidNameException;
import com.cg.productwithdb.exceptions.InvalidPriceException;
import com.cg.productwithdb.services.IProductService;
import com.cg.productwithdb.services.ProductServiceImpl;

@Component
public class FrontEnd {
	
	@Autowired
	private IProductService service;
	
	public void start() {
    	try {
     	   	service.createProduct("DairyMilk", 40);
            Product milkybar = service.createProduct("MilkyBar", 20);
            List<Product>findall=service.findAll();
            displayProducts(findall);

            System.out.println("change price of milkybar");
            int milkybarId = milkybar.getId();
            milkybar = service.updatePrice(milkybarId, 25);
            display(milkybar);

            System.out.println("find product by id");
            Product fetchedproduct = service.findById(milkybarId);
            display(fetchedproduct);
            
            System.out.println("fetching list of products after changes");
            List<Product>list=service.findAll();
            displayProducts(list);
            

        }catch(InvalidIdException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidNameException e){
            System.out.println(e.getMessage());
        }
         catch(InvalidPriceException e){
            System.out.println(e.getMessage());
         }
     }


     void display(Product product){
         System.out.println(product.getId()+"-"+product.getName()+"-"+ product.getPrice());
     }
     void displayProducts(List<Product> list){
         for(Product itr:list){
             display(itr);
         }
     }
}
