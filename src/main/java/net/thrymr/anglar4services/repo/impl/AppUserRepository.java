package net.thrymr.anglar4services.repo.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import net.thrymr.anglar4services.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser,Long>{

   AppUser findByNameAndPassword(String name, String password);
   
}
