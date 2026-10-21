// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class DocumentChunkDTO extends TeaModel {
    // content
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("content")
    public String content;

    public static DocumentChunkDTO build(java.util.Map<String, ?> map) throws Exception {
        DocumentChunkDTO self = new DocumentChunkDTO();
        return TeaModel.build(map, self);
    }

    public DocumentChunkDTO setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
