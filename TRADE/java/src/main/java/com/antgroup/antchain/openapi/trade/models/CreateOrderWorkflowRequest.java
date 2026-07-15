// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CreateOrderWorkflowRequest extends TeaModel {
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
    @Validation(required = true)
    public java.util.List<InstanceLabel> instanceLabels;

    public static CreateOrderWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderWorkflowRequest self = new CreateOrderWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderWorkflowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOrderWorkflowRequest setProductList(java.util.List<String> productList) {
        this.productList = productList;
        return this;
    }
    public java.util.List<String> getProductList() {
        return this.productList;
    }

    public CreateOrderWorkflowRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateOrderWorkflowRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CreateOrderWorkflowRequest setInstanceLabels(java.util.List<InstanceLabel> instanceLabels) {
        this.instanceLabels = instanceLabels;
        return this;
    }
    public java.util.List<InstanceLabel> getInstanceLabels() {
        return this.instanceLabels;
    }

}
