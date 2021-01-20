// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmAppStats extends TeaModel {
    // app
    @NameInMap("app")
    public String app;

    // alarm_level
    @NameInMap("alarm_level")
    public Long alarmLevel;

    // count
    @NameInMap("count")
    public Long count;

    // stack_universal_table_id
    @NameInMap("stack_universal_table_id")
    public String stackUniversalTableId;

    public static AlarmAppStats build(java.util.Map<String, ?> map) throws Exception {
        AlarmAppStats self = new AlarmAppStats();
        return TeaModel.build(map, self);
    }

    public AlarmAppStats setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AlarmAppStats setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public AlarmAppStats setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public AlarmAppStats setStackUniversalTableId(String stackUniversalTableId) {
        this.stackUniversalTableId = stackUniversalTableId;
        return this;
    }
    public String getStackUniversalTableId() {
        return this.stackUniversalTableId;
    }

}
