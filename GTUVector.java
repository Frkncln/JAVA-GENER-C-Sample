import java.util.*;
import java.util.Iterator;
import java.util.Arrays;

/**
*@author furkan celen
writed on ubuntu
*/

public class GTUVector<T> extends GTUContainer<T>
{
		
//Iterator<T>
	private static int usedsize;//used size of the vector
	private int maxsize;//maximum size of the vector
	private T vecdata[];

		/**
		*default constructor
		*/
		@SuppressWarnings("unchecked")//we use because we know it is safe
		public GTUVector(){
			System.out.println("without size constructor of vector");
			 vecdata = (T[]) new Object[1];
			//vecdata = new T[1];
			maxsize =0;
			usedsize=0;
		}

		@SuppressWarnings("unchecked")//we use because we know it is safe
		public GTUVector( int vecsize){//with size constructor
			System.out.println("with size constructor of vector");
			vecdata = (T[]) new Object [vecsize];
			maxsize =vecsize;
			usedsize=0;
		}

		/**
		*getting used size
		*@return usedsize
		*/
		public static int getusedsize(){
			return usedsize;
		}

		/**
		*getting used size
		*@return usedsize
		*/
		public int getmaxsize(){
			return maxsize;
		}

		/**
		*getting vecdata
		*@return data
		*/
		public T getdata(int index){
			return vecdata[index];
		}

		/**
		* checking vector is empty or not
		*@return true or false
		*/
		public boolean empty() {
			if(usedsize == 0 )
				return true;
			else
				return false;
		}

		 /**
		*@return usedsize
		*/
		 public int size() {
			return usedsize;
			}


		/**
		*@return maxsize of the vector
		*/
		public   int max_size(){
			return maxsize;
			}
		/**
		*inserting a value to array
		*/
		public  void insert( T val) {
				T  stemp;
			try{
				if(val == null){
					throw new IllegalArgumentException ("new value cannot be null!");
				}
				else {				
					if(usedsize==maxsize){//if vector is full we need extend array
						growsize();
					}
						vecdata[usedsize] = val;
						usedsize +=1;
				}
			}catch (IllegalArgumentException e ) {System.out.println("you must enter positive"+e+"\n");}
			
		}
		/**
		*growing size of array if it necessary
		*/
		@SuppressWarnings("unchecked")//we use because we know it is safe
		public void growsize(){//helper method for insert method
			T[] temp = null; 
			if (usedsize == maxsize){
				    // temp will be  double sized array  
				     temp = (T[]) new Object[maxsize * 2]; 
				    { 
					for (int i = 0; i < usedsize; i++) { 
					    temp[i] = vecdata[i]; 
					} 
				    }
				System.out.println("vector size is extended"); 
			}  
			vecdata = temp; 
			maxsize = maxsize * 2;// and make size doubled  
		}
		/**
		*erasing elemnet from index of array
		*@param index	
		*/
		public  void erase(int index){
				int i,j;
				if (usedsize > 0 && index >= 0) { 
				    for (i = index; i < usedsize - 1; i++) {// shift all element to left ftom index 
					vecdata[i] = vecdata[i + 1]; 
				    } 
				    vecdata[usedsize - 1] = null; 
				    usedsize--; 
				}
				
		}
		/**
		*cleaning all array
		*/
		public  void clear(){//clean all datas
				for (int i = 0; i < usedsize; i++) {// zeroing all elements
					vecdata[i] = null; 
				  }	
				usedsize=0;
		}
		/**
		*iterating to begin
		*/
		
		public  GTUIterator<T> iterator(){
			return new GTUIterator<T>(vecdata,usedsize);
			
		}
		/**
		*@param o is an given element that we check
		*checking given element is in array
		*/
		public boolean contains(Object o){

			if (o == null)
				throw new NullPointerException("element cannot be null");

		    	for (T x : vecdata) {
				if (x == o){
			   	 return true;
				}
		    	}
		    	
			return false;
		}

}//end of the vector class
