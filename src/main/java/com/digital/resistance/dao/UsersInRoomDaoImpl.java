package com.digital.resistance.dao;

import com.digital.resistance.domain.Room;
import com.digital.resistance.domain.User;
import com.digital.resistance.domain.UsersInRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class UsersInRoomDaoImpl implements UsersInRoomDao {

    @Autowired
   private  EntityManagerFactory entityManagerFactory;

    public void saveUsersInRoom(User user, Room room, int price){
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        UsersInRoom usersInRoom = new UsersInRoom(user,room, price);
        em.persist(usersInRoom);
        em.getTransaction().commit();
        em.close();
    }

}
