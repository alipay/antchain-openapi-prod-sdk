// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryApiSimpleauthstandardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 纳税人识别号
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 用于幂等控制
    @NameInMap("biz_request_id")
    @Validation(required = true)
    public String bizRequestId;

    // 该请求最终发起方(金融机构)的租户号，若是征信通道模式，则是征信机构终端客户的租户号，该租户号由我方分配。
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 产品类型；
    // 发票数据：301；税务数据：302；发票及税务数据：303； (通过征信机构链接时请在数字前加“ZX”，如：ZX301)
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 是指行方生成的授权编号
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    public static QueryApiSimpleauthstandardRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiSimpleauthstandardRequest self = new QueryApiSimpleauthstandardRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiSimpleauthstandardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiSimpleauthstandardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiSimpleauthstandardRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public QueryApiSimpleauthstandardRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public QueryApiSimpleauthstandardRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public QueryApiSimpleauthstandardRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QueryApiSimpleauthstandardRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

}
