package com.example.IdentityService;

import org.springframework.stereotype.Service;

@Service
public class IdentityService {

    IdentityRepository identityRepository;
    public IdentityService(IdentityRepository identityRepository) {
        this.identityRepository = identityRepository;
    }

    public boolean ciExist(String ci){
        return identityRepository.findByCi(ci);
    }
}
