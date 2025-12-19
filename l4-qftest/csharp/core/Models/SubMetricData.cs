// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 子指标结构体
    public class SubMetricData : TeaModel {
        // 日期
        [NameInMap("date")]
        [Validation(Required=true)]
        public string Date { get; set; }

        // 指标类型:OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT,OPERATING_COST, GROSS_PROFIT_MARGIN,VOUCHER_CONVERSION, USER_CONVERSION
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 指标值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
