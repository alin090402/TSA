package org.example.database.repository;



import org.example.database.model.BotModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BotRepository extends JpaRepository<BotModel, Long> {

    Optional<BotModel> findBotByName(String name);

    Optional<List<BotModel>> findByUserUsername(String username);
}
