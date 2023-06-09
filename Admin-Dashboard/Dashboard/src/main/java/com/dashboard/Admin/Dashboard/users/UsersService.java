package com.dashboard.Admin.Dashboard.users;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAllUsers() {
        return usersRepository.findAllByOrderByIdAsc();
    }

    public Users getSingleUser(int id) {
        return usersRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user id: " + id));
    }

    public void save(Users users){
        usersRepository.save(users);
    }

    public void deleteUserById(int id){
        usersRepository.deleteById(id);
    }


}
