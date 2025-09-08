package com.in28minutes.rest.webservices.restfull_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;


@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<User>();
	private static int usersCount = 0;

	static {
		users.add(new User(++usersCount, "Adm", LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount, "Eva", LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount, "Jim", LocalDate.now().minusYears(30)));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}

	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
}
