// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class QueryFlowinstanceStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  
    @NameInMap("config")
    @Validation(required = true)
    public FlowInstanceLocator config;

    //  
    @NameInMap("extra")
    public String extra;

    public static QueryFlowinstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowinstanceStatusRequest self = new QueryFlowinstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryFlowinstanceStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFlowinstanceStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFlowinstanceStatusRequest setConfig(FlowInstanceLocator config) {
        this.config = config;
        return this;
    }
    public FlowInstanceLocator getConfig() {
        return this.config;
    }

    public QueryFlowinstanceStatusRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
