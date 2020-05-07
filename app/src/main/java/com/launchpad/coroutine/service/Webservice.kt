package com.launchpad.coroutine.service

import com.launchpad.coroutine.models.Todo
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * REST API access points.
 */
interface Webservice {

  @GET("/todos/{id}")
  suspend fun getTodo(@Path(value = "id") todoId: Int): Todo
}