// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class DocumentProcessingDataDTO extends TeaModel {
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
     * <p>1</p>
     */
    @NameInMap("content")
    public String content;

    // 加工后的文档数据
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("paragraphs")
    public java.util.List<DocumentParagraphDTO> paragraphs;

    public static DocumentProcessingDataDTO build(java.util.Map<String, ?> map) throws Exception {
        DocumentProcessingDataDTO self = new DocumentProcessingDataDTO();
        return TeaModel.build(map, self);
    }

    public DocumentProcessingDataDTO setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DocumentProcessingDataDTO setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DocumentProcessingDataDTO setParagraphs(java.util.List<DocumentParagraphDTO> paragraphs) {
        this.paragraphs = paragraphs;
        return this;
    }
    public java.util.List<DocumentParagraphDTO> getParagraphs() {
        return this.paragraphs;
    }

}
