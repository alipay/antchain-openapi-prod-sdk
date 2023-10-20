// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryDeviceriskFingerRequest extends TeaModel {
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

    // terminal_type
    @NameInMap("terminal_type")
    public String terminalType;

    public static QueryDeviceriskFingerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceriskFingerRequest self = new QueryDeviceriskFingerRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceriskFingerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeviceriskFingerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDeviceriskFingerRequest setApdidToken(String apdidToken) {
        this.apdidToken = apdidToken;
        return this;
    }
    public String getApdidToken() {
        return this.apdidToken;
    }

    public QueryDeviceriskFingerRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryDeviceriskFingerRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
