package 김동현;

import java.util.Scanner;

public class chif {

	public static void main(String[] args) {
			
		
//		//탈출 요건
//		//변수 변수
//		//탈출 조건식
//		//탈출 연산식
//		
//		int i=0; //탈출변수
//		while(i<10) //탈출조건식
//		{
//			System.out.println("HELLO WORLD");
//			i++;//탈출 연산식
		
		// 1부터 10 까지 합
//		int i=1;
//		int sum=0;	
//		while(i<=10)
//		{
//			System.out.println("i : "+i);
//			sum=sum+i;		//sum+i;
//			i++;			//3 탈출 연산식
//		}
//		System.out.println("1부터 10까지 합 : "   + sum);
//		
		//문제 
		//1부터 입력한 정수까지 합 구하기

		//N,M 을 입력받아서 N부터 M까지의 합 구하기(N<M)
		
		
		//구구단 2단 
		
	    int i=2;
        int j=1;
        //초기값을 지정 해 줍니다 i값이 단부분, j값이 1~9까지 계산 되어지는 부분입니다.
        while (i<=9) {     
        //i를 2단~9단부터 반복 작업을 시켜줍니다.
            while (j<=9) 
            {
             //j값을 주어서 각 단의 연산을 하도록 해 줍니다.
               System.out.println( i +" X "+ j +" = " + (i*j));
               j++;
              //초기화나 증가값을 주지 않으면 무한 반복하기 때문에 꼭 넣어 주어야 합니다.
              //j를 1씩 증가시켜주는 연산자입니다.       
             } 
            j = 1; //j를 1로 초기화 시켜주지 않으면 2단연산 이후의 while문이 돌아가지 않습니다.
            i++;
            //i도 1씩 증가시켜 줍니다
        }
	
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        }
	}


































