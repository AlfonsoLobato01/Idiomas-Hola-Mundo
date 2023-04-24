package RetoInicial.HolaMundo.RepoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import RetoInicial.HolaMundo.Idioma.Idioma;
import RetoInicial.HolaMundo.Repo.IdiomaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class IdiomaRepositoryImpl implements IdiomaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Idioma> findAll() {
		TypedQuery<Idioma> query = entityManager.createQuery("SELECT i FROM Idioma i", Idioma.class);
		return query.getResultList();
	}

	@Override
	public Optional<Idioma> findById(Long id) {
		return Optional.ofNullable(entityManager.find(Idioma.class, id));
	}

	@Override
	public Optional<Idioma> findByCodigo(String codigo) {
		TypedQuery<Idioma> query = entityManager.createQuery("SELECT i FROM Idioma i WHERE i.codigo = :codigo",
				Idioma.class);
		query.setParameter("codigo", codigo);
		List<Idioma> idiomas = query.getResultList();
		return idiomas.isEmpty() ? Optional.empty() : Optional.of(idiomas.get(0));
	}

	@Override
	public <S extends Idioma> S save(S idioma) {
		if (idioma.getId() == null) {
			entityManager.persist(idioma);
			return idioma;
		} else {
			return entityManager.merge(idioma);
		}
	}

	@Override
	public void deleteById(Long id) {
		Query query = entityManager.createQuery("DELETE FROM Idioma i WHERE i.id = :id");
		query.setParameter("id", id);
		query.executeUpdate();
	}

}
