package com.example.IdentityService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentityServiceTest {

    @Test
    void ciExist() {
        IdentityRepository identityRepository  = new IdentityRepository();
        IdentityService service = new IdentityService(identityRepository);

        assertEquals(true, service.ciExist("13416598"));
    }

    @Test
    void ciDoesntExist() {
        IdentityRepository identityRepository  = new IdentityRepository();
        IdentityService service = new IdentityService(identityRepository);

        assertFalse(service.ciExist("13516598"));
    }
}