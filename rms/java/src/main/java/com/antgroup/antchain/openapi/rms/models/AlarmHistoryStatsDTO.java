// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmHistoryStatsDTO extends TeaModel {
    // alarm_time
    @NameInMap("alarm_time")
    @Validation(required = true)
    public Long alarmTime;

    // alarm_level
    @NameInMap("alarm_level")
    @Validation(required = true)
    public Long alarmLevel;

    // count
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    public static AlarmHistoryStatsDTO build(java.util.Map<String, ?> map) throws Exception {
        AlarmHistoryStatsDTO self = new AlarmHistoryStatsDTO();
        return TeaModel.build(map, self);
    }

    public AlarmHistoryStatsDTO setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }
    public Long getAlarmTime() {
        return this.alarmTime;
    }

    public AlarmHistoryStatsDTO setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public AlarmHistoryStatsDTO setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
