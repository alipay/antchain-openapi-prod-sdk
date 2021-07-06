// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEverifyTwometaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业证件号
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    public static QueryEverifyTwometaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEverifyTwometaRequest self = new QueryEverifyTwometaRequest();
        return TeaModel.build(map, self);
    }

    public QueryEverifyTwometaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEverifyTwometaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEverifyTwometaRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public QueryEverifyTwometaRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

}
