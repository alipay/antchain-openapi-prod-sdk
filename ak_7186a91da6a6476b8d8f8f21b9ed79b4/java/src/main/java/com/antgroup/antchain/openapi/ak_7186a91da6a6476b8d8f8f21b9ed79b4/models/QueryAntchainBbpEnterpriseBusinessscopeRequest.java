// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7186a91da6a6476b8d8f8f21b9ed79b4.models;

import com.aliyun.tea.*;

public class QueryAntchainBbpEnterpriseBusinessscopeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业唯一编码
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    public static QueryAntchainBbpEnterpriseBusinessscopeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainBbpEnterpriseBusinessscopeRequest self = new QueryAntchainBbpEnterpriseBusinessscopeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainBbpEnterpriseBusinessscopeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainBbpEnterpriseBusinessscopeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainBbpEnterpriseBusinessscopeRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public QueryAntchainBbpEnterpriseBusinessscopeRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

}
