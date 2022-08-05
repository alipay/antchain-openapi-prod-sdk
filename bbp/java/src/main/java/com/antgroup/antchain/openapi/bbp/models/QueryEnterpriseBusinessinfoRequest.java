// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryEnterpriseBusinessinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业唯一编码
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    public static QueryEnterpriseBusinessinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseBusinessinfoRequest self = new QueryEnterpriseBusinessinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseBusinessinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEnterpriseBusinessinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEnterpriseBusinessinfoRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QueryEnterpriseBusinessinfoRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public QueryEnterpriseBusinessinfoRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

}
