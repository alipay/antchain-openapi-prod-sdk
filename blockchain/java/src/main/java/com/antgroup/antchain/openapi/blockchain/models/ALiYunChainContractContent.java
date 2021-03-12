// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainContractContent extends TeaModel {
    // content
    @NameInMap("content")
    public String content;

    // content_id
    @NameInMap("content_id")
    public String contentId;

    // content_name
    @NameInMap("content_name")
    public String contentName;

    // create_time
    @NameInMap("create_time")
    public Long createTime;

    // is_directory
    @NameInMap("is_directory")
    public Boolean isDirectory;

    // parent_content_id
    @NameInMap("parent_content_id")
    public String parentContentId;

    // project_id
    @NameInMap("project_id")
    public String projectId;

    // update_time
    @NameInMap("update_time")
    public Long updateTime;

    public static ALiYunChainContractContent build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainContractContent self = new ALiYunChainContractContent();
        return TeaModel.build(map, self);
    }

    public ALiYunChainContractContent setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ALiYunChainContractContent setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public ALiYunChainContractContent setContentName(String contentName) {
        this.contentName = contentName;
        return this;
    }
    public String getContentName() {
        return this.contentName;
    }

    public ALiYunChainContractContent setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ALiYunChainContractContent setIsDirectory(Boolean isDirectory) {
        this.isDirectory = isDirectory;
        return this;
    }
    public Boolean getIsDirectory() {
        return this.isDirectory;
    }

    public ALiYunChainContractContent setParentContentId(String parentContentId) {
        this.parentContentId = parentContentId;
        return this;
    }
    public String getParentContentId() {
        return this.parentContentId;
    }

    public ALiYunChainContractContent setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ALiYunChainContractContent setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
