// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DeleteAccountEsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 三方账号id
    @NameInMap("third_party_user_id")
    @Validation(required = true)
    public String thirdPartyUserId;

    // 用户类型 ORGANIZATION-机构 PERSON
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    public static DeleteAccountEsignRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountEsignRequest self = new DeleteAccountEsignRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccountEsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAccountEsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteAccountEsignRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public DeleteAccountEsignRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
