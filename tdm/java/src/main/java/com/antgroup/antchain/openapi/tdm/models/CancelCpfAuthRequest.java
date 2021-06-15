// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CancelCpfAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流水号
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 身份证ID
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 端ID
    @NameInMap("authorized_platform_identity")
    @Validation(required = true)
    public String authorizedPlatformIdentity;

    // 授权接口返回的授权码
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    // 核身信息
    @NameInMap("certification_info")
    public String certificationInfo;

    public static CancelCpfAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCpfAuthRequest self = new CancelCpfAuthRequest();
        return TeaModel.build(map, self);
    }

    public CancelCpfAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelCpfAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelCpfAuthRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelCpfAuthRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public CancelCpfAuthRequest setAuthorizedPlatformIdentity(String authorizedPlatformIdentity) {
        this.authorizedPlatformIdentity = authorizedPlatformIdentity;
        return this;
    }
    public String getAuthorizedPlatformIdentity() {
        return this.authorizedPlatformIdentity;
    }

    public CancelCpfAuthRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CancelCpfAuthRequest setCertificationInfo(String certificationInfo) {
        this.certificationInfo = certificationInfo;
        return this;
    }
    public String getCertificationInfo() {
        return this.certificationInfo;
    }

}
