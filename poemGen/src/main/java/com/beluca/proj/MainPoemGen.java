package com.beluca.proj;

import com.beluca.proj.business.Poem;
/**
 * 
 * @author Styven Rutchell Palacio Zuleta
 *
 */
public class MainPoemGen {

	public static void main(String[] args) {
		Poem poem = new Poem();

		System.out.println(poem.generatePoem());

	}

}
