// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class QueryTumRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 名称
    @NameInMap("name")
    public String name;

    // 测试bean
    @NameInMap("test_bean")
    public SumBean testBean;

    public static QueryTumRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTumRequest self = new QueryTumRequest();
        return TeaModel.build(map, self);
    }

    public QueryTumRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTumRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTumRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryTumRequest setTestBean(SumBean testBean) {
        this.testBean = testBean;
        return this;
    }
    public SumBean getTestBean() {
        return this.testBean;
    }

}
