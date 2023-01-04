package com.example.consumingrest;

public class Value {

	private Long id;
	private String quote;
	
	protected Long getId() {
		return id;
	}
	protected void setId(Long id) {
		this.id = id;
	}
	protected String getQuote() {
		return quote;
	}
	protected void setQuote(String quote) {
		this.quote = quote;
	}
	
	@Override
	public String toString(){
		return "Value{"
				+ "id='"+id+'\''
				+", quote='" + quote + '\''
				+ '}';
	}
}
