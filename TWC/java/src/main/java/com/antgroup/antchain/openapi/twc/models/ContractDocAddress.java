// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractDocAddress extends TeaModel {
    // 电子合同文档ID
    /**
     * <strong>example:</strong>
     * <p>01e50a9cedb74493a2d320b4f4732a29</p>
     */
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 电子合同文档名称，默认文件名称
    /**
     * <strong>example:</strong>
     * <p>第一份合同.pdf</p>
     */
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 电子合同下载文档地址, 有效时间1小时
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxoss.oss-cn-hangzhou.aliyuncs.com/xxx.pdf?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://xxxoss.oss-cn-hangzhou.aliyuncs.com/xxx.pdf?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
     */
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 合同文件的存证地址
    /**
     * <strong>example:</strong>
     * <p>a89495ddd334870a58686afe48a8eb83efe2dd51e4c06da7220eb1cde0f995e2</p>
     */
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
