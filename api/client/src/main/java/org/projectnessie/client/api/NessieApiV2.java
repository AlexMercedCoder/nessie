/*
 * Copyright (C) 2022 Dremio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.projectnessie.client.api;

/**
 * Interface for the Nessie V2 API implementation.
 *
 * <p>At the java client level this API uses the same builder classes and model types as API v1,
 * however the behaviour of some API methods is different.
 *
 * <p>Most changes between v1 and v2 exist at the REST level (HTTP).
 */
public interface NessieApiV2 extends NessieApiV1 {}