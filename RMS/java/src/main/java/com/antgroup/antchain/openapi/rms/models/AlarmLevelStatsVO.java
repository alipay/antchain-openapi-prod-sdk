// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmLevelStatsVO extends TeaModel {
    // l0
    @NameInMap("l0")
    public Long l0;

    // l1
    @NameInMap("l1")
    public Long l1;

    // l2
    @NameInMap("l2")
    public Long l2;

    public static AlarmLevelStatsVO build(java.util.Map<String, ?> map) throws Exception {
        AlarmLevelStatsVO self = new AlarmLevelStatsVO();
        return TeaModel.build(map, self);
    }

    public AlarmLevelStatsVO setL0(Long l0) {
        this.l0 = l0;
        return this;
    }
    public Long getL0() {
        return this.l0;
    }

    public AlarmLevelStatsVO setL1(Long l1) {
        this.l1 = l1;
        return this;
    }
    public Long getL1() {
        return this.l1;
    }

    public AlarmLevelStatsVO setL2(Long l2) {
        this.l2 = l2;
        return this;
    }
    public Long getL2() {
        return this.l2;
    }

}
