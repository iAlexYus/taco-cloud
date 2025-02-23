package sia.taco_cloud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
import sia.taco_cloud.data.IngredientRepository;
import sia.taco_cloud.data.TacoRepository;
import sia.taco_cloud.data.UserRepository;
import sia.taco_cloud.models.Ingredient;
import sia.taco_cloud.models.Ingredient.Type;
import sia.taco_cloud.models.Taco;

import java.util.Arrays;

@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

    @Bean
//	@Profile({"dev", "qa"})
    @Profile("!prod") //может быть применён к люому классу отмеченному @Configuration
    //дополнительная обработка перед запуском Spring-приложения
    //но после загрузки контейнера Spring
    //метод CommandLineRunner получает строку со всеми параметрами командной строки
    public CommandLineRunner dataLoader(IngredientRepository repo,
                                        UserRepository userRepo,
                                        PasswordEncoder encoder,
                                        TacoRepository tacoRepo) {
        return args -> {
            var flourTortilla = new Ingredient("FLTO", "Flour Tortilla", Type.WRAP);
            var cornTortilla = new Ingredient("COTO", "Corn Tortilla", Type.WRAP);
            var groundBeef = new Ingredient("GRBF", "Ground Beef", Type.PROTEIN);
            var carnitas = new Ingredient("CARN", "Carnitas", Type.PROTEIN);
            var dicedTomatoes = new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES);
            var lettuce = new Ingredient("LETC", "Lettuce", Type.VEGGIES);
            var cheddar = new Ingredient("CHED", "Cheddar", Type.CHEESE);
            var monterreyJack = new Ingredient("JACK", "Monterrey Jack", Type.CHEESE);
            var salsa = new Ingredient("SLSA", "Salsa", Type.SAUCE);
            var sourCream = new Ingredient("SRCR", "Sour Cream", Type.SAUCE);
            repo.save(flourTortilla);
            repo.save(cornTortilla);
            repo.save(groundBeef);
            repo.save(carnitas);
            repo.save(dicedTomatoes);
            repo.save(lettuce);
            repo.save(cheddar);
            repo.save(monterreyJack);
            repo.save(salsa);
            repo.save(sourCream);

            Taco taco1 = new Taco();
            taco1.setName("Carnivore");
            taco1.setIngredients(Arrays.asList(
                    flourTortilla,
                    groundBeef,
                    carnitas,
                    sourCream,
                    salsa,
                    cheddar));
            tacoRepo.save(taco1);

            Taco taco2 = new Taco();
            taco2.setName("Bovine Bounty");
            taco2.setIngredients(Arrays.asList(
                    cornTortilla,
                    groundBeef,
                    cheddar,
                    monterreyJack,
                    sourCream));
            tacoRepo.save(taco2);

            Taco taco3 = new Taco();
            taco3.setName("Veg-Out");
            taco3.setIngredients(Arrays.asList(
                    flourTortilla,
                    dicedTomatoes,
                    lettuce,
                    salsa));
            tacoRepo.save(taco3);
        };
    }

    //ApplicationRunner получает на вход параметр ApplicationArguments
    //предлагающий методы для доступа к отдельным аргументам из командной строки
//	public ApplicationRunner dataLoader(IngredientRepository repo) {
//		//то же что и в CommandLineRunner
//	}
}
