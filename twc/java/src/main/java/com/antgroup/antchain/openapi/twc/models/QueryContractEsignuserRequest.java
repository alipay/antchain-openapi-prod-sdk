// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractEsignuserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 三方用户id
    @NameInMap("third_party_user_id")
    @Validation(required = true)
    public String thirdPartyUserId;

    public static QueryContractEsignuserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractEsignuserRequest self = new QueryContractEsignuserRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractEsignuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractEsignuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractEsignuserRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
