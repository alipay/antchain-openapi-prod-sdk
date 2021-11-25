// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class ContractDocAddress extends TeaModel {
    // 电子合同文档ID
    // 
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 电子合同文档名称，默认文件名称
    // 
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 电子合同下载文档地址, 有效时间1小时
    // 
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 链上hash
    @NameInMap("tx_hash")
    public String txHash;

    public static ContractDocAddress build(java.util.Map<String, ?> map) throws Exception {
        ContractDocAddress self = new ContractDocAddress();
        return TeaModel.build(map, self);
    }

    public ContractDocAddress setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ContractDocAddress setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ContractDocAddress setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public ContractDocAddress setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
