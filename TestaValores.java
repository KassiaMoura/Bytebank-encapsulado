
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337,12345);
	
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337,12346);
		Conta conta3 = new Conta(1337,12347);
		
		System.out.println(Conta.getTotal());
	}
}
