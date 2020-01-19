
public abstract class GTUContainer<T>{


			//typedef GTUIterator<T> iterator;
			//typedef GTUIteratorConst<T> citerator;
				
			public abstract boolean empty();
	 
			public abstract int size() ;

			public abstract int max_size() ;

			public abstract void insert(T val);

			public abstract void erase(int index);

			public abstract void clear();//clean all datas

			public abstract GTUIterator<T> iterator();
			
			public abstract boolean contains(Object o);

}//end of gtucontainer
