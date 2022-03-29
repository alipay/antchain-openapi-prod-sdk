// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmHistoryStatsDTOsKeySet extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public java.util.List<AlarmHistoryStatsDTO> value;

    public static AlarmHistoryStatsDTOsKeySet build(java.util.Map<String, ?> map) throws Exception {
        AlarmHistoryStatsDTOsKeySet self = new AlarmHistoryStatsDTOsKeySet();
        return TeaModel.build(map, self);
    }

    public AlarmHistoryStatsDTOsKeySet setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AlarmHistoryStatsDTOsKeySet setValue(java.util.List<AlarmHistoryStatsDTO> value) {
        this.value = value;
        return this;
    }
    public java.util.List<AlarmHistoryStatsDTO> getValue() {
        return this.value;
    }

}
