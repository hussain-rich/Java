package com.EIT.collections.usingiterable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
	private LinkedList<String> li=new LinkedList<String>();
	
	private class UrlIterator implements Iterator<String>{
		private int index=0;

		@Override
		public boolean hasNext() {
			return index < li.size();
		}

		@Override
		public String next() {
			StringBuilder sb=new StringBuilder();
			try {
				URL url=new URL (li.get(index));
				BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
				
				
				String line =null;
				
				while((line=br.readLine())!=null) {
					sb.append(line);
					sb.append("\n");
				}
				br.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			index++;
			
			return sb.toString();
		}
		public void remove() {
			li.remove(index);
		}
		
	}
	
	public UrlLibrary() {
		li.add("http://www.udemy.com");
		li.add("http//www.javatpoint.com");
		li.add("http//www.facebook.com");
	}
    /*
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return li.iterator();
	}*/

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new UrlIterator();
	}

}
