package com.kirana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirana.model.User_Addr;
import com.kirana.model.User_Addr_PK;

public interface UserAddrRepository extends JpaRepository<User_Addr, User_Addr_PK> {

}
