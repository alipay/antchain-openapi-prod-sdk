// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmPkgDO extends TeaModel {
    // biz_groupby_name
    @NameInMap("biz_groupby_name")
    @Validation(required = true)
    public String bizGroupbyName;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // stack_metric_group_metric_table
    @NameInMap("stack_metric_group_metric_table")
    @Validation(required = true)
    public String stackMetricGroupMetricTable;

    // tag_value
    @NameInMap("tag_value")
    @Validation(required = true)
    public String tagValue;

    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    // alarm
    @NameInMap("alarm")
    @Validation(required = true)
    public AlarmDO alarm;

    // top_alarm
    @NameInMap("top_alarm")
    @Validation(required = true)
    public TopAlarmDO topAlarm;

    public static AlarmPkgDO build(java.util.Map<String, ?> map) throws Exception {
        AlarmPkgDO self = new AlarmPkgDO();
        return TeaModel.build(map, self);
    }

    public AlarmPkgDO setBizGroupbyName(String bizGroupbyName) {
        this.bizGroupbyName = bizGroupbyName;
        return this;
    }
    public String getBizGroupbyName() {
        return this.bizGroupbyName;
    }

    public AlarmPkgDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AlarmPkgDO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AlarmPkgDO setStackMetricGroupMetricTable(String stackMetricGroupMetricTable) {
        this.stackMetricGroupMetricTable = stackMetricGroupMetricTable;
        return this;
    }
    public String getStackMetricGroupMetricTable() {
        return this.stackMetricGroupMetricTable;
    }

    public AlarmPkgDO setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

    public AlarmPkgDO setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public AlarmPkgDO setAlarm(AlarmDO alarm) {
        this.alarm = alarm;
        return this;
    }
    public AlarmDO getAlarm() {
        return this.alarm;
    }

    public AlarmPkgDO setTopAlarm(TopAlarmDO topAlarm) {
        this.topAlarm = topAlarm;
        return this;
    }
    public TopAlarmDO getTopAlarm() {
        return this.topAlarm;
    }

}
