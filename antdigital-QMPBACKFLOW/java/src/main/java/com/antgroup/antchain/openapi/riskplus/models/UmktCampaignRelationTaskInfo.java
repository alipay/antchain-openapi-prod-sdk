// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UmktCampaignRelationTaskInfo extends TeaModel {
    // 关联资源id
    /**
     * <strong>example:</strong>
     * <p>bizCode1</p>
     */
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 任务状态
    // WFE-待执行
    // D - 已完成
    // ECN - 执行中
    // C - 取消
    // F - 执行失败
    /**
     * <strong>example:</strong>
     * <p>D</p>
     */
    @NameInMap("task_status")
    @Validation(required = true)
    public String taskStatus;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>odps2oss执行失败</p>
     */
    @NameInMap("err_msg")
    @Validation(required = true)
    public String errMsg;

    public static UmktCampaignRelationTaskInfo build(java.util.Map<String, ?> map) throws Exception {
        UmktCampaignRelationTaskInfo self = new UmktCampaignRelationTaskInfo();
        return TeaModel.build(map, self);
    }

    public UmktCampaignRelationTaskInfo setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UmktCampaignRelationTaskInfo setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public UmktCampaignRelationTaskInfo setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

}
