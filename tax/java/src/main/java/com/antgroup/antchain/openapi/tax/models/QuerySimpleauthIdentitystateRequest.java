// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QuerySimpleauthIdentitystateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 纳税人识别号
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 租户号
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 请求id
    @NameInMap("biz_unique_id")
    @Validation(required = true)
    public String bizUniqueId;

    // 产品类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 授权编码
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    // 纳税人名称
    @NameInMap("nsrsmc")
    @Validation(required = true)
    public String nsrsmc;

    public static QuerySimpleauthIdentitystateRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySimpleauthIdentitystateRequest self = new QuerySimpleauthIdentitystateRequest();
        return TeaModel.build(map, self);
    }

    public QuerySimpleauthIdentitystateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySimpleauthIdentitystateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySimpleauthIdentitystateRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public QuerySimpleauthIdentitystateRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public QuerySimpleauthIdentitystateRequest setBizUniqueId(String bizUniqueId) {
        this.bizUniqueId = bizUniqueId;
        return this;
    }
    public String getBizUniqueId() {
        return this.bizUniqueId;
    }

    public QuerySimpleauthIdentitystateRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QuerySimpleauthIdentitystateRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public QuerySimpleauthIdentitystateRequest setNsrsmc(String nsrsmc) {
        this.nsrsmc = nsrsmc;
        return this;
    }
    public String getNsrsmc() {
        return this.nsrsmc;
    }

}
