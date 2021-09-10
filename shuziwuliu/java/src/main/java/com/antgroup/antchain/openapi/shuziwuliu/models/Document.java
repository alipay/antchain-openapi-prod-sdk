// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class Document extends TeaModel {
    // 文档url
    @NameInMap("document_url")
    @Validation(required = true, maxLength = 500)
    public String documentUrl;

    // 文档名称 
    @NameInMap("document_name")
    @Validation(required = true, maxLength = 200)
    public String documentName;

    public static Document build(java.util.Map<String, ?> map) throws Exception {
        Document self = new Document();
        return TeaModel.build(map, self);
    }

    public Document setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
        return this;
    }
    public String getDocumentUrl() {
        return this.documentUrl;
    }

    public Document setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

}
