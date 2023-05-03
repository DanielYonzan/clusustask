package com.daniel.clusustask.repository;

import com.daniel.clusustask.entity.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Daniel Tamang
 * @since 5/2/2023
 */
@Repository
public interface DealRepository extends JpaRepository<Deal, Long> {

}
