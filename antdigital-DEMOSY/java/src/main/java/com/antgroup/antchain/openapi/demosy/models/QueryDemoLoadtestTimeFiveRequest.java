// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosy.models;

import com.aliyun.tea.*;

public class QueryDemoLoadtestTimeFiveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    // 2
    @NameInMap("idcard")
    public CardInfo idcard;

    public static QueryDemoLoadtestTimeFiveRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoLoadtestTimeFiveRequest self = new QueryDemoLoadtestTimeFiveRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoLoadtestTimeFiveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoLoadtestTimeFiveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoLoadtestTimeFiveRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public QueryDemoLoadtestTimeFiveRequest setIdcard(CardInfo idcard) {
        this.idcard = idcard;
        return this;
    }
    public CardInfo getIdcard() {
        return this.idcard;
    }

}
