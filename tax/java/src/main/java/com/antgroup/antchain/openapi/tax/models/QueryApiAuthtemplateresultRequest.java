// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryApiAuthtemplateresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务授权订单号 用户幂等控制，调用方保证唯一
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 身份ID
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    public static QueryApiAuthtemplateresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiAuthtemplateresultRequest self = new QueryApiAuthtemplateresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiAuthtemplateresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiAuthtemplateresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiAuthtemplateresultRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryApiAuthtemplateresultRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

}
