package 중간고사;

public class 출력 {
	public void 최종_가계부_출력(int 최종_수입, int 최종_지출) {

		int 최종_잔액;
		최종_잔액=최종_수입-최종_지출;
		
		System.out.println("			나의 가계부		");
		System.out.println("총수입 : " + 최종_수입 + "원");
		System.out.println("총수입 : " + 최종_지출 + "원");
		System.out.println("잔액 : " + 최종_잔액 + "원");
	}
}
