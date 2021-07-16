package repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TemaRepositoryTeste {
	@Autowired
	public TemaRepository repositoryTestTema;

	public Tema tema;

	@Autowired
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	Validator validator = factory.getValidator();

	@BeforeEach
	void start() {

		tema = new Tema("ZikaF24");
		if (repositoryTestTema.findAllByDescricaoContainingIgnoreCase(tema.getDescricao()) != null) {
			repositoryTestTema.save(tema);
		}

	}

	@Test
	void testValidaAtributos() {

		Boolean notOk = tema.getDescricao() == "oi";

		Set<ConstraintViolation<Boolean>> violacao = validator.validate(notOk);
		System.out.println(violacao.toString());
		assertFalse(notOk);
	}

	@Test
	void findAllByDescricaoContainingIgnoreCase() throws Exception {

		List<Tema> okTheme = repositoryTestTema.findAllByDescricaoContainingIgnoreCase(tema.getDescricao());
		Boolean ok = okTheme.equals(tema);
		System.out.println(ok);
		assertFalse(ok);
	};

}
