package generics;

//T is the stereotype

public class GenericClass<T,E,K> {

	private T objecto;
	private E objectE;
	private K objectK;
	
	public GenericClass(T objecto, E objectE, K objectK){
		this.objecto = objecto;
		this.objectE = objectE;
		this.objectK = objectK;
		
	}
	
	public void showType(){
		System.out.println("T is a: " + objecto.getClass());
		System.out.println("T is a: " + objectE.getClass());
		System.out.println("T is a: " + objectK.getClass());

		
	}
		
}
