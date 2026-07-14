// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class DocumentParagraphDTO extends TeaModel {
    // 段落标题
    /**
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 段落内容
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 切片列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("chunks")
    @Validation(required = true)
    public java.util.List<DocumentChunkDTO> chunks;

    public static DocumentParagraphDTO build(java.util.Map<String, ?> map) throws Exception {
        DocumentParagraphDTO self = new DocumentParagraphDTO();
        return TeaModel.build(map, self);
    }

    public DocumentParagraphDTO setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DocumentParagraphDTO setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DocumentParagraphDTO setChunks(java.util.List<DocumentChunkDTO> chunks) {
        this.chunks = chunks;
        return this;
    }
    public java.util.List<DocumentChunkDTO> getChunks() {
        return this.chunks;
    }

}
