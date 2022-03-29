// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmNotifyStatsKeySet extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public AlarmNotifyStats value;

    public static AlarmNotifyStatsKeySet build(java.util.Map<String, ?> map) throws Exception {
        AlarmNotifyStatsKeySet self = new AlarmNotifyStatsKeySet();
        return TeaModel.build(map, self);
    }

    public AlarmNotifyStatsKeySet setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AlarmNotifyStatsKeySet setValue(AlarmNotifyStats value) {
        this.value = value;
        return this;
    }
    public AlarmNotifyStats getValue() {
        return this.value;
    }

}
