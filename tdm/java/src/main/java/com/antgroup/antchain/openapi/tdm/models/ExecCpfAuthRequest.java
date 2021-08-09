// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class ExecCpfAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流水号
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 用户身份证ID
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 用户姓名
    @NameInMap("data_owner_name")
    public String dataOwnerName;

    // 被授权机构ID
    @NameInMap("authorized_identity")
    @Validation(required = true)
    public String authorizedIdentity;

    // 被授权机构名称
    @NameInMap("authorized_name")
    public String authorizedName;

    // 端ID
    @NameInMap("authorized_platform_identity")
    public String authorizedPlatformIdentity;

    // 授权标的
    @NameInMap("target_code")
    @Validation(required = true)
    public String targetCode;

    // 授权协议
    @NameInMap("auth_agreement")
    @Validation(required = true)
    public AuthAgreement authAgreement;

    // 核身信息
    @NameInMap("certification_info")
    public CertificationInfo certificationInfo;

    // 扩展字段
    @NameInMap("content")
    public String content;

    public static ExecCpfAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCpfAuthRequest self = new ExecCpfAuthRequest();
        return TeaModel.build(map, self);
    }

    public ExecCpfAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecCpfAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecCpfAuthRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecCpfAuthRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public ExecCpfAuthRequest setDataOwnerName(String dataOwnerName) {
        this.dataOwnerName = dataOwnerName;
        return this;
    }
    public String getDataOwnerName() {
        return this.dataOwnerName;
    }

    public ExecCpfAuthRequest setAuthorizedIdentity(String authorizedIdentity) {
        this.authorizedIdentity = authorizedIdentity;
        return this;
    }
    public String getAuthorizedIdentity() {
        return this.authorizedIdentity;
    }

    public ExecCpfAuthRequest setAuthorizedName(String authorizedName) {
        this.authorizedName = authorizedName;
        return this;
    }
    public String getAuthorizedName() {
        return this.authorizedName;
    }

    public ExecCpfAuthRequest setAuthorizedPlatformIdentity(String authorizedPlatformIdentity) {
        this.authorizedPlatformIdentity = authorizedPlatformIdentity;
        return this;
    }
    public String getAuthorizedPlatformIdentity() {
        return this.authorizedPlatformIdentity;
    }

    public ExecCpfAuthRequest setTargetCode(String targetCode) {
        this.targetCode = targetCode;
        return this;
    }
    public String getTargetCode() {
        return this.targetCode;
    }

    public ExecCpfAuthRequest setAuthAgreement(AuthAgreement authAgreement) {
        this.authAgreement = authAgreement;
        return this;
    }
    public AuthAgreement getAuthAgreement() {
        return this.authAgreement;
    }

    public ExecCpfAuthRequest setCertificationInfo(CertificationInfo certificationInfo) {
        this.certificationInfo = certificationInfo;
        return this;
    }
    public CertificationInfo getCertificationInfo() {
        return this.certificationInfo;
    }

    public ExecCpfAuthRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
