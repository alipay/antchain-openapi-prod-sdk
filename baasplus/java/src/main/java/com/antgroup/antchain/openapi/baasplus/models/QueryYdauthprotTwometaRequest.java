// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryYdauthprotTwometaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被核验用户的身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 被核验用户的姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static QueryYdauthprotTwometaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryYdauthprotTwometaRequest self = new QueryYdauthprotTwometaRequest();
        return TeaModel.build(map, self);
    }

    public QueryYdauthprotTwometaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryYdauthprotTwometaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryYdauthprotTwometaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryYdauthprotTwometaRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
