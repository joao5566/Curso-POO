
public class Gerente  extends Funcionario{
	private String usuario;
	private String senha;
	
	public String getusuario() {
		return usuario;
		
	}
	
	public void setusuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getsenha() {
		return senha;
	}
	
	public void setsenha(String senha) {
		this.senha = senha;
		
	}
	
}
