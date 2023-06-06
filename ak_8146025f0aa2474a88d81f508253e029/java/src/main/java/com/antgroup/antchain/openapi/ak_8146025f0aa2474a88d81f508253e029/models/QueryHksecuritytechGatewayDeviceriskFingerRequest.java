// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_8146025f0aa2474a88d81f508253e029.models;

import com.aliyun.tea.*;

public class QueryHksecuritytechGatewayDeviceriskFingerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // apdid_token
    @NameInMap("apdid_token")
    @Validation(required = true)
    public String apdidToken;

    // client_id
    @NameInMap("client_id")
    public String clientId;

    public static QueryHksecuritytechGatewayDeviceriskFingerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHksecuritytechGatewayDeviceriskFingerRequest self = new QueryHksecuritytechGatewayDeviceriskFingerRequest();
        return TeaModel.build(map, self);
    }

    public QueryHksecuritytechGatewayDeviceriskFingerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryHksecuritytechGatewayDeviceriskFingerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryHksecuritytechGatewayDeviceriskFingerRequest setApdidToken(String apdidToken) {
        this.apdidToken = apdidToken;
        return this;
    }
    public String getApdidToken() {
        return this.apdidToken;
    }

    public QueryHksecuritytechGatewayDeviceriskFingerRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

}
