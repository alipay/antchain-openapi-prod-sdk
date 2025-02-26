// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class FinishBlockchainBccrDciRegistrationcertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 登记号
    @NameInMap("reg_number")
    @Validation(required = true)
    public String regNumber;

    // 数登证书地址
    @NameInMap("certificate_url")
    public String certificateUrl;

    // 数登样本地址
    @NameInMap("sample_url")
    public String sampleUrl;

    // 客户端幂等token
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static FinishBlockchainBccrDciRegistrationcertRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishBlockchainBccrDciRegistrationcertRequest self = new FinishBlockchainBccrDciRegistrationcertRequest();
        return TeaModel.build(map, self);
    }

    public FinishBlockchainBccrDciRegistrationcertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishBlockchainBccrDciRegistrationcertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishBlockchainBccrDciRegistrationcertRequest setRegNumber(String regNumber) {
        this.regNumber = regNumber;
        return this;
    }
    public String getRegNumber() {
        return this.regNumber;
    }

    public FinishBlockchainBccrDciRegistrationcertRequest setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

    public FinishBlockchainBccrDciRegistrationcertRequest setSampleUrl(String sampleUrl) {
        this.sampleUrl = sampleUrl;
        return this;
    }
    public String getSampleUrl() {
        return this.sampleUrl;
    }

    public FinishBlockchainBccrDciRegistrationcertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
