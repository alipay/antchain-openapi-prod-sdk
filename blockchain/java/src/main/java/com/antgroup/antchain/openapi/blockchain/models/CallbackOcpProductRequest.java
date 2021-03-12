// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CallbackOcpProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务状态变更，是否成功；
    @NameInMap("downstatus")
    @Validation(required = true)
    public Boolean downstatus;

    // 事件类型：开通、变更、释放、创建、停止、恢复等
    @NameInMap("event")
    @Validation(required = true)
    public String event;

    // 产品实例Id列
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 产品码 全局唯一
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static CallbackOcpProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackOcpProductRequest self = new CallbackOcpProductRequest();
        return TeaModel.build(map, self);
    }

    public CallbackOcpProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackOcpProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackOcpProductRequest setDownstatus(Boolean downstatus) {
        this.downstatus = downstatus;
        return this;
    }
    public Boolean getDownstatus() {
        return this.downstatus;
    }

    public CallbackOcpProductRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public CallbackOcpProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CallbackOcpProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CallbackOcpProductRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
