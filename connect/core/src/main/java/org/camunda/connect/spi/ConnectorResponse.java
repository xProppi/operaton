/*
 * Copyright © 2014 - 2018 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.connect.spi;

import java.util.Map;

/**
 * A connector response representing the result of a connector invocation.
 *
 * @author Daniel Meyer
 *
 */
public interface ConnectorResponse {

  /**
   * Retrieves the map of output parameters from the response.
   * @return the map of output parameters.
   */
  Map<String, Object> getResponseParameters();

  /**
   * Returns the value of a response parameter or 'null' if no such
   * parameter is set.
   *
   * @param name the name of the response parameter
   * @return the value of the response parameter of null.
   */
  <V> V getResponseParameter(String name);

}
