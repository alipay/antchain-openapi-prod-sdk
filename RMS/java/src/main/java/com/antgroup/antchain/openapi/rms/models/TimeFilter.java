// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TimeFilter extends TeaModel {
    // from
    @NameInMap("from")
    public String from;

    // to
    @NameInMap("to")
    public String to;

    // weeks
    @NameInMap("weeks")
    public java.util.List<Long> weeks;

    public static TimeFilter build(java.util.Map<String, ?> map) throws Exception {
        TimeFilter self = new TimeFilter();
        return TeaModel.build(map, self);
    }

    public TimeFilter setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public TimeFilter setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public TimeFilter setWeeks(java.util.List<Long> weeks) {
        this.weeks = weeks;
        return this;
    }
    public java.util.List<Long> getWeeks() {
        return this.weeks;
    }

}
