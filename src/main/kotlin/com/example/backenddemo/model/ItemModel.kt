package com.example.backenddemo.model

import jakarta.persistence.*

@Entity
class ItemModel (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Int? = null,

  @Column(nullable = false)
  val text: String = ""
)