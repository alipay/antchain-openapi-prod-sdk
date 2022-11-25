// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class DigitalProjectList extends TeaModel {
    // 项目id
    @NameInMap("project_id")
    public String projectId;

    // 项目名称
    @NameInMap("name")
    public String name;

    // 项目描述
    @NameInMap("description")
    public String description;

    // 项目状态
    @NameInMap("project_status")
    public String projectStatus;

    // 创建时间戳
    @NameInMap("create_time")
    public Long createTime;

    // 合约symbol
    @NameInMap("symbol")
    public String symbol;

    // 发行数量
    @NameInMap("amount")
    public Long amount;

    public static DigitalProjectList build(java.util.Map<String, ?> map) throws Exception {
        DigitalProjectList self = new DigitalProjectList();
        return TeaModel.build(map, self);
    }

    public DigitalProjectList setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DigitalProjectList setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DigitalProjectList setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DigitalProjectList setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
        return this;
    }
    public String getProjectStatus() {
        return this.projectStatus;
    }

    public DigitalProjectList setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DigitalProjectList setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    public String getSymbol() {
        return this.symbol;
    }

    public DigitalProjectList setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

}
