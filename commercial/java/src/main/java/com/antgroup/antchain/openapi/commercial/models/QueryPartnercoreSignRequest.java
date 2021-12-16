// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryPartnercoreSignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 合同id
    @NameInMap("agreement_id")
    @Validation(required = true)
    public String agreementId;

    public static QueryPartnercoreSignRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPartnercoreSignRequest self = new QueryPartnercoreSignRequest();
        return TeaModel.build(map, self);
    }

    public QueryPartnercoreSignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPartnercoreSignRequest setAgreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }
    public String getAgreementId() {
        return this.agreementId;
    }

}
