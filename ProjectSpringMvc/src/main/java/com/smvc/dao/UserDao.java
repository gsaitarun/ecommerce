package com.smvc.dao;


import com.smvc.pojo.FetchPojo;
import com.smvc.pojo.LoginPojo;
import com.smvc.pojo.RegistrationPojo;

public interface UserDao
{
public void registrate(RegistrationPojo user);

public  RegistrationPojo validation(LoginPojo login);

public LoginPojo Connect1(); 

}