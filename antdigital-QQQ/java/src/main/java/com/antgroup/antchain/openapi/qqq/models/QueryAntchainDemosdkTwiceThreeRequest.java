// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class QueryAntchainDemosdkTwiceThreeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间
    @NameInMap("timeout")
    public String timeout;

    // 11
    @NameInMap("aa")
    public DemoClass aa;

    public static QueryAntchainDemosdkTwiceThreeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDemosdkTwiceThreeRequest self = new QueryAntchainDemosdkTwiceThreeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDemosdkTwiceThreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDemosdkTwiceThreeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDemosdkTwiceThreeRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public QueryAntchainDemosdkTwiceThreeRequest setAa(DemoClass aa) {
        this.aa = aa;
        return this;
    }
    public DemoClass getAa() {
        return this.aa;
    }

}
