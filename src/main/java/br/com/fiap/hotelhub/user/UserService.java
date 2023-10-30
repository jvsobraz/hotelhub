package br.com.fiap.hotelhub.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public void addScore(User user, Integer score) {
        var optional = repository.findById(user.getId());
        if (optional.isEmpty())
            throw new RuntimeException("Usuário não encontrado");

        var userDb = optional.get();
        userDb.setScore(userDb.getScore() + score);
        repository.save(userDb);
    }
    
}