// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class InitiatorDatasource extends TeaModel {
    // 分支事务表索引结束点
    @NameInMap("action_table_index_end")
    public Long actionTableIndexEnd;

    // 分支事务表索引起始点
    @NameInMap("action_table_index_start")
    public Long actionTableIndexStart;

    // 分支事务表模板
    @NameInMap("action_table_name_format")
    public String actionTableNameFormat;

    // 主事务表索引结束点
    @NameInMap("activity_table_index_end")
    public Long activityTableIndexEnd;

    // 主事务表索引起始点
    @NameInMap("activity_table_index_start")
    public Long activityTableIndexStart;

    // 主事务表模板
    @NameInMap("activity_table_name_format")
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

    // 数据源索引结束点
    @NameInMap("ds_index_end")
    public Long dsIndexEnd;

    // 数据源索引起始点
    @NameInMap("ds_index_start")
    public Long dsIndexStart;

    // 数据源名字
    @NameInMap("ds_name_format")
    public String dsNameFormat;

    // 唯一键，更新时需要
    @NameInMap("id")
    public Long id;

    // 环境唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

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

    public static InitiatorDatasource build(java.util.Map<String, ?> map) throws Exception {
        InitiatorDatasource self = new InitiatorDatasource();
        return TeaModel.build(map, self);
    }

    public InitiatorDatasource setActionTableIndexEnd(Long actionTableIndexEnd) {
        this.actionTableIndexEnd = actionTableIndexEnd;
        return this;
    }
    public Long getActionTableIndexEnd() {
        return this.actionTableIndexEnd;
    }

    public InitiatorDatasource setActionTableIndexStart(Long actionTableIndexStart) {
        this.actionTableIndexStart = actionTableIndexStart;
        return this;
    }
    public Long getActionTableIndexStart() {
        return this.actionTableIndexStart;
    }

    public InitiatorDatasource setActionTableNameFormat(String actionTableNameFormat) {
        this.actionTableNameFormat = actionTableNameFormat;
        return this;
    }
    public String getActionTableNameFormat() {
        return this.actionTableNameFormat;
    }

    public InitiatorDatasource setActivityTableIndexEnd(Long activityTableIndexEnd) {
        this.activityTableIndexEnd = activityTableIndexEnd;
        return this;
    }
    public Long getActivityTableIndexEnd() {
        return this.activityTableIndexEnd;
    }

    public InitiatorDatasource setActivityTableIndexStart(Long activityTableIndexStart) {
        this.activityTableIndexStart = activityTableIndexStart;
        return this;
    }
    public Long getActivityTableIndexStart() {
        return this.activityTableIndexStart;
    }

    public InitiatorDatasource setActivityTableNameFormat(String activityTableNameFormat) {
        this.activityTableNameFormat = activityTableNameFormat;
        return this;
    }
    public String getActivityTableNameFormat() {
        return this.activityTableNameFormat;
    }

    public InitiatorDatasource setDbConnectMin(Long dbConnectMin) {
        this.dbConnectMin = dbConnectMin;
        return this;
    }
    public Long getDbConnectMin() {
        return this.dbConnectMin;
    }

    public InitiatorDatasource setDbConnMax(Long dbConnMax) {
        this.dbConnMax = dbConnMax;
        return this;
    }
    public Long getDbConnMax() {
        return this.dbConnMax;
    }

    public InitiatorDatasource setDbType(Long dbType) {
        this.dbType = dbType;
        return this;
    }
    public Long getDbType() {
        return this.dbType;
    }

    public InitiatorDatasource setDsIndexEnd(Long dsIndexEnd) {
        this.dsIndexEnd = dsIndexEnd;
        return this;
    }
    public Long getDsIndexEnd() {
        return this.dsIndexEnd;
    }

    public InitiatorDatasource setDsIndexStart(Long dsIndexStart) {
        this.dsIndexStart = dsIndexStart;
        return this;
    }
    public Long getDsIndexStart() {
        return this.dsIndexStart;
    }

    public InitiatorDatasource setDsNameFormat(String dsNameFormat) {
        this.dsNameFormat = dsNameFormat;
        return this;
    }
    public String getDsNameFormat() {
        return this.dsNameFormat;
    }

    public InitiatorDatasource setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public InitiatorDatasource setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InitiatorDatasource setIsLdc(Boolean isLdc) {
        this.isLdc = isLdc;
        return this;
    }
    public Boolean getIsLdc() {
        return this.isLdc;
    }

    public InitiatorDatasource setIsLocalDs(Boolean isLocalDs) {
        this.isLocalDs = isLocalDs;
        return this;
    }
    public Boolean getIsLocalDs() {
        return this.isLocalDs;
    }

    public InitiatorDatasource setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
