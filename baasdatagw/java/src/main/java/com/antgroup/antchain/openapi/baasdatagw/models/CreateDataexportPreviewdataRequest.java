// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class CreateDataexportPreviewdataRequest extends TeaModel {
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

    // 任务配置
    @NameInMap("trigger")
    @Validation(required = true)
    public Trigger trigger;

    public static CreateDataexportPreviewdataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataexportPreviewdataRequest self = new CreateDataexportPreviewdataRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataexportPreviewdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataexportPreviewdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataexportPreviewdataRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateDataexportPreviewdataRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateDataexportPreviewdataRequest setTrigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public Trigger getTrigger() {
        return this.trigger;
    }

}
