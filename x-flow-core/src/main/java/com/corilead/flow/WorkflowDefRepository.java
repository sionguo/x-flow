package com.corilead.flow;

import java.util.Optional;

/**
 * 工作流定义存储库
 *
 * @author Guo XiaoYong
 */
public interface WorkflowDefRepository {
  /**
   * 创建工作流程def
   *
   * @param workflowDef 工作流定义
   */
  void createWorkflowDef(WorkflowDef workflowDef);

  /**
   * 更新工作流定义
   *
   * @param workflowDef 工作流定义
   */
  void updateWorkflowDef(WorkflowDef workflowDef);

  /**
   * 获取最新工作流定义
   *
   * @param name 名称
   * @return {@code Optional<WorkflowDef> }
   */
  Optional<WorkflowDef> getLatestWorkflowDef(String name);

  /**
   * 获取工作流定义
   *
   * @param name 名称
   * @param version 版本
   * @return {@code Optional<WorkflowDef> }
   */
  Optional<WorkflowDef> getWorkflowDef(String name, int version);

  /**
   * 删除工作流定义
   *
   * @param name 名称
   * @param version 版本
   */
  void removeWorkflowDef(String name, Integer version);
}
