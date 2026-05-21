// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acncontractreview.models;

import com.aliyun.tea.*;

public class ContractFile extends TeaModel {
    // 文件名称
    /**
     * <strong>example:</strong>
     * <p>XXX.docx</p>
     */
    @NameInMap("file_name")
    public String fileName;

    // 文件下载地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx">https://xxx</a></p>
     */
    @NameInMap("file_url")
    public String fileUrl;

    // 文件类型，如 docx、pdf
    /**
     * <strong>example:</strong>
     * <p>docx</p>
     */
    @NameInMap("file_type")
    public String fileType;

    public static ContractFile build(java.util.Map<String, ?> map) throws Exception {
        ContractFile self = new ContractFile();
        return TeaModel.build(map, self);
    }

    public ContractFile setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ContractFile setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public ContractFile setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
