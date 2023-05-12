// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class RecoveryDsDTO extends TeaModel {
    // 分支事务表索引结束点
    @NameInMap("action_table_index_end")
    public Long actionTableIndexEnd;

    // 分支事务表索引起始点
    // 
    @NameInMap("action_table_index_start")
    public Long actionTableIndexStart;

    // 分支事务表模板
    // 
    @NameInMap("action_table_name_format")
    public String actionTableNameFormat;

    // 主事务表索引结束点
    @NameInMap("activity_table_index_end")
    public Long activityTableIndexEnd;

    // 主事务表索引起始点
    // 
    @NameInMap("activity_table_index_start")
    public Long activityTableIndexStart;

    // 主事务表模板
    @NameInMap("activity_table_name_format")
    public String activityTableNameFormat;

    // DB最小连接数
    // 
    @NameInMap("db_connect_min")
    public Long dbConnectMin;

    // DB最大连接数
    @NameInMap("db_conn_max")
    public Long dbConnMax;

    // 数据库类型
    // 
    @NameInMap("db_type")
    public Long dbType;

    // 数据源索引结束点
    // 
    @NameInMap("ds_index_end")
    public Long dsIndexEnd;

    // 数据源索引起始点
    // 
    @NameInMap("ds_index_start")
    public Long dsIndexStart;

    // 数据源名字
    @NameInMap("ds_name_format")
    public String dsNameFormat;

    // 发起方组groupid
    @NameInMap("group_id")
    public String groupId;

    // 主键id 更新时传一下
    @NameInMap("id")
    public Long id;

    // true：rzone部署，false：gzone部署
    @NameInMap("is_ldc")
    public Boolean isLdc;

    // true：数据源配置在dtap数据库，false：数据源配置在dds/zdc里。
    @NameInMap("is_local_ds")
    public Boolean isLocalDs;

    // gzone部署，国际IPAY站点使用
    @NameInMap("zone")
    public String zone;

    // 恢复任务名称模板
    @NameInMap("task_name_format")
    public String taskNameFormat;

    // 恢复任务起始索引
    @NameInMap("task_index_start")
    public Long taskIndexStart;

    // 恢复任务结束索引
    @NameInMap("task_index_end")
    public Long taskIndexEnd;

    public static RecoveryDsDTO build(java.util.Map<String, ?> map) throws Exception {
        RecoveryDsDTO self = new RecoveryDsDTO();
        return TeaModel.build(map, self);
    }

    public RecoveryDsDTO setActionTableIndexEnd(Long actionTableIndexEnd) {
        this.actionTableIndexEnd = actionTableIndexEnd;
        return this;
    }
    public Long getActionTableIndexEnd() {
        return this.actionTableIndexEnd;
    }

    public RecoveryDsDTO setActionTableIndexStart(Long actionTableIndexStart) {
        this.actionTableIndexStart = actionTableIndexStart;
        return this;
    }
    public Long getActionTableIndexStart() {
        return this.actionTableIndexStart;
    }

    public RecoveryDsDTO setActionTableNameFormat(String actionTableNameFormat) {
        this.actionTableNameFormat = actionTableNameFormat;
        return this;
    }
    public String getActionTableNameFormat() {
        return this.actionTableNameFormat;
    }

    public RecoveryDsDTO setActivityTableIndexEnd(Long activityTableIndexEnd) {
        this.activityTableIndexEnd = activityTableIndexEnd;
        return this;
    }
    public Long getActivityTableIndexEnd() {
        return this.activityTableIndexEnd;
    }

    public RecoveryDsDTO setActivityTableIndexStart(Long activityTableIndexStart) {
        this.activityTableIndexStart = activityTableIndexStart;
        return this;
    }
    public Long getActivityTableIndexStart() {
        return this.activityTableIndexStart;
    }

    public RecoveryDsDTO setActivityTableNameFormat(String activityTableNameFormat) {
        this.activityTableNameFormat = activityTableNameFormat;
        return this;
    }
    public String getActivityTableNameFormat() {
        return this.activityTableNameFormat;
    }

    public RecoveryDsDTO setDbConnectMin(Long dbConnectMin) {
        this.dbConnectMin = dbConnectMin;
        return this;
    }
    public Long getDbConnectMin() {
        return this.dbConnectMin;
    }

    public RecoveryDsDTO setDbConnMax(Long dbConnMax) {
        this.dbConnMax = dbConnMax;
        return this;
    }
    public Long getDbConnMax() {
        return this.dbConnMax;
    }

    public RecoveryDsDTO setDbType(Long dbType) {
        this.dbType = dbType;
        return this;
    }
    public Long getDbType() {
        return this.dbType;
    }

    public RecoveryDsDTO setDsIndexEnd(Long dsIndexEnd) {
        this.dsIndexEnd = dsIndexEnd;
        return this;
    }
    public Long getDsIndexEnd() {
        return this.dsIndexEnd;
    }

    public RecoveryDsDTO setDsIndexStart(Long dsIndexStart) {
        this.dsIndexStart = dsIndexStart;
        return this;
    }
    public Long getDsIndexStart() {
        return this.dsIndexStart;
    }

    public RecoveryDsDTO setDsNameFormat(String dsNameFormat) {
        this.dsNameFormat = dsNameFormat;
        return this;
    }
    public String getDsNameFormat() {
        return this.dsNameFormat;
    }

    public RecoveryDsDTO setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RecoveryDsDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RecoveryDsDTO setIsLdc(Boolean isLdc) {
        this.isLdc = isLdc;
        return this;
    }
    public Boolean getIsLdc() {
        return this.isLdc;
    }

    public RecoveryDsDTO setIsLocalDs(Boolean isLocalDs) {
        this.isLocalDs = isLocalDs;
        return this;
    }
    public Boolean getIsLocalDs() {
        return this.isLocalDs;
    }

    public RecoveryDsDTO setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public RecoveryDsDTO setTaskNameFormat(String taskNameFormat) {
        this.taskNameFormat = taskNameFormat;
        return this;
    }
    public String getTaskNameFormat() {
        return this.taskNameFormat;
    }

    public RecoveryDsDTO setTaskIndexStart(Long taskIndexStart) {
        this.taskIndexStart = taskIndexStart;
        return this;
    }
    public Long getTaskIndexStart() {
        return this.taskIndexStart;
    }

    public RecoveryDsDTO setTaskIndexEnd(Long taskIndexEnd) {
        this.taskIndexEnd = taskIndexEnd;
        return this;
    }
    public Long getTaskIndexEnd() {
        return this.taskIndexEnd;
    }

}
