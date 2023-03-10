package com.example.sample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.Table.Shop;

public interface ShopRepo extends JpaRepository<Shop, Integer>{

}
