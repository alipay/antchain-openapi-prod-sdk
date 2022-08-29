// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6efc6591476e4813ac8f7c9b6359c0b7.models;

import com.aliyun.tea.*;

public class QueryDemoAaaaFffDdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // xxx
    @NameInMap("xxx")
    @Validation(required = true)
    public String xxx;

    // yyy
    @NameInMap("yyy")
    @Validation(required = true)
    public String yyy;

    public static QueryDemoAaaaFffDdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoAaaaFffDdRequest self = new QueryDemoAaaaFffDdRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoAaaaFffDdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoAaaaFffDdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoAaaaFffDdRequest setXxx(String xxx) {
        this.xxx = xxx;
        return this;
    }
    public String getXxx() {
        return this.xxx;
    }

    public QueryDemoAaaaFffDdRequest setYyy(String yyy) {
        this.yyy = yyy;
        return this;
    }
    public String getYyy() {
        return this.yyy;
    }

}
