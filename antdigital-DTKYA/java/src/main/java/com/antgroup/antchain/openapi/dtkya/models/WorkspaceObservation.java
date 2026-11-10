// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class WorkspaceObservation extends TeaModel {
    // 工作目录路径标识
    /**
     * <strong>example:</strong>
     * <p>/work/project</p>
     */
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // 项目名称，可为空
    /**
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("project_name")
    public String projectName;

    public static WorkspaceObservation build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceObservation self = new WorkspaceObservation();
        return TeaModel.build(map, self);
    }

    public WorkspaceObservation setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public WorkspaceObservation setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
