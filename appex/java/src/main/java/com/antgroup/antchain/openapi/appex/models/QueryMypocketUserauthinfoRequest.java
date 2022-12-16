// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QueryMypocketUserauthinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户授权信息
    @NameInMap("authorization")
    @Validation(required = true)
    public Authorization authorization;

    // 签名字符串
    @NameInMap("did_sign")
    @Validation(required = true)
    public String didSign;

    // 签名的用户did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    public static QueryMypocketUserauthinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMypocketUserauthinfoRequest self = new QueryMypocketUserauthinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryMypocketUserauthinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMypocketUserauthinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMypocketUserauthinfoRequest setAuthorization(Authorization authorization) {
        this.authorization = authorization;
        return this;
    }
    public Authorization getAuthorization() {
        return this.authorization;
    }

    public QueryMypocketUserauthinfoRequest setDidSign(String didSign) {
        this.didSign = didSign;
        return this;
    }
    public String getDidSign() {
        return this.didSign;
    }

    public QueryMypocketUserauthinfoRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
