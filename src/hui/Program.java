package hui;

public class Program {
	
	// INSTANCE VARIABLE =========================================
	private String _name;
	private int _id;
	private String _accountNum;
	
	
	// MODIFIERS =================================================
	public String getName() {
		return this._name;
	}

	public void setName(String _name) {
		this._name = _name;
	}
	
	public int getId() {
		return this._id;
	}

	public void setId(int _id) {
		this._id = _id;
	}
	
	public String getAccountNumber(){
		return this._accountNum;
	}
	
	public void setAccountNumber(String acc) {
		
		this._accountNum = acc;
	}
		
	// CONSTRUCTOR ==================================================
	
	public Program() {
		
	}
	public Program(String acc, String name) {
		this._Initialize(acc, name);
		
	}
	
	// PRIVATE METHODS ============================================
	
	private void _Initialize(String number, String name) {
		this.setName(name);
		this.setAccountNumber(number);
	}
	
	// METHODS ====================================================
	public void print() {
		mainProgram.print(this.getName());
	}
	
}
