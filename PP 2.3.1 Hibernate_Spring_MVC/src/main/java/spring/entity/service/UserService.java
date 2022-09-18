package spring.entity.service;

import spring.entity.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);
    public User getUser(int id);
    public void deleteById(int id);
}
