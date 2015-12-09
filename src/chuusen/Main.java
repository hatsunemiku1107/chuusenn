package chuusen;

import java.util.Arrays;
import java.util.Random;


public class Main {
	public Main() {
	// TODO 自動生成されたコンストラクター・スタブ
}
	public static final Integer MIN_NUM = 1;
	public static final Integer MAX_NUM = 43;
	public static final Integer[] EXCLUSION =new Integer[] {8};
	public static final Integer DRAWING_NUM = 41;
	public static void main(String[] args){
		Integer[] drew = new Integer[DRAWING_NUM];
		Integer i = 0;
		Random r = new Random();
		Integer rand;
		while(i<DRAWING_NUM){
			rand = r.nextInt(MAX_NUM)+MIN_NUM;//最小値をMIN_NUMにする
			if(Arrays.asList(drew).contains(rand))continue;
			if(Arrays.asList(EXCLUSION).contains(rand))continue;
			drew[i] = rand;
			i++;
		}
		for(int s:drew){
			System.out.println(s);
		}
	}
}
