// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmTypeStatsVO extends TeaModel {
    // custom_plugin
    @NameInMap("custom_plugin")
    @Validation(required = true)
    public Long customPlugin;

    // meta_group
    @NameInMap("meta_group")
    @Validation(required = true)
    public Long metaGroup;

    // stack_universal_table
    @NameInMap("stack_universal_table")
    @Validation(required = true)
    public Long stackUniversalTable;

    public static AlarmTypeStatsVO build(java.util.Map<String, ?> map) throws Exception {
        AlarmTypeStatsVO self = new AlarmTypeStatsVO();
        return TeaModel.build(map, self);
    }

    public AlarmTypeStatsVO setCustomPlugin(Long customPlugin) {
        this.customPlugin = customPlugin;
        return this;
    }
    public Long getCustomPlugin() {
        return this.customPlugin;
    }

    public AlarmTypeStatsVO setMetaGroup(Long metaGroup) {
        this.metaGroup = metaGroup;
        return this;
    }
    public Long getMetaGroup() {
        return this.metaGroup;
    }

    public AlarmTypeStatsVO setStackUniversalTable(Long stackUniversalTable) {
        this.stackUniversalTable = stackUniversalTable;
        return this;
    }
    public Long getStackUniversalTable() {
        return this.stackUniversalTable;
    }

}
