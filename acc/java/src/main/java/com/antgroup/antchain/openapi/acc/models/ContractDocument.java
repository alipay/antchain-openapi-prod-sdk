// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class ContractDocument extends TeaModel {
    // 是否加密，0-不加密，1-加，默认0
    // 
    @NameInMap("encryption")
    public Long encryption;

    // 电子合同文档的ID
    // 
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 电子合同文档名称，默认文件名称
    // 
    @NameInMap("file_name")
    public String fileName;

    // 电子合同文档密码, 如果encryption值为1, 文档密码不能为空，默认没有密码
    // 
    @NameInMap("file_password")
    public String filePassword;

    public static ContractDocument build(java.util.Map<String, ?> map) throws Exception {
        ContractDocument self = new ContractDocument();
        return TeaModel.build(map, self);
    }

    public ContractDocument setEncryption(Long encryption) {
        this.encryption = encryption;
        return this;
    }
    public Long getEncryption() {
        return this.encryption;
    }

    public ContractDocument setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ContractDocument setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ContractDocument setFilePassword(String filePassword) {
        this.filePassword = filePassword;
        return this;
    }
    public String getFilePassword() {
        return this.filePassword;
    }

}
