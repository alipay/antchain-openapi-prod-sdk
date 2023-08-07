// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEnterpriseBaseinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 0 为按照企业信用编码查询 1为按照企业名称查询
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 需要查询的企业关联信息
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static QueryEnterpriseBaseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseBaseinfoRequest self = new QueryEnterpriseBaseinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseBaseinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEnterpriseBaseinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEnterpriseBaseinfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryEnterpriseBaseinfoRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
