package br.com.generation.HerançaExercicio;

public class testaAnimal {

	public static void main(String[] args) {
    
		
		Cavalo cav1 = new Cavalo();
		Cachorro dog1 = new Cachorro();
		
		cav1.setCorrer("O cavalo corre");
		cav1.setIdade(15);
		cav1.setSom("Relincha");
		
		System.out.println(cav1.getCorrer());
		System.out.println(cav1.getIdade());
		System.out.println(cav1.getSom());
		
		
	}

}
