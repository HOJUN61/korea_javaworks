//package bankapp2;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import bankapp.BankAccount;
//
//public class BankMain2 {
//	static List<BankAccount> accountList = new ArrayList<>();
//	static Scanner scan = new Scanner(System.in);
//	
//	boolean sw = true;  //실행과 종료 상태 변수
//	
//	while(sw) {
//		System.out.println("==========================================");
//		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
//		System.out.println("==========================================");
//		System.out.print("선택> ");
//		
//		try { //메뉴 선택시 문자 입력으로 인한 예외 처리
//			
//			int selectNum = Integer.parseInt(scan.nextLine());		
//			switch(selectNum) {
//			case 1:
//				createAccount();
//				break;
//				
//			case 2:
//				getAccountList();
//				break;
//				
//			case 3:
//				deposit();
//				break;
//				
//			case 4:
//				withdraw();
//				break;
//				
//			case 5:
//				System.out.println("프로그램을 종료합니다.");
//				sw = false;
//				break;
//			default:
//				System.out.println("지원되지 않은 기능입니다. 다시 입력하세요");
//				break;
//			}
//		}catch(NumberFormatException e) {
//			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
//		}
//					
//			//계좌 생성
//			System.out.println("==========================================");
//			System.out.println("                 계 좌 생 성                ");
//			System.out.println("==========================================");
//			
//			System.out.print("계좌번호: ");
//			String ano = scan.nextLine(); //계좌 입력
//			
//			System.out.print("계좌주: ");
//			String owner = scan.nextLine();
//			
//			System.out.print("초기 입금액: ");
//			int balance = Integer.parseInt(scan.nextLine());
//			
//			//신규 계좌 생성
//			BankAccount newAccount = new BankAccount(ano, owner, balance);
//			accountList.add(newAccount);
//			System.out.println("결과: 계좌가 생성되었습니다.");
//	
//}
//
//	// 계좌 검색
//	private static BankAccount findAccount(String ano) {
//		BankAccount account = null;
//		for(int i=0; i<accountList.size(); i++) {
//			String dbAno = accountList.get(i).getAno();
//			if(dbAno.equals(ano)) {
//				account = accountList.get(i);
//				break;
//			}
//		}
//		
//		return account;
//	}
//	
//	
//	// 예금
//	private static void deposit() {
//		System.out.println("==========================================");
//		System.out.println("                 예      금                ");
//		System.out.println("==========================================");
//		
//		System.out.print("계좌번호: ");
//		String ano = scan.nextLine(); //계좌 입력
//		
//		System.out.print("입금액: ");
//		int amount = Integer.parseInt(scan.nextLine());
//		
//		if(findAccount(ano) !=null) { //일치되는 계좌번호가 있으면 
//			BankAccount account = findAccount(ano);
//			//예금 = 잔고 + 입금액
//			account.setBalance(account.getBalance() + amount);
//			System.out.println("결과: 정상 입금 되었습니다. 현재 잔액: " + account.getBalance());
//		}else {
//			System.out.println("결과: 계좌가 없습니다.");
//		}
//		
//	}
//	//계좌 목록
//	private static void getAccountList() {
//		for(int i = 0; i<accountList.size(); i++) {
//					BankAccount account = accountList.get(i);
//				System.out.print("계좌번호: " + account.getAno() + "\t");
//				System.out.print("계좌주: " + account.getOwner() + "\t");
//				System.out.print("잔액: " + account.getBalance() + "\n");
//			}
//		}
//	
//	while(true) {
//		System.out.print("게좌번호: ");;
//		String ano = scan.nextLine();
//		
//		if(findAccount(ano) != null) {
//			System.out.println("이미 등록된 계좌입니다. 다시 입력해 주세요");
//		}else {
//			System.out.print("계좌주: ");
//			String owner = scan.nextLine();
//			
//			System.out.print("초기 입금액: ");;
//			int balance = Integer.parseInt(scan.nextLine());
//			
//			BankAccount newAccount = new BankAccount(ano, owner, balance);
//			accountList.add(newAccount);
//			System.out.println("결과: 계좌가 생성되었습니다.");
//		}
//	}
//		
//	}
