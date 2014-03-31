package com.hpcloud.mon.domain.model.statistic;

import java.util.Map;

/**
 * Encapsulates a metric measurements.
 * 
 * @author Jonathan Halterman
 */
public class Statistic {
  private String name;
  private Map<String, String> dimensions;
  private Map<String, Object> statistics;

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Statistic other = (Statistic) obj;
    if (dimensions == null) {
      if (other.dimensions != null)
        return false;
    } else if (!dimensions.equals(other.dimensions))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (statistics == null) {
      if (other.statistics != null)
        return false;
    } else if (!statistics.equals(other.statistics))
      return false;
    return true;
  }

  public Map<String, String> getDimensions() {
    return dimensions;
  }

  public String getName() {
    return name;
  }

  public Map<String, Object> getStatistics() {
    return statistics;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((dimensions == null) ? 0 : dimensions.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((statistics == null) ? 0 : statistics.hashCode());
    return result;
  }

  public void setDimensions(Map<String, String> dimensions) {
    this.dimensions = dimensions;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStatistics(Map<String, Object> statistics) {
    this.statistics = statistics;
  }

  @Override
  public String toString() {
    return String.format("Statistic [name=%s, dimensions=%s, statistics=%s]", name, dimensions,
        statistics);
  }
}