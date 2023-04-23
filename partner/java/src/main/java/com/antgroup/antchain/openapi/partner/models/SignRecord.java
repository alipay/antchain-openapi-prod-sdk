// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class SignRecord extends TeaModel {
    // 合同类型：标准、自定义
    @NameInMap("contract_type")
    @Validation(required = true)
    public String contractType;

    // 签约模式：ENTITY_SEAL（实体章）、ELECTRONIC_SEAL（电子章）
    @NameInMap("seal_mode")
    @Validation(required = true)
    public String sealMode;

    // 签约状态
    @NameInMap("sign_status")
    @Validation(required = true)
    public String signStatus;

    // 签约记录关联的文件信息
    @NameInMap("files")
    @Validation(required = true)
    public java.util.List<PartnerSignFile> files;

    public static SignRecord build(java.util.Map<String, ?> map) throws Exception {
        SignRecord self = new SignRecord();
        return TeaModel.build(map, self);
    }

    public SignRecord setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

    public SignRecord setSealMode(String sealMode) {
        this.sealMode = sealMode;
        return this;
    }
    public String getSealMode() {
        return this.sealMode;
    }

    public SignRecord setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

    public SignRecord setFiles(java.util.List<PartnerSignFile> files) {
        this.files = files;
        return this;
    }
    public java.util.List<PartnerSignFile> getFiles() {
        return this.files;
    }

}
