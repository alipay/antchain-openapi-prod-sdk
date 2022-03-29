// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class WorkspaceSettingDetail extends TeaModel {
    // old_alarm_lang
    @NameInMap("old_alarm_lang")
    public String oldAlarmLang;

    // 旧版告警开关
    @NameInMap("old_alarm_enable")
    public Boolean oldAlarmEnable;

    // unified_alarm_lang
    @NameInMap("unified_alarm_lang")
    public String unifiedAlarmLang;

    // unified_alarm_enable
    @NameInMap("unified_alarm_enable")
    public Boolean unifiedAlarmEnable;

    // trace_enable
    @NameInMap("trace_enable")
    public Boolean traceEnable;

    // 监控诊断开关
    @NameInMap("diagnose_enable")
    public Boolean diagnoseEnable;

    public static WorkspaceSettingDetail build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceSettingDetail self = new WorkspaceSettingDetail();
        return TeaModel.build(map, self);
    }

    public WorkspaceSettingDetail setOldAlarmLang(String oldAlarmLang) {
        this.oldAlarmLang = oldAlarmLang;
        return this;
    }
    public String getOldAlarmLang() {
        return this.oldAlarmLang;
    }

    public WorkspaceSettingDetail setOldAlarmEnable(Boolean oldAlarmEnable) {
        this.oldAlarmEnable = oldAlarmEnable;
        return this;
    }
    public Boolean getOldAlarmEnable() {
        return this.oldAlarmEnable;
    }

    public WorkspaceSettingDetail setUnifiedAlarmLang(String unifiedAlarmLang) {
        this.unifiedAlarmLang = unifiedAlarmLang;
        return this;
    }
    public String getUnifiedAlarmLang() {
        return this.unifiedAlarmLang;
    }

    public WorkspaceSettingDetail setUnifiedAlarmEnable(Boolean unifiedAlarmEnable) {
        this.unifiedAlarmEnable = unifiedAlarmEnable;
        return this;
    }
    public Boolean getUnifiedAlarmEnable() {
        return this.unifiedAlarmEnable;
    }

    public WorkspaceSettingDetail setTraceEnable(Boolean traceEnable) {
        this.traceEnable = traceEnable;
        return this;
    }
    public Boolean getTraceEnable() {
        return this.traceEnable;
    }

    public WorkspaceSettingDetail setDiagnoseEnable(Boolean diagnoseEnable) {
        this.diagnoseEnable = diagnoseEnable;
        return this;
    }
    public Boolean getDiagnoseEnable() {
        return this.diagnoseEnable;
    }

}
