// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OpenAcecContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 产品码，全局唯一
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 开通产品的租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 实例Id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 服务接入码
    @NameInMap("access_code")
    @Validation(required = true)
    public String accessCode;

    // 用户自定义数据
    @NameInMap("custom_data")
    public String customData;

    public static OpenAcecContractRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenAcecContractRequest self = new OpenAcecContractRequest();
        return TeaModel.build(map, self);
    }

    public OpenAcecContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenAcecContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenAcecContractRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public OpenAcecContractRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public OpenAcecContractRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenAcecContractRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OpenAcecContractRequest setAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }
    public String getAccessCode() {
        return this.accessCode;
    }

    public OpenAcecContractRequest setCustomData(String customData) {
        this.customData = customData;
        return this;
    }
    public String getCustomData() {
        return this.customData;
    }

}
