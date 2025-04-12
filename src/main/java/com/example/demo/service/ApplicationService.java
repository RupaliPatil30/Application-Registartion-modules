package com.example.demo.service;

import com.example.demo.entity.Application;

import java.util.List;

public interface ApplicationService {
    Application saveApplication(Application application);
    Application getApplicationById(Integer appNum);
    List<Application> getAllApplications();
    Application updateApplication(Integer appNum, Application application);
    void deleteApplication(Integer appNum);
}


