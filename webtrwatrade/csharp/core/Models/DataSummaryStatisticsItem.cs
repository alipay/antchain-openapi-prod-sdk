// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 总览历史数据统计项
    public class DataSummaryStatisticsItem : TeaModel {
        // 日期
        [NameInMap("date")]
        [Validation(Required=true)]
        public string Date { get; set; }

        // 原始币种资产价值
        [NameInMap("total_value_list")]
        [Validation(Required=true)]
        public List<MultiCurrencyMoney> TotalValueList { get; set; }

    }

}
