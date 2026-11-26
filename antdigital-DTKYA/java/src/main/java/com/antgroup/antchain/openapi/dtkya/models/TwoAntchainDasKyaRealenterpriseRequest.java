// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class TwoAntchainDasKyaRealenterpriseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方业务请求号，重试时沿用
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 企业登记名称
    @NameInMap("enterprise_name")
    @Validation(required = true)
    public String enterpriseName;

    // 企业登记证件号
    @NameInMap("enterprise_cert_no")
    @Validation(required = true)
    public String enterpriseCertNo;

    public static TwoAntchainDasKyaRealenterpriseRequest build(java.util.Map<String, ?> map) throws Exception {
        TwoAntchainDasKyaRealenterpriseRequest self = new TwoAntchainDasKyaRealenterpriseRequest();
        return TeaModel.build(map, self);
    }

    public TwoAntchainDasKyaRealenterpriseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TwoAntchainDasKyaRealenterpriseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TwoAntchainDasKyaRealenterpriseRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TwoAntchainDasKyaRealenterpriseRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public TwoAntchainDasKyaRealenterpriseRequest setEnterpriseCertNo(String enterpriseCertNo) {
        this.enterpriseCertNo = enterpriseCertNo;
        return this;
    }
    public String getEnterpriseCertNo() {
        return this.enterpriseCertNo;
    }

}
