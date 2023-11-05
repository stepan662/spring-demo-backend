package com.example.backenddemo.api.controllers

import com.example.backenddemo.api.request.ItemCreateDto
import com.example.backenddemo.repository.ItemRepository
import com.example.backenddemo.model.ItemModel
import com.example.backenddemo.service.ItemService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("items")
class ItemController (
  private val itemService: ItemService
) {
  @GetMapping
  fun getItems(): List<ItemModel> {
    return itemService.getAllItems()
  }

  @PostMapping
  fun addItem(@RequestBody data: ItemCreateDto): ItemModel {
    return itemService.createItem(data)
  }

  @DeleteMapping("{id:[0-9]+}")
  fun delete(@PathVariable id: Long) {
    itemService.deleteItem(id)
  }
}