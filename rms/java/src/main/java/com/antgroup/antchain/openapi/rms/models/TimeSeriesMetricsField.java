// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TimeSeriesMetricsField extends TeaModel {
    // Field key
    @NameInMap("key")
    public String key;

    // Field value
    @NameInMap("value")
    public String value;

    public static TimeSeriesMetricsField build(java.util.Map<String, ?> map) throws Exception {
        TimeSeriesMetricsField self = new TimeSeriesMetricsField();
        return TeaModel.build(map, self);
    }

    public TimeSeriesMetricsField setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public TimeSeriesMetricsField setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
