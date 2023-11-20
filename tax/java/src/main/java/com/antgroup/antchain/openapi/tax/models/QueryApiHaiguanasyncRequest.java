// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryApiHaiguanasyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 产品类型，海关数据: ZX500
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 身份id，企业税号
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 用于幂等控制
    @NameInMap("biz_request_id")
    @Validation(required = true)
    public String bizRequestId;

    // 行方生成的授权编号
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    // 公网可访问的地址，PDF格式
    @NameInMap("auth_url")
    @Validation(required = true)
    public String authUrl;

    // 格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("auth_start_time")
    @Validation(required = true)
    public String authStartTime;

    // 格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("auth_end_time")
    @Validation(required = true)
    public String authEndTime;

    // 企业名称
    @NameInMap("corp_name")
    public String corpName;

    public static QueryApiHaiguanasyncRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiHaiguanasyncRequest self = new QueryApiHaiguanasyncRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiHaiguanasyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiHaiguanasyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiHaiguanasyncRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public QueryApiHaiguanasyncRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QueryApiHaiguanasyncRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public QueryApiHaiguanasyncRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public QueryApiHaiguanasyncRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public QueryApiHaiguanasyncRequest setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
        return this;
    }
    public String getAuthUrl() {
        return this.authUrl;
    }

    public QueryApiHaiguanasyncRequest setAuthStartTime(String authStartTime) {
        this.authStartTime = authStartTime;
        return this;
    }
    public String getAuthStartTime() {
        return this.authStartTime;
    }

    public QueryApiHaiguanasyncRequest setAuthEndTime(String authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public String getAuthEndTime() {
        return this.authEndTime;
    }

    public QueryApiHaiguanasyncRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
