package com.corilead.flow;

import java.util.Map;

/**
 * 工作流程
 *
 * @author Guo XiaoYong
 */
public interface Workflow {
  /**
   * 获取id
   *
   * @return {@code String }
   */
  String getId();

  /**
   * 设置id
   *
   * @param id 本我
   */
  void setId(String id);

  /**
   * 获取名称
   *
   * @return {@code String }
   */
  String getName();

  /**
   * 设定名称
   *
   * @param name 名称
   */
  void setName(String name);

  /**
   * 获取元数据
   *
   * @return {@code Map<String, Object> }
   */
  Map<String, Object> getMetaData();

  /**
   * 添加元数据
   *
   * @param name 名称
   * @param value 值
   */
  void addMetaData(String name, Object value);
}
