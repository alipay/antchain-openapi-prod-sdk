// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EnterpriseDocumentFile extends TeaModel {
    // 文档名称
    @NameInMap("document_name")
    @Validation(required = true)
    public String documentName;

    // 文件地址
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
