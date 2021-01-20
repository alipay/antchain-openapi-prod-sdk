// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TimeRange extends TeaModel {
    // start
    @NameInMap("start")
    public Long start;

    // end
    @NameInMap("end")
    public Long end;

    public static TimeRange build(java.util.Map<String, ?> map) throws Exception {
        TimeRange self = new TimeRange();
        return TeaModel.build(map, self);
    }

    public TimeRange setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public TimeRange setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

}
