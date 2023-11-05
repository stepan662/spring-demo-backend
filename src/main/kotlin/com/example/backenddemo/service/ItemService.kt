package com.example.backenddemo.service

import com.example.backenddemo.api.request.ItemCreateDto
import com.example.backenddemo.model.ItemModel
import com.example.backenddemo.repository.ItemRepository
import org.springframework.stereotype.Component

@Component
class ItemService(
  val itemRepository: ItemRepository
) {
  fun createItem(data: ItemCreateDto): ItemModel {
    return itemRepository.save(ItemModel(text = data.text))
  }

  fun getAllItems() = itemRepository.findAll()

  fun deleteItem(id: Long) {
    itemRepository.deleteById(id)
  }
}