// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SidecarOperationTask extends TeaModel {
    // 业务流水号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 名称
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // sidecar运维内容上下文信息
    @NameInMap("context")
    @Validation(required = true)
    public SidecarOperationTaskContext context;

    public static SidecarOperationTask build(java.util.Map<String, ?> map) throws Exception {
        SidecarOperationTask self = new SidecarOperationTask();
        return TeaModel.build(map, self);
    }

    public SidecarOperationTask setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SidecarOperationTask setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SidecarOperationTask setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SidecarOperationTask setContext(SidecarOperationTaskContext context) {
        this.context = context;
        return this;
    }
    public SidecarOperationTaskContext getContext() {
        return this.context;
    }

}
