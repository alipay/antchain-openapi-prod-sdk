// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class QueryAntchainDemosdkTumRequest extends TeaModel {
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

    public static QueryAntchainDemosdkTumRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDemosdkTumRequest self = new QueryAntchainDemosdkTumRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDemosdkTumRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDemosdkTumRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDemosdkTumRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAntchainDemosdkTumRequest setTestBean(SumBean testBean) {
        this.testBean = testBean;
        return this;
    }
    public SumBean getTestBean() {
        return this.testBean;
    }

}
