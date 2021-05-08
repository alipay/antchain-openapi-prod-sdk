// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class ExecAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被授权租户身份ID：
    // 
    // 身份证号/统一社会组织机构信用码
    @NameInMap("authorized_identity")
    @Validation(required = true)
    public String authorizedIdentity;

    // 分配code
    // 
    // 
    @NameInMap("authorized_platform_identity")
    @Validation(required = true)
    public String authorizedPlatformIdentity;

    // 授权协议
    @NameInMap("auth_agreement")
    @Validation(required = true)
    public AuthAgreement authAgreement;

    // 扩展字段,目前是一个json串，传入相关附加信息，如果对应的附加信息key不需要，可以不传，
    // 
    // key对应的value数据字典由平台提供
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 授权租户身份ID：
    // 身份证号/统一社会组织机构信用码
    // 
    // 
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 请求流水号(64位 由平台方定义)_
    // 幂等标示
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 标的物
    // 
    // 
    @NameInMap("target_code")
    @Validation(required = true)
    public String targetCode;

    // 核身产品类型
    @NameInMap("certification_type")
    public String certificationType;

    // 核身信息
    // 
    // 
    @NameInMap("certification_info")
    public String certificationInfo;

    public static ExecAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAuthRequest self = new ExecAuthRequest();
        return TeaModel.build(map, self);
    }

    public ExecAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAuthRequest setAuthorizedIdentity(String authorizedIdentity) {
        this.authorizedIdentity = authorizedIdentity;
        return this;
    }
    public String getAuthorizedIdentity() {
        return this.authorizedIdentity;
    }

    public ExecAuthRequest setAuthorizedPlatformIdentity(String authorizedPlatformIdentity) {
        this.authorizedPlatformIdentity = authorizedPlatformIdentity;
        return this;
    }
    public String getAuthorizedPlatformIdentity() {
        return this.authorizedPlatformIdentity;
    }

    public ExecAuthRequest setAuthAgreement(AuthAgreement authAgreement) {
        this.authAgreement = authAgreement;
        return this;
    }
    public AuthAgreement getAuthAgreement() {
        return this.authAgreement;
    }

    public ExecAuthRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExecAuthRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public ExecAuthRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecAuthRequest setTargetCode(String targetCode) {
        this.targetCode = targetCode;
        return this;
    }
    public String getTargetCode() {
        return this.targetCode;
    }

    public ExecAuthRequest setCertificationType(String certificationType) {
        this.certificationType = certificationType;
        return this;
    }
    public String getCertificationType() {
        return this.certificationType;
    }

    public ExecAuthRequest setCertificationInfo(String certificationInfo) {
        this.certificationInfo = certificationInfo;
        return this;
    }
    public String getCertificationInfo() {
        return this.certificationInfo;
    }

}
