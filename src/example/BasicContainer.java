package example;

public class BasicContainer<Type> {
	
	private Type element;

	public BasicContainer() {
	}
	
	public Type getElement() {
		return element;
	}
	
	public void setElement(Type element) {
		this.element = element;
	}
}
