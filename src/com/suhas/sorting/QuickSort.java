package com.suhas.sorting;

public class QuickSort {
	
	public static void main(String args[]){
		int[] i={7,2,1,6,8,5,3,4};
		int low=0,high=i.length-1;
		
		quickSort(i,low,high);
		for(int j:i){
			System.out.print(j+" ");
		}
	}
	
	private static void quickSort(int[] input,int low,int high){
		
		if(low<=high){
			int partitionIndex=partition(input,low,high);
			quickSort(input,low,partitionIndex-1);
			quickSort(input,partitionIndex+1,high);
		}
	}
	
	private static int partition(int[] input,int low,int high){
		
		int pivot=input[high];
		int pIndex=low;
		
		for(int i=low;i<high;i++){
			if(input[i]<=pivot){
				//swap(input[i],pivot);
				int temp=input[i];
				input[i]=input[pIndex];
				input[pIndex]=temp;
				pIndex++;
			}
			
			
			}
		int temp=input[pIndex];
		input[pIndex]=input[high];
		input[high]=temp;
		return pIndex;
		}
}

