// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class Project extends TeaModel {
    // 项目对应的合约 ID
    @NameInMap("contract_id")
    public String contractId;

    // 项目结束时间，精确到毫秒，FILM类型订单必填
    @NameInMap("project_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String projectEndTime;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 项目名称
    @NameInMap("project_name")
    public String projectName;

    // 项目开始时间，精确到毫秒，FILM类型订单必填
    @NameInMap("project_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String projectStartTime;

    // 项目类型，目前支持FILM：电影，CAR：汽车
    @NameInMap("project_type")
    @Validation(required = true)
    public String projectType;

    public static Project build(java.util.Map<String, ?> map) throws Exception {
        Project self = new Project();
        return TeaModel.build(map, self);
    }

    public Project setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public Project setProjectEndTime(String projectEndTime) {
        this.projectEndTime = projectEndTime;
        return this;
    }
    public String getProjectEndTime() {
        return this.projectEndTime;
    }

    public Project setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public Project setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public Project setProjectStartTime(String projectStartTime) {
        this.projectStartTime = projectStartTime;
        return this;
    }
    public String getProjectStartTime() {
        return this.projectStartTime;
    }

    public Project setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }
    public String getProjectType() {
        return this.projectType;
    }

}
