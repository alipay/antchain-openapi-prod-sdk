// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 查询数据统计指标结果
    public class MetricData : TeaModel {
        // 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 指标值
        [NameInMap("total")]
        [Validation(Required=true)]
        public string Total { get; set; }

        // 子指标列表
        [NameInMap("sub_list")]
        [Validation(Required=true)]
        public List<SubMetricData> SubList { get; set; }

    }

}
