// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class DocumentProcessingDataDTO extends TeaModel {
    // 段落列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("paragraphs")
    @Validation(required = true)
    public java.util.List<DocumentParagraphDTO> paragraphs;

    // 文档标题
    /**
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 原文内容
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static DocumentProcessingDataDTO build(java.util.Map<String, ?> map) throws Exception {
        DocumentProcessingDataDTO self = new DocumentProcessingDataDTO();
        return TeaModel.build(map, self);
    }

    public DocumentProcessingDataDTO setParagraphs(java.util.List<DocumentParagraphDTO> paragraphs) {
        this.paragraphs = paragraphs;
        return this;
    }
    public java.util.List<DocumentParagraphDTO> getParagraphs() {
        return this.paragraphs;
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

}
