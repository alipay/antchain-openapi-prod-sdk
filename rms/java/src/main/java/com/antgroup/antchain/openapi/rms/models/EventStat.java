// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class EventStat extends TeaModel {
    // 告警时间
    @NameInMap("alarm_time")
    public Long alarmTime;

    // 告警等级
    @NameInMap("alarm_level")
    public Long alarmLevel;

    // 告警统计数
    @NameInMap("count")
    public Long count;

    public static EventStat build(java.util.Map<String, ?> map) throws Exception {
        EventStat self = new EventStat();
        return TeaModel.build(map, self);
    }

    public EventStat setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }
    public Long getAlarmTime() {
        return this.alarmTime;
    }

    public EventStat setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public EventStat setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
