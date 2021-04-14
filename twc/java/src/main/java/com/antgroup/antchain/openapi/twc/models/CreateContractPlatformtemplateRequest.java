// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractPlatformtemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 是否包含代扣规则，如果设置为true，则在创建手动签署流程时，必须传入代扣规则。默认为false
    @NameInMap("auto_deduction")
    public Boolean autoDeduction;

    // Base64编码的模板文件的MD5值
    @NameInMap("content_md5")
    @Validation(required = true)
    public String contentMd5;

    // 目标文件的MIME类型
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
    @NameInMap("convert2_pdf")
    @Validation(required = true)
    public Boolean convert2Pdf;

    // 文件名称，必须带扩展名如:.pdf,.doc,.docx
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 平台方的签署信息列表
    @NameInMap("sign_fields")
    @Validation(required = true)
    public java.util.List<ContractPlatformSignField> signFields;

    // 用户需要签章的页面列表（默认为最后一页）
    @NameInMap("user_sign_pages")
    public java.util.List<Long> userSignPages;

    // 是否强制用户选择代扣
    @NameInMap("auto_deduction_force")
    public Boolean autoDeductionForce;

    public static CreateContractPlatformtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractPlatformtemplateRequest self = new CreateContractPlatformtemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractPlatformtemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractPlatformtemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractPlatformtemplateRequest setAutoDeduction(Boolean autoDeduction) {
        this.autoDeduction = autoDeduction;
        return this;
    }
    public Boolean getAutoDeduction() {
        return this.autoDeduction;
    }

    public CreateContractPlatformtemplateRequest setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }
    public String getContentMd5() {
        return this.contentMd5;
    }

    public CreateContractPlatformtemplateRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CreateContractPlatformtemplateRequest setConvert2Pdf(Boolean convert2Pdf) {
        this.convert2Pdf = convert2Pdf;
        return this;
    }
    public Boolean getConvert2Pdf() {
        return this.convert2Pdf;
    }

    public CreateContractPlatformtemplateRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateContractPlatformtemplateRequest setSignFields(java.util.List<ContractPlatformSignField> signFields) {
        this.signFields = signFields;
        return this;
    }
    public java.util.List<ContractPlatformSignField> getSignFields() {
        return this.signFields;
    }

    public CreateContractPlatformtemplateRequest setUserSignPages(java.util.List<Long> userSignPages) {
        this.userSignPages = userSignPages;
        return this;
    }
    public java.util.List<Long> getUserSignPages() {
        return this.userSignPages;
    }

    public CreateContractPlatformtemplateRequest setAutoDeductionForce(Boolean autoDeductionForce) {
        this.autoDeductionForce = autoDeductionForce;
        return this;
    }
    public Boolean getAutoDeductionForce() {
        return this.autoDeductionForce;
    }

}
