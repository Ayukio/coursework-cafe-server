package com.cafe_server.demo;

import com.cafe_server.demo.model.*;
import com.cafe_server.demo.payload.response.JwtResponse;
import com.cafe_server.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private DishRepository dishRepository;

	@Autowired
	private DishCategoryRepository dishCategoryRepository;

	@Autowired
	private RoleRepository roleRepository;


	@Autowired
	private UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner runner() {
		return args -> {
//			Сохранение предварительных данных перед стартом

//			dishCategoryRepository.save(new DishCategory(1,"Напитки", "Водопьянова А.А.", 55));
//			dishCategoryRepository.save(new DishCategory( 2,"Закуски", "Салатов В.В.", 120));
//			dishCategoryRepository.save(new DishCategory( 3,"Первые блюда", "Суповицкий Н.Н.", 250));
//			dishCategoryRepository.save(new DishCategory( 4,"Десерты", "Тортов О.А.", 200));
//			dishCategoryRepository.save(new DishCategory( 5,"Выпечка", "Пирожкова О.Н.", 69));
//			dishCategoryRepository.save(new DishCategory( 6,"Вторые блюда", "Мясницкий А.А.", 235));
//
//			roleRepository.save(new Role(ERole.ROLE_ADMIN));
//			roleRepository.save(new Role(ERole.ROLE_USER));
////			userRepository.save(new User("user", "user@mail.ru", "1234567"));
//
//
//			dishRepository.save(new Dish((long) 7, "Чай черный", 150,"Ароматный чай прямиком из Индии", 110, (long) 1));
//			dishRepository.save(new Dish((long) 8, "Свежевыжатый сок", 150, "Из свежих фруктов - апельсин, грейпфрут, яблоко", 120, (long) 1));
//			dishRepository.save(new Dish((long) 9, "Салат Греческий",  300,"Свежие огурцы, болгарский перец, помидоры, маслины, оливки", 300, (long) 2));
//			dishRepository.save(new Dish((long) 10, "Баклажаны в кисло-сладком соусе", 325,"Теплая закуска из кусочков баклажан в кисло-сладком соусе", 350, (long) 2));
//			dishRepository.save(new Dish((long) 11, "Суп \"Том Ям\"", 415, "Суп с морепродуктами по-азиатски", 700, (long) 3));
//			dishRepository.save(new Dish((long) 12, "Борщ", 407,"Классический со сметаной", 430, (long) 3));
//			dishRepository.save(new Dish((long) 13, "Мороженое", 85, "Ванильное, клубничное или шоколадное", 75, (long) 4));
//			dishRepository.save(new Dish((long) 14, "Чизкейк", 175,"Творожный пирог с арахисовой посыпкой", 465, (long) 4));
//			dishRepository.save(new Dish((long) 15, "Булочка французская", 125, "Белая с кунжутом или чёрная с кориандром", 69, (long) 5));
//			dishRepository.save(new Dish((long) 16, "Вафли Венские", 40,"С ванильным или медовым кремом", 423, (long) 5));
//			dishRepository.save(new Dish((long) 17, "Стейк из тунца", 390,"Подается с овощным салатом из свежего огурца, томатов, стручковой фасоли", 650, (long) 6));
//			dishRepository.save(new Dish((long) 18, "Бефстроганов", 450,"Подается с солёным огурцом, свежим помидором и красным луком", 850, (long) 6));




		};

	};
};