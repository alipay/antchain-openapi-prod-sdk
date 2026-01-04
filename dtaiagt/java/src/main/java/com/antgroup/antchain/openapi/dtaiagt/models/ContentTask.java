// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ContentTask extends TeaModel {
    // 任务ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 任务名称
    /**
     * <strong>example:</strong>
     * <p>任务名称</p>
     */
    @NameInMap("task_name")
    @Validation(required = true)
    public String taskName;

    // 任务类型
    /**
     * <strong>example:</strong>
     * <p>任务类型</p>
     */
    @NameInMap("task_type")
    @Validation(required = true)
    public String taskType;

    // 任务状态:
    /**
     * <strong>example:</strong>
     * <p>init/end</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static ContentTask build(java.util.Map<String, ?> map) throws Exception {
        ContentTask self = new ContentTask();
        return TeaModel.build(map, self);
    }

    public ContentTask setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ContentTask setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ContentTask setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ContentTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
