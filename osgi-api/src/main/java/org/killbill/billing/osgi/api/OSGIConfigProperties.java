/*
 * Copyright 2014 Groupon, Inc
 * Copyright 2014 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.osgi.api;

import java.util.Properties;

/**
 * OSGI bundles should read their (system) properties using that service interface instead of using
 * the {@codeSystem.getProperties()} as there is no guarantees that standard java mechanism would work.
 */
public interface OSGIConfigProperties {

    /**
     * @param propertyName the system property name
     * @return the value of the property
     */
    public String getString(final String propertyName);

    /**
     * @return all knows system properties (for the JVM)
     */
    public Properties getProperties();
}
