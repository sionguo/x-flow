package com.corilead.flow;

import lombok.Data;

/**
 * 工作流模型定义
 *
 * @author Guo XiaoYong
 */
@Data
public class WorkflowModelDef {
  /** 名称 */
  private String name;

  /** 版本 */
  private String version;

  /** 描述 */
  private String description;

  /** 任务 */
  private String tasks;
}
