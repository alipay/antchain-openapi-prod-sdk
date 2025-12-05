// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DownloadAuthAgreementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 协议code
    @NameInMap("agreement_code")
    @Validation(required = true)
    public String agreementCode;

    public static DownloadAuthAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadAuthAgreementRequest self = new DownloadAuthAgreementRequest();
        return TeaModel.build(map, self);
    }

    public DownloadAuthAgreementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DownloadAuthAgreementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DownloadAuthAgreementRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadAuthAgreementRequest setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
        return this;
    }
    public String getAgreementCode() {
        return this.agreementCode;
    }

}
