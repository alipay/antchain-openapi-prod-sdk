// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CreateOrderAfterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 待开通类商品列表
    @NameInMap("product_list")
    @Validation(required = true)
    public java.util.List<String> productList;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 下单交易流水号，唯一
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 标签对象
    @NameInMap("instance_labels")
    public java.util.List<InstanceLabel> instanceLabels;

    public static CreateOrderAfterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderAfterRequest self = new CreateOrderAfterRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderAfterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOrderAfterRequest setProductList(java.util.List<String> productList) {
        this.productList = productList;
        return this;
    }
    public java.util.List<String> getProductList() {
        return this.productList;
    }

    public CreateOrderAfterRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateOrderAfterRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CreateOrderAfterRequest setInstanceLabels(java.util.List<InstanceLabel> instanceLabels) {
        this.instanceLabels = instanceLabels;
        return this;
    }
    public java.util.List<InstanceLabel> getInstanceLabels() {
        return this.instanceLabels;
    }

}
