// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmLevelStatsVOKeySet extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public AlarmLevelStatsVO value;

    public static AlarmLevelStatsVOKeySet build(java.util.Map<String, ?> map) throws Exception {
        AlarmLevelStatsVOKeySet self = new AlarmLevelStatsVOKeySet();
        return TeaModel.build(map, self);
    }

    public AlarmLevelStatsVOKeySet setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AlarmLevelStatsVOKeySet setValue(AlarmLevelStatsVO value) {
        this.value = value;
        return this;
    }
    public AlarmLevelStatsVO getValue() {
        return this.value;
    }

}
