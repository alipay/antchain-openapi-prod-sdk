// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class GetBlockchainBccrDciRegistrationcertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登申请id
    @NameInMap("digital_register_id")
    @Validation(required = true)
    public String digitalRegisterId;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 废弃待删除
    @NameInMap("dci_content_id")
    public String dciContentId;

    public static GetBlockchainBccrDciRegistrationcertRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBlockchainBccrDciRegistrationcertRequest self = new GetBlockchainBccrDciRegistrationcertRequest();
        return TeaModel.build(map, self);
    }

    public GetBlockchainBccrDciRegistrationcertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetBlockchainBccrDciRegistrationcertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetBlockchainBccrDciRegistrationcertRequest setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

    public GetBlockchainBccrDciRegistrationcertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetBlockchainBccrDciRegistrationcertRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

}
