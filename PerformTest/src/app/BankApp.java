package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {

	private List<Account> accounts = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		BankApp app = new BankApp();
		app.start();
		
		System.out.println("프로그램 종료");
	}
	
	public void start() {
		
		boolean running = true;
		
		while (running) {
			printMenu();
			System.out.print("선택> ");
			int choice = Integer.parseInt(scanner.next());
			
			switch (choice) {
				case 1 -> createAccount();
				case 2 -> listAccounts();
				case 3 -> depositAccount();
				case 4 -> withdrawAccount();
				case 5 -> {
					running = false;
				}
				default -> System.out.println("올바른 번호를 선택하세요.");
			}
		}
	}
	
	public void printMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------------");
	}
	
	// 메서드 구현해서 프로그램 완성하기
	public void createAccount() {
		System.out.println("----------------- 계좌생성 -----------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("계좌주: ");
		String owner = scanner.next();

		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		Account account = new Account(ano, owner, balance);
		accounts.add(account);
		System.out.println("결과: 계좌가 생성되었습니다.");
	} 
	public void listAccounts() {
		System.out.println("----------------- 계좌목록 -----------------");
		for (int i = 0; i < accounts.size(); i++) {
			System.out.print(accounts.get(i).getAno() + " ");
			System.out.print(accounts.get(i).getOwner() + " ");
			System.out.print(accounts.get(i).getBalance() + " ");
			System.out.println();
		}
		
	}
	public void depositAccount() {
		System.out.println("------------------- 예금 -------------------");
		System.out.print("계좌번호: ");
		String new_ano = scanner.next();
		System.out.print("예금액: ");
		int set_b = scanner.nextInt();

		if (findAccount(new_ano) != null) {
			findAccount(new_ano).setBalance(set_b);
			System.out.println("결과: 예금이 성공되었습니다.");
			return ;
		}
		
		System.out.println("결과: 계좌가 없습니다.");
	}
	public void withdrawAccount() {
		System.out.println("------------------- 출금 -------------------");
		System.out.print("계좌번호: ");
		String new_ano = scanner.next();
		System.out.print("출금액: ");
		int with_b = scanner.nextInt();
		with_b = -1 * with_b;

		if (findAccount(new_ano) != null) {
			findAccount(new_ano).setBalance(with_b);
			System.out.println("결과: 출금이 성공되었습니다.");
			return ;
		}
		
		System.out.println("결과: 계좌가 존재하지 않습니다.");
	}
	public Account findAccount(String ano) {
		for (int i = 0; i < accounts.size(); i++) {
			if (ano.equals(accounts.get(i).getAno()))
				return accounts.get(i);
		}
		return null;
	}
}
