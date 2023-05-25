// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class Repository extends TeaModel {
    // 仓库ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 仓库名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 仓库Tag数
    @NameInMap("tags_count")
    @Validation(required = true)
    public String tagsCount;

    public static Repository build(java.util.Map<String, ?> map) throws Exception {
        Repository self = new Repository();
        return TeaModel.build(map, self);
    }

    public Repository setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Repository setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Repository setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public Repository setTagsCount(String tagsCount) {
        this.tagsCount = tagsCount;
        return this;
    }
    public String getTagsCount() {
        return this.tagsCount;
    }

}
