// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class QueryCpfUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 端ID
    @NameInMap("terminal_identity")
    @Validation(required = true)
    public String terminalIdentity;

    // 数据源ID
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // 用户身份证ID
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 用户姓名
    @NameInMap("data_owner_name")
    @Validation(required = true)
    public String dataOwnerName;

    // 证件类型
    @NameInMap("data_owner_identify_type")
    @Validation(required = true)
    public String dataOwnerIdentifyType;

    public static QueryCpfUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCpfUserRequest self = new QueryCpfUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryCpfUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCpfUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCpfUserRequest setTerminalIdentity(String terminalIdentity) {
        this.terminalIdentity = terminalIdentity;
        return this;
    }
    public String getTerminalIdentity() {
        return this.terminalIdentity;
    }

    public QueryCpfUserRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public QueryCpfUserRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public QueryCpfUserRequest setDataOwnerName(String dataOwnerName) {
        this.dataOwnerName = dataOwnerName;
        return this;
    }
    public String getDataOwnerName() {
        return this.dataOwnerName;
    }

    public QueryCpfUserRequest setDataOwnerIdentifyType(String dataOwnerIdentifyType) {
        this.dataOwnerIdentifyType = dataOwnerIdentifyType;
        return this;
    }
    public String getDataOwnerIdentifyType() {
        return this.dataOwnerIdentifyType;
    }

}
