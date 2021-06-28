// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class ConfirmCpfDatauseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 验证端ID
    @NameInMap("terminal_identity")
    @Validation(required = true)
    public String terminalIdentity;

    // 数据hash
    @NameInMap("data_hash")
    @Validation(required = true)
    public String dataHash;

    public static ConfirmCpfDatauseRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmCpfDatauseRequest self = new ConfirmCpfDatauseRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmCpfDatauseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmCpfDatauseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmCpfDatauseRequest setTerminalIdentity(String terminalIdentity) {
        this.terminalIdentity = terminalIdentity;
        return this;
    }
    public String getTerminalIdentity() {
        return this.terminalIdentity;
    }

    public ConfirmCpfDatauseRequest setDataHash(String dataHash) {
        this.dataHash = dataHash;
        return this;
    }
    public String getDataHash() {
        return this.dataHash;
    }

}
