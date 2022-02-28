// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class OpenSpProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
    @NameInMap("order_no")
    @Validation(required = true, maxLength = 64, minLength = 32)
    public String orderNo;

    // 产品码 全局唯一
    @NameInMap("product_code")
    @Validation(required = true, maxLength = 20, minLength = 3)
    public String productCode;

    // 开通产品的租户
    @NameInMap("tenant")
    @Validation(required = true, maxLength = 8, minLength = 8)
    public String tenant;

    // 产品实例ID
    @NameInMap("instance_id")
    @Validation(required = true, maxLength = 50, minLength = 20)
    public String instanceId;

    // 支持透传给产品非生产规格的自定义数据（JSON格式并按key排序）
    @NameInMap("custom_data")
    public String customData;

    // 开通产品的租户ID，格式为2088XXXXXXXXXXXX
    @NameInMap("tenant_id")
    @Validation(required = true, maxLength = 16, minLength = 16)
    public String tenantId;

    // 服务接入码，产品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
    @NameInMap("access_code")
    @Validation(required = true, maxLength = 24, minLength = 3)
    public String accessCode;

    public static OpenSpProductRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenSpProductRequest self = new OpenSpProductRequest();
        return TeaModel.build(map, self);
    }

    public OpenSpProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenSpProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenSpProductRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public OpenSpProductRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public OpenSpProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public OpenSpProductRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public OpenSpProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OpenSpProductRequest setCustomData(String customData) {
        this.customData = customData;
        return this;
    }
    public String getCustomData() {
        return this.customData;
    }

    public OpenSpProductRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenSpProductRequest setAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }
    public String getAccessCode() {
        return this.accessCode;
    }

}
