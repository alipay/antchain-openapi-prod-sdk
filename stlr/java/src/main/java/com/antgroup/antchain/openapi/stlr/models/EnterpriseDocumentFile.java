// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EnterpriseDocumentFile extends TeaModel {
    // 文档名称
    /**
     * <strong>example:</strong>
     * <p>2022年7月车辆运输数据文件</p>
     */
    @NameInMap("document_name")
    @Validation(required = true)
    public String documentName;

    // 文件地址
    /**
     * <strong>example:</strong>
     * <p>carbonchain/file/dataentry_document/20211108000220010000000000000356/20211108000220010000000000000356.xlsx</p>
     */
    @NameInMap("document_address")
    @Validation(required = true)
    public String documentAddress;

    public static EnterpriseDocumentFile build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseDocumentFile self = new EnterpriseDocumentFile();
        return TeaModel.build(map, self);
    }

    public EnterpriseDocumentFile setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public EnterpriseDocumentFile setDocumentAddress(String documentAddress) {
        this.documentAddress = documentAddress;
        return this;
    }
    public String getDocumentAddress() {
        return this.documentAddress;
    }

}
