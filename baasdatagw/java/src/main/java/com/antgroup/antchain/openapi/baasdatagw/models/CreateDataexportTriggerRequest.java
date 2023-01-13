// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class CreateDataexportTriggerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户唯一标识符（租户ID）
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 链唯一标识符
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 导出任务
    @NameInMap("trigger")
    @Validation(required = true)
    public Trigger trigger;

    public static CreateDataexportTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataexportTriggerRequest self = new CreateDataexportTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataexportTriggerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataexportTriggerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataexportTriggerRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateDataexportTriggerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateDataexportTriggerRequest setTrigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public Trigger getTrigger() {
        return this.trigger;
    }

}
