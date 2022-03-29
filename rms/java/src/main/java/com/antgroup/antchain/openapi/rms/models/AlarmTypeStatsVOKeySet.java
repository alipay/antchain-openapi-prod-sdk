// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmTypeStatsVOKeySet extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public AlarmTypeStatsVO value;

    public static AlarmTypeStatsVOKeySet build(java.util.Map<String, ?> map) throws Exception {
        AlarmTypeStatsVOKeySet self = new AlarmTypeStatsVOKeySet();
        return TeaModel.build(map, self);
    }

    public AlarmTypeStatsVOKeySet setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AlarmTypeStatsVOKeySet setValue(AlarmTypeStatsVO value) {
        this.value = value;
        return this;
    }
    public AlarmTypeStatsVO getValue() {
        return this.value;
    }

}
