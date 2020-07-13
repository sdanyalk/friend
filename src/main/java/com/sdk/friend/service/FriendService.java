package com.sdk.friend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdk.friend.entity.Friend;
import com.sdk.friend.repository.FriendRepository;

@Service
public class FriendService {
	@Autowired
	FriendRepository repository;

	public Iterable<Friend> getAllFriends() {
		return repository.findAll();
	}
	
	public Friend addFriend(Friend friend) {
		return repository.save(friend);
	}
}
