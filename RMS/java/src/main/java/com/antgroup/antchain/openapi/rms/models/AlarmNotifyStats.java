// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmNotifyStats extends TeaModel {
    // alarm_time
    @NameInMap("alarm_time")
    public Long alarmTime;

    // count
    @NameInMap("count")
    public Long count;

    // notify_channel
    @NameInMap("notify_channel")
    public String notifyChannel;

    public static AlarmNotifyStats build(java.util.Map<String, ?> map) throws Exception {
        AlarmNotifyStats self = new AlarmNotifyStats();
        return TeaModel.build(map, self);
    }

    public AlarmNotifyStats setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }
    public Long getAlarmTime() {
        return this.alarmTime;
    }

    public AlarmNotifyStats setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public AlarmNotifyStats setNotifyChannel(String notifyChannel) {
        this.notifyChannel = notifyChannel;
        return this;
    }
    public String getNotifyChannel() {
        return this.notifyChannel;
    }

}
