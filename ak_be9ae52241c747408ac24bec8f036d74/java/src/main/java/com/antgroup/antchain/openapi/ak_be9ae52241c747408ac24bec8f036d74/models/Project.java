// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class Project extends TeaModel {
    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 创建者ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 项目名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 项目状态:CREATING为创建中，FAILED为创建失败，FINISHED为创建完成。仅状态为FINISHED的项目才允许创建任务
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 创建时间（毫秒）
    @NameInMap("gmt_create")
    public Long gmtCreate;

    // 更新时间（毫秒）
    @NameInMap("gmt_modified")
    public Long gmtModified;

    // 参与方列表
    @NameInMap("party_list")
    @Validation(required = true)
    public java.util.List<Party> partyList;

    public static Project build(java.util.Map<String, ?> map) throws Exception {
        Project self = new Project();
        return TeaModel.build(map, self);
    }

    public Project setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public Project setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Project setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Project setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public Project setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public Project setPartyList(java.util.List<Party> partyList) {
        this.partyList = partyList;
        return this;
    }
    public java.util.List<Party> getPartyList() {
        return this.partyList;
    }

}
