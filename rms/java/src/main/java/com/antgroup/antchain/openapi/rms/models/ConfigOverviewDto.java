// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ConfigOverviewDto extends TeaModel {
    // 自定义监控配置数
    @NameInMap("custom_plugin_count")
    @Validation(required = true)
    public Long customPluginCount;

    // 告警规则配置数
    @NameInMap("alarm_rule_count")
    @Validation(required = true)
    public Long alarmRuleCount;

    // 告警规则配置数
    @NameInMap("alarm_tpl_count")
    @Validation(required = true)
    public Long alarmTplCount;

    public static ConfigOverviewDto build(java.util.Map<String, ?> map) throws Exception {
        ConfigOverviewDto self = new ConfigOverviewDto();
        return TeaModel.build(map, self);
    }

    public ConfigOverviewDto setCustomPluginCount(Long customPluginCount) {
        this.customPluginCount = customPluginCount;
        return this;
    }
    public Long getCustomPluginCount() {
        return this.customPluginCount;
    }

    public ConfigOverviewDto setAlarmRuleCount(Long alarmRuleCount) {
        this.alarmRuleCount = alarmRuleCount;
        return this;
    }
    public Long getAlarmRuleCount() {
        return this.alarmRuleCount;
    }

    public ConfigOverviewDto setAlarmTplCount(Long alarmTplCount) {
        this.alarmTplCount = alarmTplCount;
        return this;
    }
    public Long getAlarmTplCount() {
        return this.alarmTplCount;
    }

}
