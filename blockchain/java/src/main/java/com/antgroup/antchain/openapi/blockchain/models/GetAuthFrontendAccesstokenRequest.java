// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetAuthFrontendAccesstokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 用户did
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    public static GetAuthFrontendAccesstokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthFrontendAccesstokenRequest self = new GetAuthFrontendAccesstokenRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthFrontendAccesstokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAuthFrontendAccesstokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAuthFrontendAccesstokenRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetAuthFrontendAccesstokenRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

}
