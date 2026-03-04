// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAasSaSaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // aa
    @NameInMap("not_blank_verify")
    @Validation(required = true)
    public String notBlankVerify;

    // 12344
    @NameInMap("idcard")
    public String idcard;

    public static QueryAasSaSaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAasSaSaRequest self = new QueryAasSaSaRequest();
        return TeaModel.build(map, self);
    }

    public QueryAasSaSaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAasSaSaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAasSaSaRequest setNotBlankVerify(String notBlankVerify) {
        this.notBlankVerify = notBlankVerify;
        return this;
    }
    public String getNotBlankVerify() {
        return this.notBlankVerify;
    }

    public QueryAasSaSaRequest setIdcard(String idcard) {
        this.idcard = idcard;
        return this;
    }
    public String getIdcard() {
        return this.idcard;
    }

}
