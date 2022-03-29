// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmHistoryStatsVO extends TeaModel {
    // trends
    @NameInMap("trends")
    @Validation(required = true)
    public java.util.List<AlarmHistoryStatsDTOsKeySet> trends;

    public static AlarmHistoryStatsVO build(java.util.Map<String, ?> map) throws Exception {
        AlarmHistoryStatsVO self = new AlarmHistoryStatsVO();
        return TeaModel.build(map, self);
    }

    public AlarmHistoryStatsVO setTrends(java.util.List<AlarmHistoryStatsDTOsKeySet> trends) {
        this.trends = trends;
        return this;
    }
    public java.util.List<AlarmHistoryStatsDTOsKeySet> getTrends() {
        return this.trends;
    }

}
