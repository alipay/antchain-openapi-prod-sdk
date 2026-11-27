// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QuerySilentauthRealnameRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实名认证流程ID（实名认证接口返回值）
    @NameInMap("auth_flow_id")
    @Validation(required = true)
    public String authFlowId;

    public static QuerySilentauthRealnameRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySilentauthRealnameRequest self = new QuerySilentauthRealnameRequest();
        return TeaModel.build(map, self);
    }

    public QuerySilentauthRealnameRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySilentauthRealnameRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySilentauthRealnameRequest setAuthFlowId(String authFlowId) {
        this.authFlowId = authFlowId;
        return this;
    }
    public String getAuthFlowId() {
        return this.authFlowId;
    }

}
