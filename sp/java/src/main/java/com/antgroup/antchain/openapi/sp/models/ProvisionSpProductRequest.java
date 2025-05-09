// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class ProvisionSpProductRequest extends TeaModel {
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

    // 购买产品的租户
    @NameInMap("tenant")
    @Validation(required = true, maxLength = 8, minLength = 8)
    public String tenant;

    // 产品实例Id
    @NameInMap("instance_ids")
    @Validation(required = true)
    public java.util.List<String> instanceIds;

    // 具体规格配置信息（JSON格式）会按照key进行排序
    @NameInMap("specification")
    @Validation(required = true)
    public String specification;

    // 部分产品创建时需要非生产规格的数据（JSON格式） 比如：ECS生产需要账号、密码等 会按照key进行排序
    @NameInMap("custom_data")
    public String customData;

    // 实例需要创建到租户的环境信息
    @NameInMap("workspace")
    public String workspace;

    // 实例需要创建到租户的地域
    @NameInMap("region")
    public String region;

    // 实例需要创建到租户的机房，可以有多个（冗灾场景）
    @NameInMap("zones")
    public java.util.List<String> zones;

    // 购买产品的租户ID，格式为2088XXXXXXXXXXXX	
    @NameInMap("tenant_id")
    @Validation(required = true, maxLength = 16, minLength = 16)
    public String tenantId;

    // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
    @NameInMap("access_code")
    @Validation(required = true, maxLength = 24, minLength = 3)
    public String accessCode;

    // 商业业务信息，如签约的项目ID、合同ID、合作伙伴ID等信息
    @NameInMap("business_data")
    public String businessData;

    public static ProvisionSpProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ProvisionSpProductRequest self = new ProvisionSpProductRequest();
        return TeaModel.build(map, self);
    }

    public ProvisionSpProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ProvisionSpProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ProvisionSpProductRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public ProvisionSpProductRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ProvisionSpProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ProvisionSpProductRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ProvisionSpProductRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ProvisionSpProductRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public ProvisionSpProductRequest setCustomData(String customData) {
        this.customData = customData;
        return this;
    }
    public String getCustomData() {
        return this.customData;
    }

    public ProvisionSpProductRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ProvisionSpProductRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ProvisionSpProductRequest setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

    public ProvisionSpProductRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ProvisionSpProductRequest setAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }
    public String getAccessCode() {
        return this.accessCode;
    }

    public ProvisionSpProductRequest setBusinessData(String businessData) {
        this.businessData = businessData;
        return this;
    }
    public String getBusinessData() {
        return this.businessData;
    }

}
