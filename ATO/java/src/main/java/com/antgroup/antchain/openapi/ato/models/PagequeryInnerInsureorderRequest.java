// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerInsureorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    // (商家后台接口特有)
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商家订单ID
    @NameInMap("order_id")
    public String orderId;

    // 分页查询对象
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    // 保司信息merchant_id
    @NameInMap("insure_merchant_id")
    @Validation(required = true)
    public String insureMerchantId;

    // 投保状态枚举
    @NameInMap("status")
    public String status;

    public static PagequeryInnerInsureorderRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerInsureorderRequest self = new PagequeryInnerInsureorderRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerInsureorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerInsureorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerInsureorderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerInsureorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PagequeryInnerInsureorderRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public PagequeryInnerInsureorderRequest setInsureMerchantId(String insureMerchantId) {
        this.insureMerchantId = insureMerchantId;
        return this;
    }
    public String getInsureMerchantId() {
        return this.insureMerchantId;
    }

    public PagequeryInnerInsureorderRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
