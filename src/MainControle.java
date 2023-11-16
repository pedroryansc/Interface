public class MainControle {
	public static void main(String[] args) {
		TV tv = new TV();
		ControleRemoto cr = new ControleRemoto();
		
		System.out.println("Liga/Desliga:");
		
		tv.setEstado(true);
		System.out.println(tv.ligaDesliga());
		
		System.out.println("\nAlterar Canal:");
		
		tv.setCanal(1);
		System.out.println(tv.alterarCanal(10));
		System.out.println(tv.getCanal());
		
		System.out.println("\nCanal Mais:");
		
		System.out.println(tv.canalMais());
		System.out.println(tv.getCanal());
		
		System.out.println("\nCanal Menos:");
		
		System.out.println(tv.canalMenos());
		System.out.println(tv.getCanal());
		
		System.out.println("\nVolume Mais:");
		
		tv.setVolume(20);
		System.out.println(tv.volumeMais());
		System.out.println(tv.getVolume());
		
		System.out.println("\nVolume Menos:");
		
		tv.setVolume(0);
		System.out.println(tv.volumeMenos());
		System.out.println(tv.getVolume());
	}
}