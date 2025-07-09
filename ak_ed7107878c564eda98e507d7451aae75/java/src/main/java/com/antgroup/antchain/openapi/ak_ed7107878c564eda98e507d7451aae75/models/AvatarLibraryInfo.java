// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AvatarLibraryInfo extends TeaModel {
    // 知识点数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("question_count")
    @Validation(required = true)
    public Long questionCount;

    // 知识库id
    /**
     * <strong>example:</strong>
     * <p>73423001</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 知识库名称
    /**
     * <strong>example:</strong>
     * <p>知识库</p>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 数字人角色信息
    @NameInMap("human_info")
    @Validation(required = true)
    public AvatarHumanInfo humanInfo;

    public static AvatarLibraryInfo build(java.util.Map<String, ?> map) throws Exception {
        AvatarLibraryInfo self = new AvatarLibraryInfo();
        return TeaModel.build(map, self);
    }

    public AvatarLibraryInfo setQuestionCount(Long questionCount) {
        this.questionCount = questionCount;
        return this;
    }
    public Long getQuestionCount() {
        return this.questionCount;
    }

    public AvatarLibraryInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AvatarLibraryInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AvatarLibraryInfo setHumanInfo(AvatarHumanInfo humanInfo) {
        this.humanInfo = humanInfo;
        return this;
    }
    public AvatarHumanInfo getHumanInfo() {
        return this.humanInfo;
    }

}
