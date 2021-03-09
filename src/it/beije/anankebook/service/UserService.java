package it.beije.anankebook.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.beije.anankebook.model.beans.Friendship;
import it.beije.anankebook.model.beans.User;
import it.beije.anankebook.repository.FriendshipRepository;
import it.beije.anankebook.repository.UserRepository;
import it.beije.anankebook.util.Status;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private FriendshipRepository friendshipRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public User findByEmailAndPassword(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}

	public List<User> userFriendsList(List<Friendship> list){
		List<User> friends = new ArrayList<>();
		for(Friendship f: list) {
			friends.add(userRepository.findById(f.getUserReceiverId()).get());
		}
		return friends;
	}
	public void updateUser(String password, String name, String surname, LocalDate birthday, String gender, String nationality, String username, HttpSession session) {
		User u = (User) session.getAttribute("Utente");
		System.out.println(u.toString());
			u.setEmail(u.getEmail());
			u.setName(name);
			u.setSurname(surname);
			u.setPassword(password);
			u.setBirthday(birthday);
			u.setGender(gender);
			u.setNationality(nationality);
			u.setUsername(username);
			u.setAge(u.getAge());
			System.out.println(u.toString());
			userRepository.save(u);
			return;
	}

}
