// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmHistoryListKeySet extends TeaModel {
    // key
    @NameInMap("key")
    public String key;

    // AlarmHistoryListKeySet
    @NameInMap("value")
    public java.util.List<AlarmHistory> value;

    public static AlarmHistoryListKeySet build(java.util.Map<String, ?> map) throws Exception {
        AlarmHistoryListKeySet self = new AlarmHistoryListKeySet();
        return TeaModel.build(map, self);
    }

    public AlarmHistoryListKeySet setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AlarmHistoryListKeySet setValue(java.util.List<AlarmHistory> value) {
        this.value = value;
        return this;
    }
    public java.util.List<AlarmHistory> getValue() {
        return this.value;
    }

}
