// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class QueryBlockchainBccrDciPayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登申请id
    @NameInMap("digital_register_id")
    @Validation(required = true)
    public String digitalRegisterId;

    // 废弃待删除
    @NameInMap("dci_user_id")
    public String dciUserId;

    // 废弃待删除
    @NameInMap("dci_content_id")
    public String dciContentId;

    public static QueryBlockchainBccrDciPayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBccrDciPayRequest self = new QueryBlockchainBccrDciPayRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBccrDciPayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBccrDciPayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBccrDciPayRequest setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

    public QueryBlockchainBccrDciPayRequest setDciUserId(String dciUserId) {
        this.dciUserId = dciUserId;
        return this;
    }
    public String getDciUserId() {
        return this.dciUserId;
    }

    public QueryBlockchainBccrDciPayRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

}
