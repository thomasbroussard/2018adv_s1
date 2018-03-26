/**
 * Ce fichier est la propriété de Thomas BROUSSARD
 * Code application :
 * Composant :
 */
package fr.epita.quiz.services;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import fr.epita.quiz.datamodel.Question;

/**
 * <h3>Description</h3>
 * <p>This class allows to ...</p>
 *
 * <h3>Usage</h3>
 * <p>This class should be used as follows:
 *   <pre><code>${type_name} instance = new ${type_name}();</code></pre>
 * </p>
 *
 * @since $${version}
 * @see See also $${link}
 * @author ${user}
 *
 * ${tags}
 */
public class HibernateQuestionDAO {

	@Inject
	SessionFactory sf;

	public void create(Question question) {
		final Session session = sf.openSession();
		session.saveOrUpdate(question);

	}

	public void update(Question question) {
		final Session session = sf.openSession();
		session.saveOrUpdate(question);
	}

	public void delete(Question question) {
		final Session session = sf.openSession();
		session.delete(question);
	}

	public List<Question> search(Question question) {
		final Session session = sf.openSession();
		return session.createQuery("from Question", Question.class).list();
	}

}
