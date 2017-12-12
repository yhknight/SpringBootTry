package com.sap.pi.forFun.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import com.sap.pi.forFun.model.UserInfo;
import com.sap.pi.forFun.repo.UserInfoRepo;

@Service
public class UserInfoServiceImpl implements UserinfoService {

	private final static Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

	@Autowired
	UserInfoRepo userRepo;

	@Autowired
	ApplicationEventPublisher pub;

	@Override
	public List<UserInfo> getSaveAndgetAllUsers() {
		// TODO Auto-generated method stub
		UserInfo u1 = new UserInfo();
		u1.setName("Jack");
		userRepo.save(u1);
		pub.publishEvent(u1);
		return userRepo.findAll();
	}


	public void userCreatedListener(UserInfo user) {
		logger.info("new user info is:" + user.getId() + ";" + user.getName());
	}

}
