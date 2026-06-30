// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRpgwUserSignurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业标识，固定值
    @NameInMap("company_code")
    @Validation(required = true)
    public String companyCode;

    // 调用方平台用户id
    @NameInMap("platform_user_identification")
    @Validation(required = true)
    public String platformUserIdentification;

    // 手机号
    @NameInMap("user_code")
    @Validation(required = true)
    public String userCode;

    public static QueryRpgwUserSignurlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRpgwUserSignurlRequest self = new QueryRpgwUserSignurlRequest();
        return TeaModel.build(map, self);
    }

    public QueryRpgwUserSignurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRpgwUserSignurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRpgwUserSignurlRequest setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }
    public String getCompanyCode() {
        return this.companyCode;
    }

    public QueryRpgwUserSignurlRequest setPlatformUserIdentification(String platformUserIdentification) {
        this.platformUserIdentification = platformUserIdentification;
        return this;
    }
    public String getPlatformUserIdentification() {
        return this.platformUserIdentification;
    }

    public QueryRpgwUserSignurlRequest setUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }
    public String getUserCode() {
        return this.userCode;
    }

}
