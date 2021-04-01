// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecOcpTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    // 订单号码
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 请求平台来源
    @NameInMap("platform")
    @Validation(required = true)
    public String platform;

    // 产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 产品规格
    @NameInMap("specification")
    @Validation(required = true)
    public String specification;

    // 租户Id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static ExecOcpTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecOcpTaskRequest self = new ExecOcpTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecOcpTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecOcpTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecOcpTaskRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public ExecOcpTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecOcpTaskRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ExecOcpTaskRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ExecOcpTaskRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ExecOcpTaskRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public ExecOcpTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
