package com.ufrn.highlighter.service;

import com.ufrn.highlighter.model.ApplicationUser;
import com.ufrn.highlighter.repository.ApplicationUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ApplicationUserService {

    private final ApplicationUserRepository applicationUserRepository;
    public void registerNewUser (ApplicationUser user) {applicationUserRepository.save(user);}
}