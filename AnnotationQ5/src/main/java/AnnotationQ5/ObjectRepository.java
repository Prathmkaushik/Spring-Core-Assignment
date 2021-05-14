package AnnotationQ5;

public interface ObjectRepository<T> {
	public static void store( T,t) {
		// TODO Auto-generated method stub
		
	}

	public  T retrieve(int studentId);

	public T search(String studentame);

	public T delete(int studentId);

}

