import java.util.Arrays;
import java.util.Iterator;
/**
*@author furkan celen
*/
public class GTUSet<T> extends GTUContainer<T> {
		
		
		private static int usedsize;
		private int maxsize;
		private T setdata[];
		/**
		*default constructor
		*/
		@SuppressWarnings("unchecked")//we use because we know it is safe
		public GTUSet(){
			maxsize =1;
			usedsize=0;
			setdata =(T[]) new Object[1];;
		}
		
		@SuppressWarnings("unchecked")//we use because we know it is safe
		public GTUSet( int setsize){
			setdata =(T[]) new Object[setsize];;
			maxsize =setsize;
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
		*getting setdata
		*@return data
		*/
		public T getdata(int index){
			return setdata[index];
		}

		/**
		*checking set is empty
		*@return true or false
		*/
		public boolean empty()  {
			if(usedsize ==0 )
				return true;
			else
				return false;
		}

		/**
		*@return usedsize of set
		*/
		public  int size()  {
			return usedsize;
		}
		
		/**
		*@return maxsize of set
		*/
		public  int max_size() {
			return maxsize	;	
		}

		/**
		*inserting a value to array
		*/
		public  void insert( T val) {
				T  stemp;
			try{
				if(val == null){
					throw new IllegalArgumentException ("new value cant be null!");
				}
				else {				
					if(usedsize==maxsize){//if vector is full we need extend array
						growsize();
					}
						setdata[usedsize] = val;
						usedsize +=1;
				}
			}catch (IllegalArgumentException e ) {System.out.println("you must enter value "+e+"\n");}
			
		}

		/**
		*helper method for insert method
		*growing size of array if it necessary
		*/
		@SuppressWarnings("unchecked")//we use because we know it is safe
		public void growsize(){
			T temp[] = null; 
			if (usedsize == maxsize) { 
		  			
				    // temp will be  double sized array  
				    temp =(T[]) new Object[maxsize * 2]; 
				    { 
					for (int i = 0; i < usedsize; i++) { 
					    temp[i] = setdata[i]; 
					} 
				    }
				
				System.out.println("set size is extended"); 
			}  
			setdata = temp; 
			maxsize = maxsize * 2;// and make size doubled  
		}
		/**
		*erasing elemnet from index of array
		*@param index	
		*/
		public  void erase(int index){
				int i,j;
				if (usedsize > 0) { 
				    for (i = index; i < usedsize - 1; i++) {// shift all element to left ftom index 
					setdata[i] = setdata[i + 1]; 
				    } 
				    //setdata[usedsize - 1] = 0; 
				    usedsize--; 
				}
				
		}
		/**
		*cleaning all array
		*/
		public  void clear(){//clean all datas
				for (int i = 0; i < usedsize; i++) {// zeroing all elements
					setdata[i] = null; 
				  }	
				usedsize=0;
		}//clean all datas

		/**
		*iterating to begin
		*/
		public  GTUIterator<T> iterator(){
			return new GTUIterator<T>(setdata,usedsize);
		}
		
		/**
		*@param o is an given element that we check
		*checking given element is in array
		*/
		public boolean contains(Object o){

			if (o == null)
				throw new NullPointerException("collection cannot be null");

		    	for (T x : setdata) {
				if (x == o){
			   	 return true;
				}
		    	}
		    	
			return false;
		}


}
