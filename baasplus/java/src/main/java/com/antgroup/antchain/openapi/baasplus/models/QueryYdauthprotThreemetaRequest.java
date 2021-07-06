// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryYdauthprotThreemetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被核验用户的身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 被核验用户的手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 被核验用户姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static QueryYdauthprotThreemetaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryYdauthprotThreemetaRequest self = new QueryYdauthprotThreemetaRequest();
        return TeaModel.build(map, self);
    }

    public QueryYdauthprotThreemetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryYdauthprotThreemetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryYdauthprotThreemetaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryYdauthprotThreemetaRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryYdauthprotThreemetaRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
