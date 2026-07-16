// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class MatchIcmSimpleauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 纳税人识别号
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 用于幂等控制
    @NameInMap("biz_request_id")
    @Validation(required = true)
    public String bizRequestId;

    // 产品类型
    @NameInMap("auth_type")
    public String authType;

    // 授权编号
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    // 请求模式，queryMode=0，与异步接口的轮询逻辑保持一致;queryMode=1， 与同步接口的调度逻辑保持一致
    @NameInMap("query_mode")
    public Long queryMode;

    public static MatchIcmSimpleauthRequest build(java.util.Map<String, ?> map) throws Exception {
        MatchIcmSimpleauthRequest self = new MatchIcmSimpleauthRequest();
        return TeaModel.build(map, self);
    }

    public MatchIcmSimpleauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MatchIcmSimpleauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MatchIcmSimpleauthRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public MatchIcmSimpleauthRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public MatchIcmSimpleauthRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public MatchIcmSimpleauthRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public MatchIcmSimpleauthRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public MatchIcmSimpleauthRequest setQueryMode(Long queryMode) {
        this.queryMode = queryMode;
        return this;
    }
    public Long getQueryMode() {
        return this.queryMode;
    }

}
