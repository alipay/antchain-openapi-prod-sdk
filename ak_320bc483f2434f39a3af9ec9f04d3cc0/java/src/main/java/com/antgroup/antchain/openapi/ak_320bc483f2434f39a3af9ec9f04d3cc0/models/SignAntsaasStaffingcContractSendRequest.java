// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class SignAntsaasStaffingcContractSendRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同或模版文件
    // 待上传文件
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    // 待上传文件名
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    public String fileId;

    // 合同文件（base64格式）
    @NameInMap("contract_file")
    @Validation(required = true)
    public String contractFile;

    // 合同类型（1合同文件 2合同模板）
    @NameInMap("contract_type")
    @Validation(required = true)
    public Long contractType;

    // 合同名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 合同文件类型 （pdf、word）
    @NameInMap("contract_file_type")
    @Validation(required = true)
    public String contractFileType;

    // 合同模版参数，json格式，以key value格式存储，合同类型属于模板必填
    @NameInMap("simple_form_fields")
    public String simpleFormFields;

    // 签署平台（ALIPAY或H5）
    @NameInMap("sign_platform")
    @Validation(required = true)
    public String signPlatform;

    // 合同用户信息列表
    @NameInMap("sign_user_list")
    @Validation(required = true)
    public java.util.List<SignUserInfo> signUserList;

    // 合同企业信息列表
    @NameInMap("sign_enterprise_list")
    @Validation(required = true)
    public java.util.List<SignEnterpriseInfo> signEnterpriseList;

    public static SignAntsaasStaffingcContractSendRequest build(java.util.Map<String, ?> map) throws Exception {
        SignAntsaasStaffingcContractSendRequest self = new SignAntsaasStaffingcContractSendRequest();
        return TeaModel.build(map, self);
    }

    public SignAntsaasStaffingcContractSendRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SignAntsaasStaffingcContractSendRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SignAntsaasStaffingcContractSendRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public SignAntsaasStaffingcContractSendRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public SignAntsaasStaffingcContractSendRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public SignAntsaasStaffingcContractSendRequest setContractFile(String contractFile) {
        this.contractFile = contractFile;
        return this;
    }
    public String getContractFile() {
        return this.contractFile;
    }

    public SignAntsaasStaffingcContractSendRequest setContractType(Long contractType) {
        this.contractType = contractType;
        return this;
    }
    public Long getContractType() {
        return this.contractType;
    }

    public SignAntsaasStaffingcContractSendRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public SignAntsaasStaffingcContractSendRequest setContractFileType(String contractFileType) {
        this.contractFileType = contractFileType;
        return this;
    }
    public String getContractFileType() {
        return this.contractFileType;
    }

    public SignAntsaasStaffingcContractSendRequest setSimpleFormFields(String simpleFormFields) {
        this.simpleFormFields = simpleFormFields;
        return this;
    }
    public String getSimpleFormFields() {
        return this.simpleFormFields;
    }

    public SignAntsaasStaffingcContractSendRequest setSignPlatform(String signPlatform) {
        this.signPlatform = signPlatform;
        return this;
    }
    public String getSignPlatform() {
        return this.signPlatform;
    }

    public SignAntsaasStaffingcContractSendRequest setSignUserList(java.util.List<SignUserInfo> signUserList) {
        this.signUserList = signUserList;
        return this;
    }
    public java.util.List<SignUserInfo> getSignUserList() {
        return this.signUserList;
    }

    public SignAntsaasStaffingcContractSendRequest setSignEnterpriseList(java.util.List<SignEnterpriseInfo> signEnterpriseList) {
        this.signEnterpriseList = signEnterpriseList;
        return this;
    }
    public java.util.List<SignEnterpriseInfo> getSignEnterpriseList() {
        return this.signEnterpriseList;
    }

}
