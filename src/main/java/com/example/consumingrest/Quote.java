package com.example.consumingrest;

public class Quote {

	private String type;
	private Value value;
	
	protected String getType() {
		return type;
	}
	protected void setType(String type) {
		this.type = type;
	}
	protected Value getValue() {
		return value;
	}
	protected void setValue(Value value) {
		this.value = value;
	}
	
	@Override
	public String toString(){
		return "Quote{"
				+ "type='"+type+'\''
				+ ", value="+value
				+ '}';
				
	}
}
