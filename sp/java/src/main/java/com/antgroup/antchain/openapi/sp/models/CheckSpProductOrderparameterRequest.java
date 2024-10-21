// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class CheckSpProductOrderparameterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 加载业务的场景。具体内容同产品方定义，但产品下需保证唯一。
    @NameInMap("business_action")
    @Validation(required = true)
    public String businessAction;

    // 用于加载对应场景数据的上下文（JSON格式具体同产品方定义）
    @NameInMap("business_context")
    @Validation(required = true)
    public String businessContext;

    // 业务流水号。
    @NameInMap("order_no")
    public String orderNo;

    // 商品的渠道产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 地域。支持不同地域显示不同内容。
    @NameInMap("region")
    public String region;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 需要校验的数据
    @NameInMap("input")
    @Validation(required = true)
    public String input;

    public static CheckSpProductOrderparameterRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSpProductOrderparameterRequest self = new CheckSpProductOrderparameterRequest();
        return TeaModel.build(map, self);
    }

    public CheckSpProductOrderparameterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckSpProductOrderparameterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckSpProductOrderparameterRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public CheckSpProductOrderparameterRequest setBusinessAction(String businessAction) {
        this.businessAction = businessAction;
        return this;
    }
    public String getBusinessAction() {
        return this.businessAction;
    }

    public CheckSpProductOrderparameterRequest setBusinessContext(String businessContext) {
        this.businessContext = businessContext;
        return this;
    }
    public String getBusinessContext() {
        return this.businessContext;
    }

    public CheckSpProductOrderparameterRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public CheckSpProductOrderparameterRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CheckSpProductOrderparameterRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CheckSpProductOrderparameterRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CheckSpProductOrderparameterRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

}
