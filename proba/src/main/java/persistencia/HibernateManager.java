package persistencia;

import org.hibernate.Session;

import biblioteca.Bliblioteca;

public class HibernateManager {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Bliblioteca biblio = new Bliblioteca();
		biblio.setNom("Garbanzo");
		session.save(biblio);
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
		System.out.println("Base de datos actualizada");
	}
}
