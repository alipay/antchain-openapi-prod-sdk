// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class RetryBlockchainBccrDciRegistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待补正数登申请id
    @NameInMap("digital_register_id")
    @Validation(required = true)
    public String digitalRegisterId;

    // 替换dci申领id
    @NameInMap("dci_content_id")
    public String dciContentId;

    // 数登申请声明
    @NameInMap("explanation_info")
    @Validation(required = true)
    public DciExplanationInfo explanationInfo;

    // 补充文件信息
    @NameInMap("additional_file_info")
    public AdditionalFileInfo additionalFileInfo;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 权利描述
    @NameInMap("right_scope_desc")
    public String rightScopeDesc;

    // 申领人联系信息
    @NameInMap("applyer_contact_info")
    public ContactInfo applyerContactInfo;

    // 代理人联系信息
    @NameInMap("platform_contact_info")
    public ContactInfo platformContactInfo;

    public static RetryBlockchainBccrDciRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryBlockchainBccrDciRegistrationRequest self = new RetryBlockchainBccrDciRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public RetryBlockchainBccrDciRegistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryBlockchainBccrDciRegistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetryBlockchainBccrDciRegistrationRequest setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

    public RetryBlockchainBccrDciRegistrationRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

    public RetryBlockchainBccrDciRegistrationRequest setExplanationInfo(DciExplanationInfo explanationInfo) {
        this.explanationInfo = explanationInfo;
        return this;
    }
    public DciExplanationInfo getExplanationInfo() {
        return this.explanationInfo;
    }

    public RetryBlockchainBccrDciRegistrationRequest setAdditionalFileInfo(AdditionalFileInfo additionalFileInfo) {
        this.additionalFileInfo = additionalFileInfo;
        return this;
    }
    public AdditionalFileInfo getAdditionalFileInfo() {
        return this.additionalFileInfo;
    }

    public RetryBlockchainBccrDciRegistrationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RetryBlockchainBccrDciRegistrationRequest setRightScopeDesc(String rightScopeDesc) {
        this.rightScopeDesc = rightScopeDesc;
        return this;
    }
    public String getRightScopeDesc() {
        return this.rightScopeDesc;
    }

    public RetryBlockchainBccrDciRegistrationRequest setApplyerContactInfo(ContactInfo applyerContactInfo) {
        this.applyerContactInfo = applyerContactInfo;
        return this;
    }
    public ContactInfo getApplyerContactInfo() {
        return this.applyerContactInfo;
    }

    public RetryBlockchainBccrDciRegistrationRequest setPlatformContactInfo(ContactInfo platformContactInfo) {
        this.platformContactInfo = platformContactInfo;
        return this;
    }
    public ContactInfo getPlatformContactInfo() {
        return this.platformContactInfo;
    }

}
