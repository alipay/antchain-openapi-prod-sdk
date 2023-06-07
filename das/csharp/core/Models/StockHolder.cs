// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 查询人持股信息
    public class StockHolder : TeaModel {
        // 股东类型
        [NameInMap("org_holder_type")]
        [Validation(Required=false)]
        public string OrgHolderType { get; set; }

        // 出资时间
        [NameInMap("invest_date")]
        [Validation(Required=false)]
        public string InvestDate { get; set; }

        // 占比
        [NameInMap("invest_rate")]
        [Validation(Required=false)]
        public string InvestRate { get; set; }

        // 出资金额
        [NameInMap("subscript_amt")]
        [Validation(Required=false)]
        public string SubscriptAmt { get; set; }

        // 股东名
        [NameInMap("or_holder_name")]
        [Validation(Required=false)]
        public string OrHolderName { get; set; }

    }

}
