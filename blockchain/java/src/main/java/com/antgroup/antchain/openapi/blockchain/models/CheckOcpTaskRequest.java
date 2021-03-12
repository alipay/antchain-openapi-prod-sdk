// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CheckOcpTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 事件类型：开通（AF_OPEN）、变更（AF_MODIFY）、释放（AF_RELEASE）、创建（AF_PROVISION）、停止（AF_STOP）、恢复（AF_RESUME）等。
    @NameInMap("event")
    @Validation(required = true)
    public String event;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 请求平台来源
    @NameInMap("platform")
    @Validation(required = true)
    public String platform;

    // 产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static CheckOcpTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckOcpTaskRequest self = new CheckOcpTaskRequest();
        return TeaModel.build(map, self);
    }

    public CheckOcpTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckOcpTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckOcpTaskRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public CheckOcpTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CheckOcpTaskRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CheckOcpTaskRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CheckOcpTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
