package com.example.respository;


import java.util.List;

import com.example.entity.Member;
//import com.microsoft.sqlserver;
import org.springframework.data.repository.CrudRepository;

// public interface UserRespository extends JpaRepository<Member,Long>
// {
//     List<Member> GetUsers();
// }

public interface IUserRespository extends CrudRepository<Member,Long>
{
    //List<Member> GetUsers();
}