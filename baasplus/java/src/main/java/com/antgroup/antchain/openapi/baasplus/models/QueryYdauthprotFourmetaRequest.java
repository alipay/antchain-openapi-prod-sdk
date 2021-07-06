// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryYdauthprotFourmetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被核验用户的银行卡号
    @NameInMap("card_no")
    @Validation(required = true)
    public String cardNo;

    // 被核验用户的身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 被核验用户的手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 被核验用户的姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static QueryYdauthprotFourmetaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryYdauthprotFourmetaRequest self = new QueryYdauthprotFourmetaRequest();
        return TeaModel.build(map, self);
    }

    public QueryYdauthprotFourmetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryYdauthprotFourmetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryYdauthprotFourmetaRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryYdauthprotFourmetaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryYdauthprotFourmetaRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryYdauthprotFourmetaRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
