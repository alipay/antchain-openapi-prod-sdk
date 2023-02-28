// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class FinishTraceConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 私有化端配置成功标志
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 租户
    @NameInMap("privated_tenant")
    @Validation(required = true)
    public String privatedTenant;

    // 私有化端唯一标识
    @NameInMap("unique_num")
    @Validation(required = true)
    public String uniqueNum;

    // 任务信息，用于消费者回告
    @NameInMap("task_info")
    @Validation(required = true)
    public TaskInfo taskInfo;

    public static FinishTraceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishTraceConfigRequest self = new FinishTraceConfigRequest();
        return TeaModel.build(map, self);
    }

    public FinishTraceConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishTraceConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishTraceConfigRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FinishTraceConfigRequest setPrivatedTenant(String privatedTenant) {
        this.privatedTenant = privatedTenant;
        return this;
    }
    public String getPrivatedTenant() {
        return this.privatedTenant;
    }

    public FinishTraceConfigRequest setUniqueNum(String uniqueNum) {
        this.uniqueNum = uniqueNum;
        return this;
    }
    public String getUniqueNum() {
        return this.uniqueNum;
    }

    public FinishTraceConfigRequest setTaskInfo(TaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

}
