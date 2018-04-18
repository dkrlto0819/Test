package 중간고사;

import java.util.Scanner;
import 중간고사.수입;
import 중간고사.지출;
import 중간고사.출력;


public class 입력 {
	private Scanner sc;

	public 입력()
	{
		sc = new Scanner(System.in);
	}

	public int 수입_지출_선택()
	{
		int 선택; 

		System.out.println("원하는 번호를 선택하세요! 1 (수입)  2 (지출)  0 (끝내기) :");
		선택 = sc.nextInt(); 
		
		return 선택;
	}

	private void 가계부_업데이트(){
	
		입력 수입_출력_고르기=new 입력();
		
		수입 수입_관리=new 수입();
		지출 지출_관리=new 지출();
		출력 가계부_출력=new 출력();
	
		String 항목;
		int 가격;
		
		int 선택=1;
		
		while(선택!=0) {
			
			선택=수입_출력_고르기.수입_지출_선택();
			
			switch(선택)
			{
			case 1: // 입력 선택
				System.out.println("수입을 입력하세요: ");
				항목=sc.nextLine();
				가격= sc.nextInt();
			
				수입_관리.수입_관리(가격);
				break;

			case 2: // 지출 선택
				System.out.println("지출을 입력하세요: ");
				항목=sc.nextLine();
				가격=sc.nextInt();

				지출_관리.지출_관리(가격);
				break;
		
			case 0:
				break;
				
			default:
				System.out.println("선택한 번호를 다 한 번 확인해 주세요.");
				break;
			}
		}
			
		가계부_출력.최종_가계부_출력(수입_관리.최종_금액(), 지출_관리.최종_금액());
	}
	
	public static void main(String[] args) {
		입력 시작 = new 입력();
		시작.가계부_업데이트();
	}

}
