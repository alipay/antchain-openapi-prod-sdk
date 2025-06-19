// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    // 消费行业数据
    public class IndustryData : TeaModel {
        // 行业
        [NameInMap("industry")]
        [Validation(Required=true)]
        public string Industry { get; set; }

        // 区域
        [NameInMap("province")]
        [Validation(Required=true)]
        public string Province { get; set; }

        // 日期
        [NameInMap("trade_date")]
        [Validation(Required=true)]
        public string TradeDate { get; set; }

        // 线上线下 1:线下，0:线上，-1:全部
        [NameInMap("ofp_type")]
        [Validation(Required=true)]
        public string OfpType { get; set; }

        // 消费规模指数(销售金额)
        [NameInMap("trade_scale")]
        [Validation(Required=true)]
        public string TradeScale { get; set; }

        // 交易活跃指数(次数)
        [NameInMap("trade_activity")]
        [Validation(Required=true)]
        public string TradeActivity { get; set; }

        // 消费价值指数(金额/次数)
        [NameInMap("trade_value")]
        [Validation(Required=true)]
        public string TradeValue { get; set; }

        // 交易覆盖指数(去重人数)
        [NameInMap("trade_coverage")]
        [Validation(Required=true)]
        public string TradeCoverage { get; set; }

    }

}
