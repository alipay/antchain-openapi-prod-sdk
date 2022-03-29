// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class StackGeneratedConfig extends TeaModel {
    // 配置 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 所属技术栈 ID
    @NameInMap("stack_id")
    @Validation(required = true)
    public Long stackId;

    // 技术栈名称
    @NameInMap("stack_name")
    @Validation(required = true)
    public String stackName;

    // 技术栈版本
    @NameInMap("stack_version")
    @Validation(required = true)
    public String stackVersion;

    // 栈的一个实体对象 ID
    @NameInMap("stack_entity_id")
    @Validation(required = true)
    public Long stackEntityId;

    // 栈的一个实体对象名称
    @NameInMap("stack_entity_name")
    @Validation(required = true)
    public String stackEntityName;

    // 实体的一个监控项 ID
    @NameInMap("stack_monitor_item_id")
    @Validation(required = true)
    public Long stackMonitorItemId;

    // 实体的一个监控项名称
    @NameInMap("stack_monitor_item_name")
    @Validation(required = true)
    public String stackMonitorItemName;

    // 栈实体
    @NameInMap("stack_universal_table_id")
    @Validation(required = true)
    public String stackUniversalTableId;

    // xflush应用名称
    @NameInMap("xflush_app")
    @Validation(required = true)
    public String xflushApp;

    // 是否迁移过来
    @NameInMap("xflush_move")
    @Validation(required = true)
    public Boolean xflushMove;

    // xflush_type
    @NameInMap("xflush_type")
    @Validation(required = true)
    public String xflushType;

    // 是否开启
    @NameInMap("is_open")
    @Validation(required = true)
    public Boolean isOpen;

    // 存储规则(JSON String, 使用前需要解析)
    @NameInMap("storage_config")
    @Validation(required = true)
    public String storageConfig;

    // 是否自定义
    @NameInMap("use_custom")
    @Validation(required = true)
    public Boolean useCustom;

    // xflush配置(JSON String, 使用前需要解析)
    @NameInMap("xflush_config")
    public String xflushConfig;

    public static StackGeneratedConfig build(java.util.Map<String, ?> map) throws Exception {
        StackGeneratedConfig self = new StackGeneratedConfig();
        return TeaModel.build(map, self);
    }

    public StackGeneratedConfig setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public StackGeneratedConfig setStackId(Long stackId) {
        this.stackId = stackId;
        return this;
    }
    public Long getStackId() {
        return this.stackId;
    }

    public StackGeneratedConfig setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public StackGeneratedConfig setStackVersion(String stackVersion) {
        this.stackVersion = stackVersion;
        return this;
    }
    public String getStackVersion() {
        return this.stackVersion;
    }

    public StackGeneratedConfig setStackEntityId(Long stackEntityId) {
        this.stackEntityId = stackEntityId;
        return this;
    }
    public Long getStackEntityId() {
        return this.stackEntityId;
    }

    public StackGeneratedConfig setStackEntityName(String stackEntityName) {
        this.stackEntityName = stackEntityName;
        return this;
    }
    public String getStackEntityName() {
        return this.stackEntityName;
    }

    public StackGeneratedConfig setStackMonitorItemId(Long stackMonitorItemId) {
        this.stackMonitorItemId = stackMonitorItemId;
        return this;
    }
    public Long getStackMonitorItemId() {
        return this.stackMonitorItemId;
    }

    public StackGeneratedConfig setStackMonitorItemName(String stackMonitorItemName) {
        this.stackMonitorItemName = stackMonitorItemName;
        return this;
    }
    public String getStackMonitorItemName() {
        return this.stackMonitorItemName;
    }

    public StackGeneratedConfig setStackUniversalTableId(String stackUniversalTableId) {
        this.stackUniversalTableId = stackUniversalTableId;
        return this;
    }
    public String getStackUniversalTableId() {
        return this.stackUniversalTableId;
    }

    public StackGeneratedConfig setXflushApp(String xflushApp) {
        this.xflushApp = xflushApp;
        return this;
    }
    public String getXflushApp() {
        return this.xflushApp;
    }

    public StackGeneratedConfig setXflushMove(Boolean xflushMove) {
        this.xflushMove = xflushMove;
        return this;
    }
    public Boolean getXflushMove() {
        return this.xflushMove;
    }

    public StackGeneratedConfig setXflushType(String xflushType) {
        this.xflushType = xflushType;
        return this;
    }
    public String getXflushType() {
        return this.xflushType;
    }

    public StackGeneratedConfig setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }
    public Boolean getIsOpen() {
        return this.isOpen;
    }

    public StackGeneratedConfig setStorageConfig(String storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }
    public String getStorageConfig() {
        return this.storageConfig;
    }

    public StackGeneratedConfig setUseCustom(Boolean useCustom) {
        this.useCustom = useCustom;
        return this;
    }
    public Boolean getUseCustom() {
        return this.useCustom;
    }

    public StackGeneratedConfig setXflushConfig(String xflushConfig) {
        this.xflushConfig = xflushConfig;
        return this;
    }
    public String getXflushConfig() {
        return this.xflushConfig;
    }

}
