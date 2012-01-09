/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portal.events.aggr.dao;

import java.util.List;

import org.jasig.portal.events.aggr.TimeDimension;
import org.joda.time.LocalTime;

/**
 * DAO for creation/lookup of time dimensions
 * 
 * @author Eric Dalquist
 * @version $Revision$
 */
public interface TimeDimensionDao {
    
    TimeDimension createTimeDimension(LocalTime calendar);

    List<TimeDimension> getTimeDimensions();

    TimeDimension getTimeDimensionById(long id);

    TimeDimension getTimeDimensionForLocalTime(LocalTime localTime);

}