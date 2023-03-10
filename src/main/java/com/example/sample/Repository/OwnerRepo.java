package com.example.sample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.Table.Owner;

public interface OwnerRepo extends JpaRepository<Owner, Integer>{

}
