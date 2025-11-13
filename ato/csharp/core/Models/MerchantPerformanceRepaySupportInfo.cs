// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商户履约订单其他还款支持信息
    public class MerchantPerformanceRepaySupportInfo : TeaModel {
        // 是否支持还款取消
        [NameInMap("support_repay")]
        [Validation(Required=false)]
        public bool? SupportRepay { get; set; }

        // 商户履约期数
        [NameInMap("term_index")]
        [Validation(Required=false)]
        public long? TermIndex { get; set; }

    }

}
