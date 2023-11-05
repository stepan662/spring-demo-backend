package com.example.backenddemo.repository

import com.example.backenddemo.model.ItemModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository : JpaRepository<ItemModel, Long> {}