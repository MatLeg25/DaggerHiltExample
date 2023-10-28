package com.example.daggerhiltproject.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}