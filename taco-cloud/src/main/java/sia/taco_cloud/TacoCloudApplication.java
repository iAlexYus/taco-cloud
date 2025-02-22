package sia.taco_cloud;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import sia.taco_cloud.data.IngredientRepository;
import sia.taco_cloud.models.Ingredient;
import sia.taco_cloud.models.Ingredient.Type;

@SpringBootApplication
public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

//	@Bean
//	@Profile({"dev", "qa"})
//	@Profile("!prod") //может быть применён к люому классу отмеченному @Configuration
	//дополнительная обработка перед запуском Spring-приложения
	//но после загрузки контейнера Spring
	//метод CommandLineRunner получает строку со всеми параметрами командной строки
//	public CommandLineRunner dataLoader(IngredientRepository repo) {
//		return args -> {
//			repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
//			repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
//			repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
//			repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
//			repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
//			repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
//			repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
//			repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
//			repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
//			repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
//		};
//	}

	//ApplicationRunner получает на вход параметр ApplicationArguments
	//предлагающий методы для доступа к отдельным аргументам из командной строки
//	public ApplicationRunner dataLoader(IngredientRepository repo) {
//		//то же что и в CommandLineRunner
//	}
}
