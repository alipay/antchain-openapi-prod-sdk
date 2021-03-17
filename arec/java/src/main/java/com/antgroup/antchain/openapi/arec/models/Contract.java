// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class Contract extends TeaModel {
    // 文件 ID
    @NameInMap("document_id")
    @Validation(required = true)
    public String documentId;

    // 参数指定合同文件名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 合同文件的URL下载路径，有效期1小时
    @NameInMap("archived_file_url")
    public String archivedFileUrl;

    public static Contract build(java.util.Map<String, ?> map) throws Exception {
        Contract self = new Contract();
        return TeaModel.build(map, self);
    }

    public Contract setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public Contract setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public Contract setArchivedFileUrl(String archivedFileUrl) {
        this.archivedFileUrl = archivedFileUrl;
        return this;
    }
    public String getArchivedFileUrl() {
        return this.archivedFileUrl;
    }

}
