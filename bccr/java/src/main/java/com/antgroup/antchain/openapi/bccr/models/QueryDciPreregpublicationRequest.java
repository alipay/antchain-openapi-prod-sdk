// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciPreregpublicationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 作品id
    @NameInMap("dci_content_id")
    @Validation(required = true)
    public String dciContentId;

    public static QueryDciPreregpublicationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDciPreregpublicationRequest self = new QueryDciPreregpublicationRequest();
        return TeaModel.build(map, self);
    }

    public QueryDciPreregpublicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDciPreregpublicationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDciPreregpublicationRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

}
