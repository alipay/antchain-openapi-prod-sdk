// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmHistoryListKeySetMap extends TeaModel {
    // key
    @NameInMap("key")
    public String key;

    // value
    @NameInMap("entity")
    public java.util.List<AlarmHistoryListKeySet> entity;

    public static AlarmHistoryListKeySetMap build(java.util.Map<String, ?> map) throws Exception {
        AlarmHistoryListKeySetMap self = new AlarmHistoryListKeySetMap();
        return TeaModel.build(map, self);
    }

    public AlarmHistoryListKeySetMap setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AlarmHistoryListKeySetMap setEntity(java.util.List<AlarmHistoryListKeySet> entity) {
        this.entity = entity;
        return this;
    }
    public java.util.List<AlarmHistoryListKeySet> getEntity() {
        return this.entity;
    }

}
