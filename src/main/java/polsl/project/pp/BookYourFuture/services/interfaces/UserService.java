package polsl.project.pp.BookYourFuture.services.interfaces;

import polsl.project.pp.BookYourFuture.entities.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public User findById(int theId);

    public void save(User theUser);

    public void deleteById(int theId);

    public User findByUsername(String theUsername);

    public void updateUser(User theUser, String phone, String password);

    public void updateUserPhone(User theUser,String phone);

    public void updateUserPass(User theUser,String password);

    public User findByEmail(String email);

    public User findByPhone(String phone);

    public boolean hasEmptyValues(User user);

}
