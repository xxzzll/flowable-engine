/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.cmmn.api;

import org.flowable.cmmn.api.runtime.InjectedPlanItemInstanceBuilder;

/**
 * An API to manipulate running CMMN based case instances or plan items.
 *
 * @author Micha Kiener
 */
public interface DynamicCmmnService {

    /**
     * Creates a new builder to dynamically create a new plan item and inject it into a running stage or case instance.
     *
     * @return the builder used to create the new plan item to be dynamically injected
     */
    InjectedPlanItemInstanceBuilder createInjectedPlanItemInstanceBuilder();
}
