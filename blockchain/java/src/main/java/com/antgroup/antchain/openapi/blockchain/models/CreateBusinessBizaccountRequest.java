// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessBizaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链对应的bizId
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 申请者对应的did账户
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    public static CreateBusinessBizaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessBizaccountRequest self = new CreateBusinessBizaccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessBizaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBusinessBizaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBusinessBizaccountRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBusinessBizaccountRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
