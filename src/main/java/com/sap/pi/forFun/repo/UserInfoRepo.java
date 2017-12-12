package com.sap.pi.forFun.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sap.pi.forFun.model.UserInfo;

public interface UserInfoRepo extends JpaRepository<UserInfo, Long> {

}
