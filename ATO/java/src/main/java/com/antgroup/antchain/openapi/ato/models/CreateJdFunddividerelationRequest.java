// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateJdFunddividerelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被分账方商户公司社会统一信用代码
    @NameInMap("subject_merchant_id")
    @Validation(required = true)
    public String subjectMerchantId;

    // 分账方租户8位id
    @NameInMap("divide_tenant_id")
    @Validation(required = true)
    public String divideTenantId;

    // 分账公司社会信用代码
    @NameInMap("divide_merchant_id")
    @Validation(required = true)
    public String divideMerchantId;

    // 分账合同或协议
    @NameInMap("contract_files")
    public java.util.List<FileInfo> contractFiles;

    // 分账关系说明
    @NameInMap("desc")
    public String desc;

    // 关系id
    @NameInMap("relation_id")
    public String relationId;

    // 进件模式：DIRECT（直连进件），AGENT（代理进件）
    @NameInMap("expand_mode")
    public String expandMode;

    public static CreateJdFunddividerelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJdFunddividerelationRequest self = new CreateJdFunddividerelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateJdFunddividerelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateJdFunddividerelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateJdFunddividerelationRequest setSubjectMerchantId(String subjectMerchantId) {
        this.subjectMerchantId = subjectMerchantId;
        return this;
    }
    public String getSubjectMerchantId() {
        return this.subjectMerchantId;
    }

    public CreateJdFunddividerelationRequest setDivideTenantId(String divideTenantId) {
        this.divideTenantId = divideTenantId;
        return this;
    }
    public String getDivideTenantId() {
        return this.divideTenantId;
    }

    public CreateJdFunddividerelationRequest setDivideMerchantId(String divideMerchantId) {
        this.divideMerchantId = divideMerchantId;
        return this;
    }
    public String getDivideMerchantId() {
        return this.divideMerchantId;
    }

    public CreateJdFunddividerelationRequest setContractFiles(java.util.List<FileInfo> contractFiles) {
        this.contractFiles = contractFiles;
        return this;
    }
    public java.util.List<FileInfo> getContractFiles() {
        return this.contractFiles;
    }

    public CreateJdFunddividerelationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateJdFunddividerelationRequest setRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }
    public String getRelationId() {
        return this.relationId;
    }

    public CreateJdFunddividerelationRequest setExpandMode(String expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public String getExpandMode() {
        return this.expandMode;
    }

}
