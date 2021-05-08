// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CancelAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权租户身份ID：
    // 身份证号/统一社会组织机构信用码
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 分配code
    @NameInMap("authorized_platform_identity")
    @Validation(required = true)
    public String authorizedPlatformIdentity;

    // 标的物，查询授权接口返回
    // 
    // 
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    // 核身信息
    // 
    @NameInMap("certification_info")
    @Validation(required = true)
    public String certificationInfo;

    // 请求流水号
    // 
    // 幂等标示
    // 
    // 
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    public static CancelAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAuthRequest self = new CancelAuthRequest();
        return TeaModel.build(map, self);
    }

    public CancelAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelAuthRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public CancelAuthRequest setAuthorizedPlatformIdentity(String authorizedPlatformIdentity) {
        this.authorizedPlatformIdentity = authorizedPlatformIdentity;
        return this;
    }
    public String getAuthorizedPlatformIdentity() {
        return this.authorizedPlatformIdentity;
    }

    public CancelAuthRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CancelAuthRequest setCertificationInfo(String certificationInfo) {
        this.certificationInfo = certificationInfo;
        return this;
    }
    public String getCertificationInfo() {
        return this.certificationInfo;
    }

    public CancelAuthRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
