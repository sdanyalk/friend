package com.sdk.friend.repository;

import org.springframework.data.repository.CrudRepository;

import com.sdk.friend.entity.Friend;

public interface FriendRepository extends CrudRepository<Friend, Integer> {

}
