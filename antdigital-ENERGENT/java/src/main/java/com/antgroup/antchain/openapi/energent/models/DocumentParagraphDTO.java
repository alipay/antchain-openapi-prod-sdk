// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class DocumentParagraphDTO extends TeaModel {
    // title
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("title")
    public String title;

    // content
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("content")
    public String content;

    // chunk
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("chunks")
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
