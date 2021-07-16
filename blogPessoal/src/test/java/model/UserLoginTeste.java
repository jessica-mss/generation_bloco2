package model;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.generation.blogPessoal.model.UserLogin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UserLoginTeste {
	
	public UserLogin userLogin;

	@Autowired
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	Validator validator = factory.getValidator();

	@BeforeEach
	public void start() {

		userLogin = new UserLogin("amanda", "amanda-2@gmail.com", "testeteste", "testando");

	};

	@Test
	void testValidaAtributos() {
		Set<ConstraintViolation<UserLogin>> violacao = validator.validate(userLogin);
		System.out.println(violacao.toString());
		assertTrue(violacao.isEmpty());
	}

}
