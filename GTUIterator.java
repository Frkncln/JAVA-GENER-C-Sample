import java.util.Iterator;
import java.util.NoSuchElementException;
public class GTUIterator<T>  //implements Iterator<T>
{
	
	/*private Iterator<Coordinate> iX, iY;
    	private StateSpace<T> stateSpace;

   	 StateIterator(StateSpace<T> stateSpace){
		this.stateSpace = stateSpace;
		iX = Main.GRID.iterator();
		iY = Main.GRID.iterator();
    	}

*/	private int index;
 	private T[] data;
	private int datsize;
	
	@SuppressWarnings("unchecked")//we use because we know it is safe
	public GTUIterator(Object o[],int size){
		index=0;
		datsize=size;
		data = (T[])o;
		//for(int i=0;i<datsize;i++)
		//	data[i] = (T) o[i];
	}	
		
	/**
	*checking array have got next element
	*@return true or false
	*/
	public boolean hasNext(){
	    if (index < datsize)
                return true;
            else
                return false;
    	}
     	
	/**
	*getting next data if it is exist
	*@return T type data
	*/
	public T next() {
	    if (this.hasNext())
                return data[index++];
            else
                return null;
	}



}//end of iterator class
/*
@Override
        public boolean hasNext()
        {
            return index < positions.length;
        }

        @Override
        public Position next()
        {
            if (hasNext())
            {
                Position value = positions[index];
                index++;
                return value;
            }
            throw new NoSuchElementException("No more positions available");
  */      



/*	başka bi implemantasyon
 private class DataSetIterator implements Iterator {
        private int position = 0;
 
        public boolean hasNext() {
            if (position < myData.length)
                return true;
            else
                return false;
        }
 
        public String next() {
            if (this.hasNext())
                return myData[position++];
            else
                return null;
        }
 
        @Override
        public void remove() {
 
        }
    }*/

