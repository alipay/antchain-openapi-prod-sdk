// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractDoc extends TeaModel {
    // 上传的电子合同文档是否被加密过，0-未被加密，1-被加密过，默认0
    @NameInMap("encryption")
    public Long encryption;

    // 电子合同文档的ID
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 电子合同文档名称，默认文件名称
    @NameInMap("file_name")
    public String fileName;

    // 电子合同文档密码, 如果encryption值为1, 文档密码不能为空，默认没有密码
    @NameInMap("file_password")
    public String filePassword;

    public static ContractDoc build(java.util.Map<String, ?> map) throws Exception {
        ContractDoc self = new ContractDoc();
        return TeaModel.build(map, self);
    }

    public ContractDoc setEncryption(Long encryption) {
        this.encryption = encryption;
        return this;
    }
    public Long getEncryption() {
        return this.encryption;
    }

    public ContractDoc setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ContractDoc setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ContractDoc setFilePassword(String filePassword) {
        this.filePassword = filePassword;
        return this;
    }
    public String getFilePassword() {
        return this.filePassword;
    }

}
