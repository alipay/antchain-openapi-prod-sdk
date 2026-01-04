// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class DocumentReferenceInfo extends TeaModel {
    // title
    /**
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // address
    /**
     * <strong>example:</strong>
     * <p>address</p>
     */
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // score 浮点类型
    /**
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("score")
    @Validation(required = true)
    public String score;

    // content
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // type	SearchSceneEnum
    // LLM_CHUNK,
    //     FAQ,
    //     LLM_TABLE;
    /**
     * <strong>example:</strong>
     * <p>LLM_CHUNK</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static DocumentReferenceInfo build(java.util.Map<String, ?> map) throws Exception {
        DocumentReferenceInfo self = new DocumentReferenceInfo();
        return TeaModel.build(map, self);
    }

    public DocumentReferenceInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DocumentReferenceInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DocumentReferenceInfo setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public DocumentReferenceInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DocumentReferenceInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
