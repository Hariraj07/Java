package org.test;

public class Accendingorder {
	public static void main(String[] args) {
		int a[]= {5,6,2,3,1,4,7,8,9};
		 for (int i = 0; i < a.length; i++) {
			  for (int j = 0; j < a.length; j++) {
				  if (a[i]< a[j]) {
					   int temp =a[i];
					   a[i] =a[j];
					   a[j]= temp;
					
				}
				
			}
			
		}
		 for (int i : a) {
			System.out.println(i);
		}
	}

}
