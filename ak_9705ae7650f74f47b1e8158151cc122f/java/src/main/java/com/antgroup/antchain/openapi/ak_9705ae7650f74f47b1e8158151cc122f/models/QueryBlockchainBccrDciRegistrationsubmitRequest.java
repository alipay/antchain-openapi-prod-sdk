// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class QueryBlockchainBccrDciRegistrationsubmitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // dci内容id
    @NameInMap("dci_content_id")
    @Validation(required = true)
    public String dciContentId;

    public static QueryBlockchainBccrDciRegistrationsubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBccrDciRegistrationsubmitRequest self = new QueryBlockchainBccrDciRegistrationsubmitRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBccrDciRegistrationsubmitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBccrDciRegistrationsubmitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBccrDciRegistrationsubmitRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

}
