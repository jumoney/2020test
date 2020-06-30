package com.kita.first.level4;

public class Value {
	private int val;

	public Value(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	@Override
	public boolean equals(Object obj) {
		Value tempVal = (Value)obj;
		return this.getVal() == tempVal.getVal();
	}
	
	@Override
	public String toString() {
		return String.format("%,d", val);
		
	}
}
