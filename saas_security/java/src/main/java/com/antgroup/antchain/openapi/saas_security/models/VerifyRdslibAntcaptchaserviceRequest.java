// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class VerifyRdslibAntcaptchaserviceRequest extends TeaModel {
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

    public static VerifyRdslibAntcaptchaserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyRdslibAntcaptchaserviceRequest self = new VerifyRdslibAntcaptchaserviceRequest();
        return TeaModel.build(map, self);
    }

    public VerifyRdslibAntcaptchaserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyRdslibAntcaptchaserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyRdslibAntcaptchaserviceRequest setRdsAnalyzeRequest(RdsAnalyzeRequest rdsAnalyzeRequest) {
        this.rdsAnalyzeRequest = rdsAnalyzeRequest;
        return this;
    }
    public RdsAnalyzeRequest getRdsAnalyzeRequest() {
        return this.rdsAnalyzeRequest;
    }

    public VerifyRdslibAntcaptchaserviceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
