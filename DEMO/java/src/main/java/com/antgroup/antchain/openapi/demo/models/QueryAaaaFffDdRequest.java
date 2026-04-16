// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAaaaFffDdRequest extends TeaModel {
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

    public static QueryAaaaFffDdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAaaaFffDdRequest self = new QueryAaaaFffDdRequest();
        return TeaModel.build(map, self);
    }

    public QueryAaaaFffDdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAaaaFffDdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAaaaFffDdRequest setXxx(String xxx) {
        this.xxx = xxx;
        return this;
    }
    public String getXxx() {
        return this.xxx;
    }

    public QueryAaaaFffDdRequest setYyy(String yyy) {
        this.yyy = yyy;
        return this;
    }
    public String getYyy() {
        return this.yyy;
    }

}
