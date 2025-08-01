package com.next.app.api.user.repository;

import com.next.app.api.user.entity.BusinessPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessPersonRepository extends JpaRepository<BusinessPerson, Long> {
}
