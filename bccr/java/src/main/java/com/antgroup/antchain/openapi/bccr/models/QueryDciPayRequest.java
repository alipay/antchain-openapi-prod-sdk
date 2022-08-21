// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciPayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // dci用户id
    @NameInMap("dci_user_id")
    @Validation(required = true)
    public String dciUserId;

    // dci内容id
    @NameInMap("dci_content_id")
    @Validation(required = true)
    public String dciContentId;

    public static QueryDciPayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDciPayRequest self = new QueryDciPayRequest();
        return TeaModel.build(map, self);
    }

    public QueryDciPayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDciPayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDciPayRequest setDciUserId(String dciUserId) {
        this.dciUserId = dciUserId;
        return this;
    }
    public String getDciUserId() {
        return this.dciUserId;
    }

    public QueryDciPayRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

}
