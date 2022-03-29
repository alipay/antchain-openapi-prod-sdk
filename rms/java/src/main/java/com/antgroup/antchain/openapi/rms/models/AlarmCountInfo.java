// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmCountInfo extends TeaModel {
    // 自定义监控告警数量
    @NameInMap("custom_plugin_count")
    @Validation(required = true)
    public Long customPluginCount;

    // 应用组告警数量
    @NameInMap("app_group_count")
    @Validation(required = true)
    public Long appGroupCount;

    // 应用监控告警数量
    @NameInMap("app_count")
    @Validation(required = true)
    public Long appCount;

    public static AlarmCountInfo build(java.util.Map<String, ?> map) throws Exception {
        AlarmCountInfo self = new AlarmCountInfo();
        return TeaModel.build(map, self);
    }

    public AlarmCountInfo setCustomPluginCount(Long customPluginCount) {
        this.customPluginCount = customPluginCount;
        return this;
    }
    public Long getCustomPluginCount() {
        return this.customPluginCount;
    }

    public AlarmCountInfo setAppGroupCount(Long appGroupCount) {
        this.appGroupCount = appGroupCount;
        return this;
    }
    public Long getAppGroupCount() {
        return this.appGroupCount;
    }

    public AlarmCountInfo setAppCount(Long appCount) {
        this.appCount = appCount;
        return this;
    }
    public Long getAppCount() {
        return this.appCount;
    }

}
