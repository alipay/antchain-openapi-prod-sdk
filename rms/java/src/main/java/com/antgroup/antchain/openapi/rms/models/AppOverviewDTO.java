// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AppOverviewDTO extends TeaModel {
    // 应用总数
    @NameInMap("total_app_count")
    @Validation(required = true)
    public Long totalAppCount;

    // 正常运行应用数
    @NameInMap("normal_app_count")
    @Validation(required = true)
    public Long normalAppCount;

    // 告警应用数
    @NameInMap("alarm_app_count")
    @Validation(required = true)
    public Long alarmAppCount;

    // 自定义监控配置数
    @NameInMap("custom_plugin_count")
    @Validation(required = true)
    public Long customPluginCount;

    // 告警规则配置数
    @NameInMap("alarm_rule_count")
    @Validation(required = true)
    public Long alarmRuleCount;

    // 告警模板配置数
    @NameInMap("alarm_tpl_count")
    @Validation(required = true)
    public Long alarmTplCount;

    // 日志路径数
    @NameInMap("log_config_count")
    @Validation(required = true)
    public Long logConfigCount;

    // mem top排序应用
    @NameInMap("mem_top_apps")
    @Validation(required = true)
    public java.util.List<AppTopItem> memTopApps;

    // cpu top排序应用
    @NameInMap("cpu_top_apps")
    @Validation(required = true)
    public java.util.List<AppTopItem> cpuTopApps;

    // 磁盘 top排序应用
    @NameInMap("disk_top_apps")
    @Validation(required = true)
    public java.util.List<AppTopItem> diskTopApps;

    // 告警top排序应用
    @NameInMap("alarm_top_apps")
    public java.util.List<AppTopItem> alarmTopApps;

    // error top排序应用
    @NameInMap("error_top_apps")
    public java.util.List<AppTopItem> errorTopApps;

    public static AppOverviewDTO build(java.util.Map<String, ?> map) throws Exception {
        AppOverviewDTO self = new AppOverviewDTO();
        return TeaModel.build(map, self);
    }

    public AppOverviewDTO setTotalAppCount(Long totalAppCount) {
        this.totalAppCount = totalAppCount;
        return this;
    }
    public Long getTotalAppCount() {
        return this.totalAppCount;
    }

    public AppOverviewDTO setNormalAppCount(Long normalAppCount) {
        this.normalAppCount = normalAppCount;
        return this;
    }
    public Long getNormalAppCount() {
        return this.normalAppCount;
    }

    public AppOverviewDTO setAlarmAppCount(Long alarmAppCount) {
        this.alarmAppCount = alarmAppCount;
        return this;
    }
    public Long getAlarmAppCount() {
        return this.alarmAppCount;
    }

    public AppOverviewDTO setCustomPluginCount(Long customPluginCount) {
        this.customPluginCount = customPluginCount;
        return this;
    }
    public Long getCustomPluginCount() {
        return this.customPluginCount;
    }

    public AppOverviewDTO setAlarmRuleCount(Long alarmRuleCount) {
        this.alarmRuleCount = alarmRuleCount;
        return this;
    }
    public Long getAlarmRuleCount() {
        return this.alarmRuleCount;
    }

    public AppOverviewDTO setAlarmTplCount(Long alarmTplCount) {
        this.alarmTplCount = alarmTplCount;
        return this;
    }
    public Long getAlarmTplCount() {
        return this.alarmTplCount;
    }

    public AppOverviewDTO setLogConfigCount(Long logConfigCount) {
        this.logConfigCount = logConfigCount;
        return this;
    }
    public Long getLogConfigCount() {
        return this.logConfigCount;
    }

    public AppOverviewDTO setMemTopApps(java.util.List<AppTopItem> memTopApps) {
        this.memTopApps = memTopApps;
        return this;
    }
    public java.util.List<AppTopItem> getMemTopApps() {
        return this.memTopApps;
    }

    public AppOverviewDTO setCpuTopApps(java.util.List<AppTopItem> cpuTopApps) {
        this.cpuTopApps = cpuTopApps;
        return this;
    }
    public java.util.List<AppTopItem> getCpuTopApps() {
        return this.cpuTopApps;
    }

    public AppOverviewDTO setDiskTopApps(java.util.List<AppTopItem> diskTopApps) {
        this.diskTopApps = diskTopApps;
        return this;
    }
    public java.util.List<AppTopItem> getDiskTopApps() {
        return this.diskTopApps;
    }

    public AppOverviewDTO setAlarmTopApps(java.util.List<AppTopItem> alarmTopApps) {
        this.alarmTopApps = alarmTopApps;
        return this;
    }
    public java.util.List<AppTopItem> getAlarmTopApps() {
        return this.alarmTopApps;
    }

    public AppOverviewDTO setErrorTopApps(java.util.List<AppTopItem> errorTopApps) {
        this.errorTopApps = errorTopApps;
        return this;
    }
    public java.util.List<AppTopItem> getErrorTopApps() {
        return this.errorTopApps;
    }

}
