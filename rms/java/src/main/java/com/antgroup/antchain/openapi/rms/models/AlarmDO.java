// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmDO extends TeaModel {
    // model
    @NameInMap("model")
    @Validation(required = true)
    public Model model;

    // level
    @NameInMap("level")
    @Validation(required = true)
    public String level;

    // frequency
    @NameInMap("frequency")
    @Validation(required = true)
    public Long frequency;

    // silent_minute
    @NameInMap("silent_minute")
    @Validation(required = true)
    public String silentMinute;

    // emergency_copy
    @NameInMap("emergency_copy")
    @Validation(required = true)
    public String emergencyCopy;

    // emergency_url
    @NameInMap("emergency_url")
    @Validation(required = true)
    public String emergencyUrl;

    // time_zone
    @NameInMap("time_zone")
    @Validation(required = true)
    public String timeZone;

    // time_zone_custom
    @NameInMap("time_zone_custom")
    @Validation(required = true)
    public Boolean timeZoneCustom;

    public static AlarmDO build(java.util.Map<String, ?> map) throws Exception {
        AlarmDO self = new AlarmDO();
        return TeaModel.build(map, self);
    }

    public AlarmDO setModel(Model model) {
        this.model = model;
        return this;
    }
    public Model getModel() {
        return this.model;
    }

    public AlarmDO setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public AlarmDO setFrequency(Long frequency) {
        this.frequency = frequency;
        return this;
    }
    public Long getFrequency() {
        return this.frequency;
    }

    public AlarmDO setSilentMinute(String silentMinute) {
        this.silentMinute = silentMinute;
        return this;
    }
    public String getSilentMinute() {
        return this.silentMinute;
    }

    public AlarmDO setEmergencyCopy(String emergencyCopy) {
        this.emergencyCopy = emergencyCopy;
        return this;
    }
    public String getEmergencyCopy() {
        return this.emergencyCopy;
    }

    public AlarmDO setEmergencyUrl(String emergencyUrl) {
        this.emergencyUrl = emergencyUrl;
        return this;
    }
    public String getEmergencyUrl() {
        return this.emergencyUrl;
    }

    public AlarmDO setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public AlarmDO setTimeZoneCustom(Boolean timeZoneCustom) {
        this.timeZoneCustom = timeZoneCustom;
        return this;
    }
    public Boolean getTimeZoneCustom() {
        return this.timeZoneCustom;
    }

}
