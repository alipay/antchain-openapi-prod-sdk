// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ActivityDsVO extends TeaModel {
    // 9
    @NameInMap("action_table_index_end")
    @Validation(required = true)
    public Long actionTableIndexEnd;

    // 0
    @NameInMap("action_table_index_start")
    @Validation(required = true)
    public Long actionTableIndexStart;

    // .
    @NameInMap("action_table_name_format")
    @Validation(required = true)
    public String actionTableNameFormat;

    // activity_table_index_end
    @NameInMap("activity_table_index_end")
    @Validation(required = true)
    public Long activityTableIndexEnd;

    // a
    @NameInMap("activity_table_index_start")
    @Validation(required = true)
    public Long activityTableIndexStart;

    // 主事务表
    @NameInMap("activity_table_name_format")
    @Validation(required = true)
    public String activityTableNameFormat;

    // DB最小连接数
    @NameInMap("db_connect_min")
    @Validation(required = true)
    public Long dbConnectMin;

    // DB最大连接数
    @NameInMap("db_conn_max")
    @Validation(required = true)
    public Long dbConnMax;

    // 数据库类型
    @NameInMap("db_type")
    @Validation(required = true)
    public Long dbType;

    // 统一数据源索引结束值
    @NameInMap("ds_index_end")
    @Validation(required = true)
    public Long dsIndexEnd;

    // 统一数据源索引起始值
    @NameInMap("ds_index_start")
    @Validation(required = true)
    public Long dsIndexStart;

    // 统一数据源
    @NameInMap("ds_name_format")
    @Validation(required = true)
    public String dsNameFormat;

    // 唯一id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 部署模式
    // true：rzone部署，false：gzone部署
    @NameInMap("is_ldc")
    @Validation(required = true)
    public Boolean isLdc;

    // true：数据源配置在dtap数据库，false：数据源配置在dds/zdc里。
    @NameInMap("is_local_ds")
    @Validation(required = true)
    public Boolean isLocalDs;

    // gzone部署，国际IPAY站点使用
    @NameInMap("zone")
    @Validation(required = true)
    public String zone;

    // .
    @NameInMap("task_name_format")
    @Validation(required = true)
    public String taskNameFormat;

    // .
    @NameInMap("task_index_start")
    public Long taskIndexStart;

    // .
    @NameInMap("task_index_end")
    public Long taskIndexEnd;

    public static ActivityDsVO build(java.util.Map<String, ?> map) throws Exception {
        ActivityDsVO self = new ActivityDsVO();
        return TeaModel.build(map, self);
    }

    public ActivityDsVO setActionTableIndexEnd(Long actionTableIndexEnd) {
        this.actionTableIndexEnd = actionTableIndexEnd;
        return this;
    }
    public Long getActionTableIndexEnd() {
        return this.actionTableIndexEnd;
    }

    public ActivityDsVO setActionTableIndexStart(Long actionTableIndexStart) {
        this.actionTableIndexStart = actionTableIndexStart;
        return this;
    }
    public Long getActionTableIndexStart() {
        return this.actionTableIndexStart;
    }

    public ActivityDsVO setActionTableNameFormat(String actionTableNameFormat) {
        this.actionTableNameFormat = actionTableNameFormat;
        return this;
    }
    public String getActionTableNameFormat() {
        return this.actionTableNameFormat;
    }

    public ActivityDsVO setActivityTableIndexEnd(Long activityTableIndexEnd) {
        this.activityTableIndexEnd = activityTableIndexEnd;
        return this;
    }
    public Long getActivityTableIndexEnd() {
        return this.activityTableIndexEnd;
    }

    public ActivityDsVO setActivityTableIndexStart(Long activityTableIndexStart) {
        this.activityTableIndexStart = activityTableIndexStart;
        return this;
    }
    public Long getActivityTableIndexStart() {
        return this.activityTableIndexStart;
    }

    public ActivityDsVO setActivityTableNameFormat(String activityTableNameFormat) {
        this.activityTableNameFormat = activityTableNameFormat;
        return this;
    }
    public String getActivityTableNameFormat() {
        return this.activityTableNameFormat;
    }

    public ActivityDsVO setDbConnectMin(Long dbConnectMin) {
        this.dbConnectMin = dbConnectMin;
        return this;
    }
    public Long getDbConnectMin() {
        return this.dbConnectMin;
    }

    public ActivityDsVO setDbConnMax(Long dbConnMax) {
        this.dbConnMax = dbConnMax;
        return this;
    }
    public Long getDbConnMax() {
        return this.dbConnMax;
    }

    public ActivityDsVO setDbType(Long dbType) {
        this.dbType = dbType;
        return this;
    }
    public Long getDbType() {
        return this.dbType;
    }

    public ActivityDsVO setDsIndexEnd(Long dsIndexEnd) {
        this.dsIndexEnd = dsIndexEnd;
        return this;
    }
    public Long getDsIndexEnd() {
        return this.dsIndexEnd;
    }

    public ActivityDsVO setDsIndexStart(Long dsIndexStart) {
        this.dsIndexStart = dsIndexStart;
        return this;
    }
    public Long getDsIndexStart() {
        return this.dsIndexStart;
    }

    public ActivityDsVO setDsNameFormat(String dsNameFormat) {
        this.dsNameFormat = dsNameFormat;
        return this;
    }
    public String getDsNameFormat() {
        return this.dsNameFormat;
    }

    public ActivityDsVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ActivityDsVO setIsLdc(Boolean isLdc) {
        this.isLdc = isLdc;
        return this;
    }
    public Boolean getIsLdc() {
        return this.isLdc;
    }

    public ActivityDsVO setIsLocalDs(Boolean isLocalDs) {
        this.isLocalDs = isLocalDs;
        return this;
    }
    public Boolean getIsLocalDs() {
        return this.isLocalDs;
    }

    public ActivityDsVO setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public ActivityDsVO setTaskNameFormat(String taskNameFormat) {
        this.taskNameFormat = taskNameFormat;
        return this;
    }
    public String getTaskNameFormat() {
        return this.taskNameFormat;
    }

    public ActivityDsVO setTaskIndexStart(Long taskIndexStart) {
        this.taskIndexStart = taskIndexStart;
        return this;
    }
    public Long getTaskIndexStart() {
        return this.taskIndexStart;
    }

    public ActivityDsVO setTaskIndexEnd(Long taskIndexEnd) {
        this.taskIndexEnd = taskIndexEnd;
        return this;
    }
    public Long getTaskIndexEnd() {
        return this.taskIndexEnd;
    }

}
