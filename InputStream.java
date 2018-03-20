package com.sageit.javaprograms;

import java.io.File;

public class InputStream {
	public static void main(String[] args) {
	      File dir = new File("C:\\Users\\Public\\ASUSFlipLog ");
	      listRecursive(dir);
	   }
	   
	   public static void listRecursive(File dir) {
	      if (dir.isDirectory()) {
	         File[] items = dir.listFiles();
	         for (File item : items) {
	            System.out.println(item.getAbsoluteFile());
	            if (item.isDirectory()) listRecursive(item);  // Recursive call
	         }
	      }
	   }

}
