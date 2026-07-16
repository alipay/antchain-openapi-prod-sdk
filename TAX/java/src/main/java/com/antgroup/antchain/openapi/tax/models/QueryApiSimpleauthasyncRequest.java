// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryApiSimpleauthasyncRequest extends TeaModel {
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

    // 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 行方生成的授权编号
    // 
    @NameInMap("auth_code")
    public String authCode;

    // 机构id
    @NameInMap("institute_id")
    public String instituteId;

    public static QueryApiSimpleauthasyncRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiSimpleauthasyncRequest self = new QueryApiSimpleauthasyncRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiSimpleauthasyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiSimpleauthasyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiSimpleauthasyncRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public QueryApiSimpleauthasyncRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public QueryApiSimpleauthasyncRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public QueryApiSimpleauthasyncRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QueryApiSimpleauthasyncRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public QueryApiSimpleauthasyncRequest setInstituteId(String instituteId) {
        this.instituteId = instituteId;
        return this;
    }
    public String getInstituteId() {
        return this.instituteId;
    }

}
