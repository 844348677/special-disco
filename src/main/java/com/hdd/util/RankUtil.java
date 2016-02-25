package com.hdd.util;

import java.util.List;

public class RankUtil {
	
	private static double[] array;

	public static int getRank(List<Integer> source, String value){
		//process raw data
		array = new double[source.size()];
		for(int i = 0; i < source.size(); i ++){
			array[i] = source.get(i).doubleValue();
		}
		sort();
		return getRank(Double.parseDouble(value));
	}

	private static void sort() {
        for (int i = 1; i < array.length; i++) {
            double temp = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > temp; j --) {
            	array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
	}
	
	private static int getRank(double destvalue){
		int count = 1;
		for (int i = 1; i < array.length; i++) {
			if(array[i] != array[i - 1] && destvalue > array[i]) count ++;
			else if(destvalue == array[i]) return count;
		}
		return - 1;
	}
}
