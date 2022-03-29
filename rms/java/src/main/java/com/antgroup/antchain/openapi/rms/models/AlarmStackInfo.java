// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmStackInfo extends TeaModel {
    // 是应用监控，还是自定义监控
    @NameInMap("datasource_type")
    public String datasourceType;

    // 数据源
    @NameInMap("datasource")
    public String datasource;

    // 应用类型
    @NameInMap("alarm_target_type")
    public String alarmTargetType;

    // 应用名称
    @NameInMap("alarm_target_identify")
    public String alarmTargetIdentify;

    public static AlarmStackInfo build(java.util.Map<String, ?> map) throws Exception {
        AlarmStackInfo self = new AlarmStackInfo();
        return TeaModel.build(map, self);
    }

    public AlarmStackInfo setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public AlarmStackInfo setDatasource(String datasource) {
        this.datasource = datasource;
        return this;
    }
    public String getDatasource() {
        return this.datasource;
    }

    public AlarmStackInfo setAlarmTargetType(String alarmTargetType) {
        this.alarmTargetType = alarmTargetType;
        return this;
    }
    public String getAlarmTargetType() {
        return this.alarmTargetType;
    }

    public AlarmStackInfo setAlarmTargetIdentify(String alarmTargetIdentify) {
        this.alarmTargetIdentify = alarmTargetIdentify;
        return this;
    }
    public String getAlarmTargetIdentify() {
        return this.alarmTargetIdentify;
    }

}
