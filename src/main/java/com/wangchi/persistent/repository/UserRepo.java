package com.wangchi.persistent.repository;

import com.wangchi.persistent.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepo extends JpaRepository<UserPO,Integer>,JpaSpecificationExecutor<UserPO>{
}
