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
import org.hibernate.query.Query;

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
public abstract class GenericHibernateDao<T> {

	@Inject
	SessionFactory sf;

	public void create(T entity) {
		final Session session = sf.openSession();
		session.saveOrUpdate(entity);

	}

	public void update(T entity) {
		final Session session = sf.openSession();
		session.saveOrUpdate(entity);
	}

	public void delete(T entity) {
		final Session session = sf.openSession();
		session.delete(entity);
	}

	public List<T> search(T entity) {
		final Session session = sf.openSession();
		// Improvement?
		//CriteriaQuery<T> criteria =
		final Query searchQuery = session.createQuery(getSearchQuery(entity));
		return searchQuery.list();
	}

	protected abstract String getSearchQuery(T entity);

}
