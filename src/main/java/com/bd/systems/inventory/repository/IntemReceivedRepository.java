package com.bd.systems.inventory.repository;

import com.bd.systems.inventory.domains.ItemReceived;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IntemReceivedRepository extends JpaRepository<ItemReceived, Long> {
}
