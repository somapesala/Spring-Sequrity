package com.example.cc.controller;

public interface UserService{
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
