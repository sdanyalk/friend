package com.sdk.friend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sdk.friend.entity.Friend;
import com.sdk.friend.service.FriendService;

@RestController
public class FriendController {
	@Autowired
	FriendService service;

	@GetMapping(path = "/api/friends")
	public @ResponseBody Iterable<Friend> getAllFriends() {
		return service.getAllFriends();
	}

	@PostMapping(path = "/api/friends")
	public @ResponseBody Friend addFriend(@RequestBody Friend friend) {
		return service.addFriend(friend);
	}
}
