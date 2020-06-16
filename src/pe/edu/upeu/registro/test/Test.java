package pe.edu.upeu.registro.test;

import com.google.gson.Gson;

import pe.edu.upeu.registro.dao.AlumnoDao;
import pe.edu.upeu.registro.dao.EscuelaDao;
import pe.edu.upeu.registro.daoImp.AlumnoDaoImp;
import pe.edu.upeu.registro.daoImp.EscuelaDaoImp;
import pe.edu.upeu.registro.util.Conexion;


public class Test {
	private static AlumnoDao pd = new AlumnoDaoImp();
	private static EscuelaDao esc = new EscuelaDaoImp();
	private static Gson g = new Gson();
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//conex();
			listarP();
			//listarC();
		}
	  static void listarP() {
		  System.out.println(g.toJson(pd.read(17)));
	  }
	  static void listarC() {
		  System.out.println(g.toJson(esc.readAll()));
	  }
	  static void conex() {
		  if (Conexion.getConexion()!=null) {
			System.out.println("Conectado");
		} else {
			System.out.println("Desconectado");

		}
	  }
}
