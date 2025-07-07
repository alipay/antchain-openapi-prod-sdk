// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunContractProject extends TeaModel {
    // consortium_id
    /**
     * <strong>example:</strong>
     * <p>consortium_id</p>
     */
    @NameInMap("consortium_id")
    public String consortiumId;

    // create_time
    /**
     * <strong>example:</strong>
     * <p>123123123</p>
     */
    @NameInMap("create_time")
    public Long createTime;

    // project_description
    /**
     * <strong>example:</strong>
     * <p>project_description</p>
     */
    @NameInMap("project_description")
    public String projectDescription;

    // project_id
    /**
     * <strong>example:</strong>
     * <p>project_id</p>
     */
    @NameInMap("project_id")
    public String projectId;

    // project_name
    /**
     * <strong>example:</strong>
     * <p>project_name</p>
     */
    @NameInMap("project_name")
    public String projectName;

    // project_version
    /**
     * <strong>example:</strong>
     * <p>project_version</p>
     */
    @NameInMap("project_version")
    public String projectVersion;

    // update_time
    /**
     * <strong>example:</strong>
     * <p>update_time</p>
     */
    @NameInMap("update_time")
    public Long updateTime;

    public static ALiYunContractProject build(java.util.Map<String, ?> map) throws Exception {
        ALiYunContractProject self = new ALiYunContractProject();
        return TeaModel.build(map, self);
    }

    public ALiYunContractProject setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ALiYunContractProject setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ALiYunContractProject setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
        return this;
    }
    public String getProjectDescription() {
        return this.projectDescription;
    }

    public ALiYunContractProject setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ALiYunContractProject setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ALiYunContractProject setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
        return this;
    }
    public String getProjectVersion() {
        return this.projectVersion;
    }

    public ALiYunContractProject setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
