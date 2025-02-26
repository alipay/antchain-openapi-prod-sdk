// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class CreateBlockchainBccrDciRegistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // DC123456
    @NameInMap("dci_content_id")
    @Validation(required = true)
    public String dciContentId;

    // 数登申请声明
    @NameInMap("explanation_info")
    @Validation(required = true)
    public DciExplanationInfo explanationInfo;

    // 补充文件相关信息
    @NameInMap("additional_file_info")
    public AdditionalFileInfo additionalFileInfo;

    // 发票信息--当前支持普票
    @NameInMap("invoice_info")
    public InvoiceInfo invoiceInfo;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 废弃待删除
    @NameInMap("creation_statement")
    public String creationStatement;

    // 废弃待删除
    @NameInMap("ancillary_evidence_path_list")
    public java.util.List<String> ancillaryEvidencePathList;

    // 申领人联系信息
    @NameInMap("applyer_contact_info")
    public ContactInfo applyerContactInfo;

    // 代理人联系信息
    @NameInMap("platform_contact_info")
    public ContactInfo platformContactInfo;

    // 权利描述
    @NameInMap("right_scope_desc")
    public String rightScopeDesc;

    public static CreateBlockchainBccrDciRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainBccrDciRegistrationRequest self = new CreateBlockchainBccrDciRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainBccrDciRegistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBlockchainBccrDciRegistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBlockchainBccrDciRegistrationRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

    public CreateBlockchainBccrDciRegistrationRequest setExplanationInfo(DciExplanationInfo explanationInfo) {
        this.explanationInfo = explanationInfo;
        return this;
    }
    public DciExplanationInfo getExplanationInfo() {
        return this.explanationInfo;
    }

    public CreateBlockchainBccrDciRegistrationRequest setAdditionalFileInfo(AdditionalFileInfo additionalFileInfo) {
        this.additionalFileInfo = additionalFileInfo;
        return this;
    }
    public AdditionalFileInfo getAdditionalFileInfo() {
        return this.additionalFileInfo;
    }

    public CreateBlockchainBccrDciRegistrationRequest setInvoiceInfo(InvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
        return this;
    }
    public InvoiceInfo getInvoiceInfo() {
        return this.invoiceInfo;
    }

    public CreateBlockchainBccrDciRegistrationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBlockchainBccrDciRegistrationRequest setCreationStatement(String creationStatement) {
        this.creationStatement = creationStatement;
        return this;
    }
    public String getCreationStatement() {
        return this.creationStatement;
    }

    public CreateBlockchainBccrDciRegistrationRequest setAncillaryEvidencePathList(java.util.List<String> ancillaryEvidencePathList) {
        this.ancillaryEvidencePathList = ancillaryEvidencePathList;
        return this;
    }
    public java.util.List<String> getAncillaryEvidencePathList() {
        return this.ancillaryEvidencePathList;
    }

    public CreateBlockchainBccrDciRegistrationRequest setApplyerContactInfo(ContactInfo applyerContactInfo) {
        this.applyerContactInfo = applyerContactInfo;
        return this;
    }
    public ContactInfo getApplyerContactInfo() {
        return this.applyerContactInfo;
    }

    public CreateBlockchainBccrDciRegistrationRequest setPlatformContactInfo(ContactInfo platformContactInfo) {
        this.platformContactInfo = platformContactInfo;
        return this;
    }
    public ContactInfo getPlatformContactInfo() {
        return this.platformContactInfo;
    }

    public CreateBlockchainBccrDciRegistrationRequest setRightScopeDesc(String rightScopeDesc) {
        this.rightScopeDesc = rightScopeDesc;
        return this;
    }
    public String getRightScopeDesc() {
        return this.rightScopeDesc;
    }

}
