// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class QueryAaaCcdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("test")
    public String test;

    // 结构体字段
    @NameInMap("list_params_demosdk")
    public java.util.List<TestParamA> listParamsDemosdk;

    public static QueryAaaCcdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAaaCcdRequest self = new QueryAaaCcdRequest();
        return TeaModel.build(map, self);
    }

    public QueryAaaCcdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAaaCcdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAaaCcdRequest setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

    public QueryAaaCcdRequest setListParamsDemosdk(java.util.List<TestParamA> listParamsDemosdk) {
        this.listParamsDemosdk = listParamsDemosdk;
        return this;
    }
    public java.util.List<TestParamA> getListParamsDemosdk() {
        return this.listParamsDemosdk;
    }

}
