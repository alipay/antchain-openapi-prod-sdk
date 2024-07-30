// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class SignAntsaasStaffingcContractCaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务名称
    @NameInMap("biz_name")
    @Validation(required = true)
    public String bizName;

    // 业务编号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 版本
    @NameInMap("sign_version")
    @Validation(required = true)
    public String signVersion;

    // 签署任务信息
    @NameInMap("sign_task_request_list")
    @Validation(required = true)
    public java.util.List<CaSignTaskRequest> signTaskRequestList;

    // 通过文件API上传的文件的file_id
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    public String fileId;

    // 合同模板密钥:若为合同模板该值必填,否则不需要填写
    @NameInMap("template_secret_key")
    public String templateSecretKey;

    // 模板填充字段集合
    @NameInMap("template_field_config_request_list")
    public java.util.List<TemplateFieldConfigRequest> templateFieldConfigRequestList;

    public static SignAntsaasStaffingcContractCaRequest build(java.util.Map<String, ?> map) throws Exception {
        SignAntsaasStaffingcContractCaRequest self = new SignAntsaasStaffingcContractCaRequest();
        return TeaModel.build(map, self);
    }

    public SignAntsaasStaffingcContractCaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SignAntsaasStaffingcContractCaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SignAntsaasStaffingcContractCaRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public SignAntsaasStaffingcContractCaRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public SignAntsaasStaffingcContractCaRequest setSignVersion(String signVersion) {
        this.signVersion = signVersion;
        return this;
    }
    public String getSignVersion() {
        return this.signVersion;
    }

    public SignAntsaasStaffingcContractCaRequest setSignTaskRequestList(java.util.List<CaSignTaskRequest> signTaskRequestList) {
        this.signTaskRequestList = signTaskRequestList;
        return this;
    }
    public java.util.List<CaSignTaskRequest> getSignTaskRequestList() {
        return this.signTaskRequestList;
    }

    public SignAntsaasStaffingcContractCaRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public SignAntsaasStaffingcContractCaRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public SignAntsaasStaffingcContractCaRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public SignAntsaasStaffingcContractCaRequest setTemplateSecretKey(String templateSecretKey) {
        this.templateSecretKey = templateSecretKey;
        return this;
    }
    public String getTemplateSecretKey() {
        return this.templateSecretKey;
    }

    public SignAntsaasStaffingcContractCaRequest setTemplateFieldConfigRequestList(java.util.List<TemplateFieldConfigRequest> templateFieldConfigRequestList) {
        this.templateFieldConfigRequestList = templateFieldConfigRequestList;
        return this;
    }
    public java.util.List<TemplateFieldConfigRequest> getTemplateFieldConfigRequestList() {
        return this.templateFieldConfigRequestList;
    }

}
