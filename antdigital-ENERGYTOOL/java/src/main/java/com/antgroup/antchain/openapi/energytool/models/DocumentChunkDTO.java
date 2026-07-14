// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class DocumentChunkDTO extends TeaModel {
    // 切片内容
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("content")
    @Validation(required = true)
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
