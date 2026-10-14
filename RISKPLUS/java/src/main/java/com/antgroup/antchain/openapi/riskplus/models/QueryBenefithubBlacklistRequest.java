// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryBenefithubBlacklistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流量平台编码
    @NameInMap("platform_code")
    @Validation(required = true)
    public String platformCode;

    // 流量平台用户唯一id
    @NameInMap("user_unique_id")
    @Validation(required = true)
    public String userUniqueId;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 身份证号
    @NameInMap("cert_no")
    public String certNo;

    public static QueryBenefithubBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBenefithubBlacklistRequest self = new QueryBenefithubBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public QueryBenefithubBlacklistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBenefithubBlacklistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBenefithubBlacklistRequest setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
        return this;
    }
    public String getPlatformCode() {
        return this.platformCode;
    }

    public QueryBenefithubBlacklistRequest setUserUniqueId(String userUniqueId) {
        this.userUniqueId = userUniqueId;
        return this;
    }
    public String getUserUniqueId() {
        return this.userUniqueId;
    }

    public QueryBenefithubBlacklistRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryBenefithubBlacklistRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

}
