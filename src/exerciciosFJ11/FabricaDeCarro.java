package exerciciosFJ11;

//um design sigleton
public class FabricaDeCarro {

	private static FabricaDeCarro obj;
	
	private FabricaDeCarro(){}//um construtor privado para forçar o uso do getInstance
	
	public static FabricaDeCarro getInstance(){
		if (obj == null){
			obj = new FabricaDeCarro();
		}
		return obj;
	}
	
}
