// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6efc6591476e4813ac8f7c9b6359c0b7.models;

import com.aliyun.tea.*;

public class VerifySaasSecurityRdslibAntcaptchaserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("rds_analyze_request")
    @Validation(required = true)
    public RdsAnalyzeRequest rdsAnalyzeRequest;

    // 服务版本
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    public static VerifySaasSecurityRdslibAntcaptchaserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifySaasSecurityRdslibAntcaptchaserviceRequest self = new VerifySaasSecurityRdslibAntcaptchaserviceRequest();
        return TeaModel.build(map, self);
    }

    public VerifySaasSecurityRdslibAntcaptchaserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifySaasSecurityRdslibAntcaptchaserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifySaasSecurityRdslibAntcaptchaserviceRequest setRdsAnalyzeRequest(RdsAnalyzeRequest rdsAnalyzeRequest) {
        this.rdsAnalyzeRequest = rdsAnalyzeRequest;
        return this;
    }
    public RdsAnalyzeRequest getRdsAnalyzeRequest() {
        return this.rdsAnalyzeRequest;
    }

    public VerifySaasSecurityRdslibAntcaptchaserviceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
