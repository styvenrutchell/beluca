package com.beluca.proj;

import com.beluca.proj.business.Poem;

public class MainPoemGen {

	public static void main(String[] args) {
		Poem poem = new Poem();
		System.out.println(poem.generatePoem());

	}

}
