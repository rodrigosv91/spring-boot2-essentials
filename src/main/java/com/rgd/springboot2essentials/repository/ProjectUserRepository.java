package com.rgd.springboot2essentials.repository;

import com.rgd.springboot2essentials.domain.ProjectUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectUserRepository extends JpaRepository<ProjectUser, Integer> {

    ProjectUser findByUsername(String username);
}
