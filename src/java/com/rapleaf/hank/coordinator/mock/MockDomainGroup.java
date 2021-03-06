/**
 *  Copyright 2011 Rapleaf
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.rapleaf.hank.coordinator.mock;

import com.rapleaf.hank.coordinator.AbstractDomainGroup;
import com.rapleaf.hank.coordinator.Domain;
import com.rapleaf.hank.coordinator.DomainGroupChangeListener;
import com.rapleaf.hank.coordinator.DomainGroupVersion;

import java.io.IOException;
import java.util.*;

public class MockDomainGroup extends AbstractDomainGroup {
  private final String name;
  private final Map<Domain, Integer> domains = new HashMap<Domain, Integer>();

  public MockDomainGroup(String name) {
    super(null);
    this.name = name;
  }

  public Domain getDomain(int domainId) {
    return null;
  }

  public Integer getDomainId(String domainName) {
    return 0;
  }

  public String getName() {
    return name;
  }

  public SortedSet<DomainGroupVersion> getVersions() {
    return new TreeSet<DomainGroupVersion>();
  }

  @Override
  public String toString() {
    return "MockDomainGroupConfig [name=" + name + "]";
  }

  public void setListener(DomainGroupChangeListener listener) {
  }

  public void addDomain(Domain domain, int domainId) {
    domains.put(domain, domainId);
  }

  public DomainGroupVersion createNewVersion(Map<Domain, Integer> domainIdToVersion) {
    return null;
  }

  public Set<Domain> getDomains() throws IOException {
    return domains.keySet();
  }
}
