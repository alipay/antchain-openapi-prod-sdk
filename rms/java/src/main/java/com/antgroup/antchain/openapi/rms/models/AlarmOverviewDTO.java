// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmOverviewDTO extends TeaModel {
    // level1_alarm_count
    @NameInMap("level1_alarm_count")
    @Validation(required = true)
    public Long level1AlarmCount;

    // level2_alarm_count
    @NameInMap("level2_alarm_count")
    @Validation(required = true)
    public Long level2AlarmCount;

    // level3_alarm_count
    @NameInMap("level3_alarm_count")
    @Validation(required = true)
    public Long level3AlarmCount;

    // alarm_sub_count
    @NameInMap("alarm_sub_count")
    @Validation(required = true)
    public Long alarmSubCount;

    // alarm_pkg_count
    @NameInMap("alarm_pkg_count")
    @Validation(required = true)
    public Long alarmPkgCount;

    // recent_alarms
    @NameInMap("recent_alarms")
    @Validation(required = true)
    public java.util.List<AlarmHistoryDTO> recentAlarms;

    public static AlarmOverviewDTO build(java.util.Map<String, ?> map) throws Exception {
        AlarmOverviewDTO self = new AlarmOverviewDTO();
        return TeaModel.build(map, self);
    }

    public AlarmOverviewDTO setLevel1AlarmCount(Long level1AlarmCount) {
        this.level1AlarmCount = level1AlarmCount;
        return this;
    }
    public Long getLevel1AlarmCount() {
        return this.level1AlarmCount;
    }

    public AlarmOverviewDTO setLevel2AlarmCount(Long level2AlarmCount) {
        this.level2AlarmCount = level2AlarmCount;
        return this;
    }
    public Long getLevel2AlarmCount() {
        return this.level2AlarmCount;
    }

    public AlarmOverviewDTO setLevel3AlarmCount(Long level3AlarmCount) {
        this.level3AlarmCount = level3AlarmCount;
        return this;
    }
    public Long getLevel3AlarmCount() {
        return this.level3AlarmCount;
    }

    public AlarmOverviewDTO setAlarmSubCount(Long alarmSubCount) {
        this.alarmSubCount = alarmSubCount;
        return this;
    }
    public Long getAlarmSubCount() {
        return this.alarmSubCount;
    }

    public AlarmOverviewDTO setAlarmPkgCount(Long alarmPkgCount) {
        this.alarmPkgCount = alarmPkgCount;
        return this;
    }
    public Long getAlarmPkgCount() {
        return this.alarmPkgCount;
    }

    public AlarmOverviewDTO setRecentAlarms(java.util.List<AlarmHistoryDTO> recentAlarms) {
        this.recentAlarms = recentAlarms;
        return this;
    }
    public java.util.List<AlarmHistoryDTO> getRecentAlarms() {
        return this.recentAlarms;
    }

}
