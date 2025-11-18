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
    @NameInMap("devide_tenant_id")
    @Validation(required = true)
    public String devideTenantId;

    // 分账公司社会信用代码
    @NameInMap("devide_merchant_id")
    @Validation(required = true)
    public String devideMerchantId;

    // 分账合同或协议
    @NameInMap("contract_files")
    public java.util.List<FileInfo> contractFiles;

    // 分账关系说明
    @NameInMap("desc")
    public String desc;

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

    public CreateJdFunddividerelationRequest setDevideTenantId(String devideTenantId) {
        this.devideTenantId = devideTenantId;
        return this;
    }
    public String getDevideTenantId() {
        return this.devideTenantId;
    }

    public CreateJdFunddividerelationRequest setDevideMerchantId(String devideMerchantId) {
        this.devideMerchantId = devideMerchantId;
        return this;
    }
    public String getDevideMerchantId() {
        return this.devideMerchantId;
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

}
