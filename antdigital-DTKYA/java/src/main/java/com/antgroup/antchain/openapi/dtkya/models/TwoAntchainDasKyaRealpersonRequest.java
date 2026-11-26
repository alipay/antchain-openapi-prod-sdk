// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class TwoAntchainDasKyaRealpersonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方业务请求号，重试时沿用
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 个人身份证件姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 个人身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    public static TwoAntchainDasKyaRealpersonRequest build(java.util.Map<String, ?> map) throws Exception {
        TwoAntchainDasKyaRealpersonRequest self = new TwoAntchainDasKyaRealpersonRequest();
        return TeaModel.build(map, self);
    }

    public TwoAntchainDasKyaRealpersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TwoAntchainDasKyaRealpersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TwoAntchainDasKyaRealpersonRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TwoAntchainDasKyaRealpersonRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public TwoAntchainDasKyaRealpersonRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

}
