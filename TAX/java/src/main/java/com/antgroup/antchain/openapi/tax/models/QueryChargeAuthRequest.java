// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryChargeAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户
    @NameInMap("biz_tenant")
    @Validation(required = true)
    public String bizTenant;

    // 授权类型,业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    public static QueryChargeAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChargeAuthRequest self = new QueryChargeAuthRequest();
        return TeaModel.build(map, self);
    }

    public QueryChargeAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChargeAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChargeAuthRequest setBizTenant(String bizTenant) {
        this.bizTenant = bizTenant;
        return this;
    }
    public String getBizTenant() {
        return this.bizTenant;
    }

    public QueryChargeAuthRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
