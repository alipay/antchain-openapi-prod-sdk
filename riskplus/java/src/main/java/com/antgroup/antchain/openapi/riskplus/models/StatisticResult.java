// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class StatisticResult extends TeaModel {
    // 有效任务总数量
    @NameInMap("valid_count")
    @Validation(required = true)
    public Long validCount;

    // 各类actionDriverCode的统计结果集合
    @NameInMap("statistic_info_detail_list")
    @Validation(required = true)
    public java.util.List<StatisticInfoDetail> statisticInfoDetailList;

    public static StatisticResult build(java.util.Map<String, ?> map) throws Exception {
        StatisticResult self = new StatisticResult();
        return TeaModel.build(map, self);
    }

    public StatisticResult setValidCount(Long validCount) {
        this.validCount = validCount;
        return this;
    }
    public Long getValidCount() {
        return this.validCount;
    }

    public StatisticResult setStatisticInfoDetailList(java.util.List<StatisticInfoDetail> statisticInfoDetailList) {
        this.statisticInfoDetailList = statisticInfoDetailList;
        return this;
    }
    public java.util.List<StatisticInfoDetail> getStatisticInfoDetailList() {
        return this.statisticInfoDetailList;
    }

}
