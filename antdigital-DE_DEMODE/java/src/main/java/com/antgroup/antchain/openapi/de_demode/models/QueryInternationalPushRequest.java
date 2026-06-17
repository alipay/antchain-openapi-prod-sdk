// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.de_demode.models;

import com.aliyun.tea.*;

public class QueryInternationalPushRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间
    @NameInMap("timeout")
    public String timeout;

    public static QueryInternationalPushRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInternationalPushRequest self = new QueryInternationalPushRequest();
        return TeaModel.build(map, self);
    }

    public QueryInternationalPushRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInternationalPushRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInternationalPushRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
