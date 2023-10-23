package alex_olhovskiy.Calculator;

public class Presenter {
	Model model;
	
	public Presenter() {
		model=new Model();
	}
	
	public String getString(String str) {
		return model.getString(str);
	}
}
