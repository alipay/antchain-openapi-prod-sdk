// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class StackMonitorItem extends TeaModel {
    // 监控项 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 技术栈 ID
    @NameInMap("stack_id")
    @Validation(required = true)
    public Long stackId;

    // 名称，必须是英文
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 显示名
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 能否自定义
    @NameInMap("can_custom")
    @Validation(required = true)
    public Boolean canCustom;

    // 管理实体 ID
    @NameInMap("manage_entity_id")
    @Validation(required = true)
    public Long manageEntityId;

    // metric类型(dependency、error、service、resource等)
    @NameInMap("metric_type")
    public String metricType;

    // 配置(JSON String, 使用前需要解析)
    @NameInMap("config")
    public String config;

    // 标题
    @NameInMap("title")
    public String title;

    public static StackMonitorItem build(java.util.Map<String, ?> map) throws Exception {
        StackMonitorItem self = new StackMonitorItem();
        return TeaModel.build(map, self);
    }

    public StackMonitorItem setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public StackMonitorItem setStackId(Long stackId) {
        this.stackId = stackId;
        return this;
    }
    public Long getStackId() {
        return this.stackId;
    }

    public StackMonitorItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StackMonitorItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public StackMonitorItem setCanCustom(Boolean canCustom) {
        this.canCustom = canCustom;
        return this;
    }
    public Boolean getCanCustom() {
        return this.canCustom;
    }

    public StackMonitorItem setManageEntityId(Long manageEntityId) {
        this.manageEntityId = manageEntityId;
        return this;
    }
    public Long getManageEntityId() {
        return this.manageEntityId;
    }

    public StackMonitorItem setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public StackMonitorItem setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public StackMonitorItem setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
