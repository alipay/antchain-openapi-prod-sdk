// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TopAlarmDO extends TeaModel {
    // error
    @NameInMap("error")
    @Validation(required = true)
    public String error;

    // error_count
    @NameInMap("error_count")
    @Validation(required = true)
    public Long errorCount;

    // warn
    @NameInMap("warn")
    @Validation(required = true)
    public String warn;

    // warn_count
    @NameInMap("warn_count")
    @Validation(required = true)
    public Long warnCount;

    // alarm_level
    @NameInMap("alarm_level")
    @Validation(required = true)
    public Long alarmLevel;

    // max_alarm_count
    @NameInMap("max_alarm_count")
    @Validation(required = true)
    public Long maxAlarmCount;

    // emergency_copy
    @NameInMap("emergency_copy")
    @Validation(required = true)
    public String emergencyCopy;

    // emergency_url
    @NameInMap("emergency_url")
    @Validation(required = true)
    public String emergencyUrl;

    public static TopAlarmDO build(java.util.Map<String, ?> map) throws Exception {
        TopAlarmDO self = new TopAlarmDO();
        return TeaModel.build(map, self);
    }

    public TopAlarmDO setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public TopAlarmDO setErrorCount(Long errorCount) {
        this.errorCount = errorCount;
        return this;
    }
    public Long getErrorCount() {
        return this.errorCount;
    }

    public TopAlarmDO setWarn(String warn) {
        this.warn = warn;
        return this;
    }
    public String getWarn() {
        return this.warn;
    }

    public TopAlarmDO setWarnCount(Long warnCount) {
        this.warnCount = warnCount;
        return this;
    }
    public Long getWarnCount() {
        return this.warnCount;
    }

    public TopAlarmDO setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public TopAlarmDO setMaxAlarmCount(Long maxAlarmCount) {
        this.maxAlarmCount = maxAlarmCount;
        return this;
    }
    public Long getMaxAlarmCount() {
        return this.maxAlarmCount;
    }

    public TopAlarmDO setEmergencyCopy(String emergencyCopy) {
        this.emergencyCopy = emergencyCopy;
        return this;
    }
    public String getEmergencyCopy() {
        return this.emergencyCopy;
    }

    public TopAlarmDO setEmergencyUrl(String emergencyUrl) {
        this.emergencyUrl = emergencyUrl;
        return this;
    }
    public String getEmergencyUrl() {
        return this.emergencyUrl;
    }

}
