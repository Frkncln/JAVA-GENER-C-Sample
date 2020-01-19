import java.util.Arrays;
import java.util.Iterator;

public class Main{
		

/*
*I tried test codes with vector and set classes
*integer and string types with their methods 
**/
 public static void main(String args[]){
		
	Integer i=5;
	String s ="we know-";//we will send different type our containers
	String c = "java is the king of the languages";	

//vector test	area--------------


	System.out.println("WE USE VECTOR CLASS UNDER THERE \n");

	GTUVector<Integer> vec = new GTUVector<Integer>(i);
	System.out.println("used size ="+vec.size()+" maxsize= "+vec.max_size()+" -but we will insert 6 number to vector \n");	

	for(i=0;i<6;i++)	
	vec.insert(i);
	
	System.out.println("INSERTED numbers 0-5");

	for(i=0;i<6;i++)		
	System.out.println("datas = "+vec.getdata(i));

	System.out.println("after insertion used size ="+vec.size()+" maxsize= "
	+vec.getmaxsize()+"\nis vector  EMPTY? "+vec.empty()+"---is this vector CONTAİNS 3?--- "+vec.contains(3) 
	+ "---then ERASE index 3 and print again " );  
	vec.erase(3);
		
		System.out.println("\nWe use ITERATOR method under ,after erased index 3");
	
	GTUIterator<Integer> iter = vec.iterator();
		while(iter.hasNext())//until end of the vector
			System.out.println("->"+iter.next());



		System.out.println("\nafter erasing index 3 and printing with iterator ,CLEAR all vector	" );
	vec.clear();
		System.out.println("After Clear vectro used size ="+vec.size()+" maxsize= "+vec.max_size()+"\n");
	
	

	GTUVector<String> svec = new GTUVector<String>(i);//for using vector with String type
	svec.insert(s);
	svec.insert(c);

	System.out.println("inserted new string datas to vector \n new datas is = "+svec.getdata(0)+svec.getdata(1));
	System.out.println("used final vector boy size ="+svec.size()+" maxsize= "+vec.max_size());
	
		
		

//set test area--------------

	i=5;
	System.out.println("\n WE USE SET CLASS UNDER THERE \n");

	GTUSet<Integer> set = new GTUSet<Integer>(i);
		System.out.println(" set used size ="+set.getusedsize()+" maxsize= "+set.getmaxsize());	
	
	for(i=0;i<5;i++)	
		set.insert(i);

		System.out.println("inserted");
		System.out.println("used size ="+set.getusedsize()+" maxsize= "+set.getmaxsize());

	for(i=0;i<5;i++)		
		System.out.println(":: "+set.getdata(i));

	set.erase(4);
		System.out.println("Now we ERASED index 4, is set CONTAINS 4 ->"+set.contains(4));
		System.out.println("\nWe use ITERATOR method under ,after erased index 4");
		
	GTUIterator<Integer> setiter = set.iterator();
		while(setiter.hasNext())//until end of the vector
		System.out.println("->"+setiter.next());


	GTUSet<String> sset = new GTUSet<String>(i);//for using set with String type
	sset.insert(s);
	sset.insert(c);
	
		System.out.println("\n we created new set and inserted string data = " + sset.getdata(0) + sset.getdata(1));
	
		System.out.println(" set final used size ="+set.getusedsize()+" maxsize= "+set.getmaxsize());	
	
		System.out.println("Is this set CONTAINS 'we know-' ? --> "+sset.contains("we know-"));


	}//end of the main




}//end of the Main class
