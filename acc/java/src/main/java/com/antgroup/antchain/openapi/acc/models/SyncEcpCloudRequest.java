// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class SyncEcpCloudRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api_code
    @NameInMap("api_code")
    @Validation(required = true)
    public String apiCode;

    // param_map_json
    @NameInMap("param_map_json")
    @Validation(required = true)
    public String paramMapJson;

    public static SyncEcpCloudRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncEcpCloudRequest self = new SyncEcpCloudRequest();
        return TeaModel.build(map, self);
    }

    public SyncEcpCloudRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncEcpCloudRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncEcpCloudRequest setApiCode(String apiCode) {
        this.apiCode = apiCode;
        return this;
    }
    public String getApiCode() {
        return this.apiCode;
    }

    public SyncEcpCloudRequest setParamMapJson(String paramMapJson) {
        this.paramMapJson = paramMapJson;
        return this;
    }
    public String getParamMapJson() {
        return this.paramMapJson;
    }

}
