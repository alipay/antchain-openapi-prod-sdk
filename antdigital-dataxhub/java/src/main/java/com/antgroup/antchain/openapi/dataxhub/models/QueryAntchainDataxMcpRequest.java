// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dataxhub.models;

import com.aliyun.tea.*;

public class QueryAntchainDataxMcpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // toolId
    @NameInMap("tool_id")
    @Validation(required = true)
    public String toolId;

    // 统一入参
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    public static QueryAntchainDataxMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDataxMcpRequest self = new QueryAntchainDataxMcpRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDataxMcpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDataxMcpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDataxMcpRequest setToolId(String toolId) {
        this.toolId = toolId;
        return this;
    }
    public String getToolId() {
        return this.toolId;
    }

    public QueryAntchainDataxMcpRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
