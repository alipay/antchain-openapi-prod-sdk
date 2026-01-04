// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ContentFile extends TeaModel {
    // 文档所属知识库ID
    @NameInMap("library_id")
    public Long libraryId;

    // 文档ID
    @NameInMap("id")
    public Long id;

    // 文档文件名
    /**
     * <strong>example:</strong>
     * <p>文档文件名</p>
     */
    @NameInMap("name")
    public String name;

    // 文档类型
    /**
     * <strong>example:</strong>
     * <p>lark/mark/pdf/text/doc/docx</p>
     */
    @NameInMap("typ")
    public String typ;

    // 文档标签列表
    @NameInMap("tag_list")
    public java.util.List<String> tagList;

    // 发布状态
    /**
     * <strong>example:</strong>
     * <p>0未发布/1发布中/2发布成功/3发布失败</p>
     */
    @NameInMap("publish_status")
    public String publishStatus;

    public static ContentFile build(java.util.Map<String, ?> map) throws Exception {
        ContentFile self = new ContentFile();
        return TeaModel.build(map, self);
    }

    public ContentFile setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public Long getLibraryId() {
        return this.libraryId;
    }

    public ContentFile setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ContentFile setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContentFile setTyp(String typ) {
        this.typ = typ;
        return this;
    }
    public String getTyp() {
        return this.typ;
    }

    public ContentFile setTagList(java.util.List<String> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<String> getTagList() {
        return this.tagList;
    }

    public ContentFile setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public String getPublishStatus() {
        return this.publishStatus;
    }

}
