// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmCountInfoKeySet extends TeaModel {
    // 键值 (时间戳字符串)
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 某一时刻对应的告警统计信息
    @NameInMap("value")
    @Validation(required = true)
    public AlarmCountInfo value;

    public static AlarmCountInfoKeySet build(java.util.Map<String, ?> map) throws Exception {
        AlarmCountInfoKeySet self = new AlarmCountInfoKeySet();
        return TeaModel.build(map, self);
    }

    public AlarmCountInfoKeySet setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AlarmCountInfoKeySet setValue(AlarmCountInfo value) {
        this.value = value;
        return this;
    }
    public AlarmCountInfo getValue() {
        return this.value;
    }

}
