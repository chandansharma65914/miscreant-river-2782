package com.masai.Utility;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Util {
    static EntityManagerFactory emf= null;
    static {
    	emf=Persistence.createEntityManagerFactory("Pathshala");
    }
    public static EntityManager getEntityManager () {
    	return emf.createEntityManager();
    }
}
