// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class QueryGatewayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询输入
    // 
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 结构体参数
    @NameInMap("param")
    @Validation(required = true)
    public AbcDemoStruct param;

    public static QueryGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayRequest self = new QueryGatewayRequest();
        return TeaModel.build(map, self);
    }

    public QueryGatewayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGatewayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGatewayRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryGatewayRequest setParam(AbcDemoStruct param) {
        this.param = param;
        return this;
    }
    public AbcDemoStruct getParam() {
        return this.param;
    }

}
