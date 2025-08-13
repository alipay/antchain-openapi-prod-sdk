// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ProjectSpaceInfo extends TeaModel {
    // 项目名称
    /**
     * <strong>example:</strong>
     * <p>温控节能</p>
     */
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 项目编码
    /**
     * <strong>example:</strong>
     * <p>TEMP_CONTROL</p>
     */
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 项目描述
    /**
     * <strong>example:</strong>
     * <p>这是描述</p>
     */
    @NameInMap("project_desc")
    public String projectDesc;

    public static ProjectSpaceInfo build(java.util.Map<String, ?> map) throws Exception {
        ProjectSpaceInfo self = new ProjectSpaceInfo();
        return TeaModel.build(map, self);
    }

    public ProjectSpaceInfo setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ProjectSpaceInfo setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public ProjectSpaceInfo setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
        return this;
    }
    public String getProjectDesc() {
        return this.projectDesc;
    }

}
