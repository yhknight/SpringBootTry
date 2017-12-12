package com.sap.pi.forFun.service;

import java.util.List;

import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import com.sap.pi.forFun.model.UserInfo;

public interface UserinfoService {
	@Transactional
	public List<UserInfo> getSaveAndgetAllUsers();

	@TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT, classes = { UserInfo.class })
	//@EventListener
	public void userCreatedListener(UserInfo user);
}
