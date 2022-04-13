// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OpsPrePostTask extends TeaModel {
    // 
    //           任务类型。
    //           中间件任务：
    //           MESSAGE_BROKER_TOPIC：消息中间件TOPIC；
    //           MESSAGE_BROKER_TOPIC_SUB：消息中间件绑定关系；
    //           DRM_RESOURCE：DRM资源；
    //           SCHEDULER_TASK：定时任务；
    //           其他类型任务待定。
    //         
    @NameInMap("type")
    public String type;

    // 
    //           操作类型。取值列表：
    //           CREATE：新建；
    //           UPDATE：更新；
    //           DELETE：删除；
    //           UNDEFINED：未定义；
    //         
    @NameInMap("operation_type")
    public String operationType;

    // 
    //           任务详情，JSON字符串
    //         
    @NameInMap("detail")
    public String detail;

    // 
    //           任务状态。取值列表：EXECUTING：执行中；SUCCEEDED：执行成功；FAILED：执行失败；IGNORED：已忽略
    //         
    @NameInMap("status")
    public String status;

    public static OpsPrePostTask build(java.util.Map<String, ?> map) throws Exception {
        OpsPrePostTask self = new OpsPrePostTask();
        return TeaModel.build(map, self);
    }

    public OpsPrePostTask setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OpsPrePostTask setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public OpsPrePostTask setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public OpsPrePostTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
