package com.example.IdentityService;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class IdentityRepository {
    static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User(
                "Judith Margarita",
                "Paco",
                "13416598",
                "28/12/2002",
                "07/05/2018",
                "13/02/2025"
        ));
        users.add(new User(
                "Aylen",
                "Gonzales",
                "13416598",
                "28/12/2002",
                "07/05/2018",
                "13/02/2025"
        ));
        users.add(new User(
                "Melany Evelin",
                "Torrico",
                "13416598",
                "28/12/2002",
                "07/05/2018",
                "13/02/2025"
        ));
    }
    public boolean findByCi(String ci) {
        try {
            boolean found = false;
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getCi().equals(ci)) {
                    found = true;
                    break;
                }
            }
            return found;
        } catch (Exception e) {
            return false;
        }

    }
}
