// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 还款方式/借款期数信息
    public class PlatformRepayTypeInfo : TeaModel {
        // 1：等额本息
        // 2：等额本金
        // 3：按期付息到期还本（先息后本）
        [NameInMap("repay_type")]
        [Validation(Required=true)]
        public string RepayType { get; set; }

        // {”1“，”2“}
        [NameInMap("periods")]
        [Validation(Required=true)]
        public List<string> Periods { get; set; }

    }

}
