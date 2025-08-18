// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class QueryAntchainDemosdkCcXxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // aa
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 测试
    @NameInMap("msg")
    @Validation(required = true)
    public ResultTest msg;

    public static QueryAntchainDemosdkCcXxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDemosdkCcXxRequest self = new QueryAntchainDemosdkCcXxRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDemosdkCcXxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDemosdkCcXxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDemosdkCcXxRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAntchainDemosdkCcXxRequest setMsg(ResultTest msg) {
        this.msg = msg;
        return this;
    }
    public ResultTest getMsg() {
        return this.msg;
    }

}
