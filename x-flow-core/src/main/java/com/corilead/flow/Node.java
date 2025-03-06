package com.corilead.flow;

import java.util.Map;

/**
 * 节点
 *
 * @author Guo XiaoYong
 */
public interface Node {
  String getId();

  void setId(String id);

  String getName();

  void setName(String name);

  Map<String, Object> getMetaData();

  void addMetaData(String name, Object value);
}
