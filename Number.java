package com.pratik.springboot1.demo1;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
//import lombok.AllArgsConstructor;



class Hos
{
	int no;
	String name;
	int rating;
	String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rating;
	}

	public void setRate(int rate) {
		this.rating = rate;
	}

	public String getAdd() {
		return address;
	}

	public void setAdd(String add) {
		this.address = add;
	}

	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Hos(int no,String name,int rating,String address) {
		//super();
		this.no = no;
		this.name = name;
		this.rating = rating;
		this.address = address;
	}
	
}
@RestController
public class Number {

	@GetMapping(path="/hospital")
	@CrossOrigin(origins="http://localhost:4200")
	public ArrayList<Hos> hello()
	{
		ArrayList<Hos> arr=new ArrayList<Hos>();
		arr.add(new Hos(12,"Chennai Hospital",8,"Chennai"));
		arr.add(new Hos(13,"NRS",10,"Kolkata"));
		arr.add(new Hos(132,"Calcutta Medical",10,"Kolkata"));
		arr.add(new Hos(10,"SSKM",9,"Kolkata"));
		arr.add(new Hos(101,"Narayana Hospital",9,"Howrah"));
		return (arr);
	}
	
	@GetMapping(path="/hospital")
	@CrossOrigin(origins="http://localhost:4200")
	public ArrayList<Hos> hello(Integer id)
	{
		ArrayList<Hos> arr=new ArrayList<Hos>();
		arr.add(new Hos(12,"Chennai Hospital",8,"Chennai"));
		arr.add(new Hos(13,"NRS",10,"Kolkata"));
		arr.add(new Hos(132,"Calcutta Medical",10,"Kolkata"));
		arr.add(new Hos(10,"SSKM",9,"Kolkata"));
		arr.add(new Hos(101,"Narayana Hospital",9,"Howrah"));
		return (arr);
	}
	
	@GetMapping(path="/hospital")
	@CrossOrigin(origins="http://localhost:4200")
	public ArrayList<Hos> hello(Integer id, String name)
	{
		ArrayList<Hos> arr=new ArrayList<Hos>();
		arr.add(new Hos(12,"Chennai Hospital",8,"Chennai"));
		arr.add(new Hos(13,"NRS",10,"Kolkata"));
		arr.add(new Hos(132,"Calcutta Medical",10,"Kolkata"));
		arr.add(new Hos(10,"SSKM",9,"Kolkata"));
		arr.add(new Hos(101,"Narayana Hospital",9,"Howrah"));
		return (arr);
	}
	
	@GetMapping(path="/hospital")
	@CrossOrigin(origins="http://localhost:4200")
	public ArrayList<Hos> hello(List<Integer> i1)
	{
		ArrayList<Hos> arr=new ArrayList<Hos>();
		arr.add(new Hos(12,"Chennai Hospital",8,"Chennai"));
		arr.add(new Hos(13,"NRS",10,"Kolkata"));
		arr.add(new Hos(132,"Calcutta Medical",10,"Kolkata"));
		arr.add(new Hos(10,"SSKM",9,"Kolkata"));
		arr.add(new Hos(101,"Narayana Hospital",9,"Howrah"));
		return (arr);
	}

}
