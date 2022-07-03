package com.rajeshanthari.geek.practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class Covarient {

}

abstract class A {
	abstract List<String> draw() throws IOException;
}

class AImpl extends A {
	@Override
	Vector<String> draw() throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
