import java.util.Scanner;


public class Posfixa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pilha<Character> pilha = new Pilha<Character>();
		String expressao;
		String polonesa = "";
		char ch;
		
		System.out.println("Informe uma expressão com parenteses ");
		expressao = input.next();
		
		for(int i = 0; i< expressao.length(); i++) {
			ch = expressao.charAt(i);
			if(ch != '(') {
				switch(ch) {
				case '+':
				case '-':
				case '*':
				case '/':
					pilha.push(ch);
					break;
				case ')':
					polonesa += pilha.pop();
					break;
				default:
					polonesa += ch;
				}
					
				}
			}System.out.println(polonesa);
			
		}	
	}
