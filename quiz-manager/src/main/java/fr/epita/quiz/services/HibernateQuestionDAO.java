/**
 * Ce fichier est la propriété de Thomas BROUSSARD
 * Code application :
 * Composant :
 */
package fr.epita.quiz.services;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.query.Query;

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
public class HibernateQuestionDAO extends GenericHibernateDao<Question> {

	@Inject
	@Named("questionQuery")
	String query;

	@Override
	protected Query getSearchQuery(Question question) {
		// TODO complete

		final Query searchQuery = sf.openSession().createQuery(query);
		searchQuery.setParameter("type", question.getType());
		searchQuery.setParameter("question", question.getQuestion());
		return searchQuery.toString();
	}

}
