package com.launchpad.coroutine.repository

import com.launchpad.coroutine.service.Webservice
import com.launchpad.coroutine.service.webservice

class TodoRepository {
  private var client: Webservice = webservice

  suspend fun getTodo(id: Int) = client.getTodo(id)
}