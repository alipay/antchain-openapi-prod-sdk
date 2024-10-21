// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ProjectResource extends TeaModel {
    // 资源ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 资源类型（目前只有PROJECT_REPORT）
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 资源名称
    @NameInMap("resource_name")
    @Validation(required = true)
    public String resourceName;

    // 文件ID
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 创建时间戳
    @NameInMap("gmt_created")
    @Validation(required = true)
    public Long gmtCreated;

    public static ProjectResource build(java.util.Map<String, ?> map) throws Exception {
        ProjectResource self = new ProjectResource();
        return TeaModel.build(map, self);
    }

    public ProjectResource setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ProjectResource setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ProjectResource setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ProjectResource setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ProjectResource setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ProjectResource setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

}
