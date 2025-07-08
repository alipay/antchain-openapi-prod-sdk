// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class HardeningTaskResponse extends TeaModel {
    // 加固任务的 ID，后续用来轮询调用
    /**
     * <strong>example:</strong>
     * <p>task_id</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 加固任务的状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 加固后 APK/ABB 的 MD5
    /**
     * <strong>example:</strong>
     * <p>after_md_five</p>
     */
    @NameInMap("after_md_five")
    @Validation(required = true)
    public String afterMdFive;

    // 加固后 APK/ABB 的大小
    @NameInMap("after_size")
    @Validation(required = true)
    public Long afterSize;

    public static HardeningTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        HardeningTaskResponse self = new HardeningTaskResponse();
        return TeaModel.build(map, self);
    }

    public HardeningTaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public HardeningTaskResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public HardeningTaskResponse setAfterMdFive(String afterMdFive) {
        this.afterMdFive = afterMdFive;
        return this;
    }
    public String getAfterMdFive() {
        return this.afterMdFive;
    }

    public HardeningTaskResponse setAfterSize(Long afterSize) {
        this.afterSize = afterSize;
        return this;
    }
    public Long getAfterSize() {
        return this.afterSize;
    }

}
