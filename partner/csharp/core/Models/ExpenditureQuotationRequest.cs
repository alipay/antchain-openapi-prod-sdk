// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 支出配置单请求
    public class ExpenditureQuotationRequest : TeaModel {
        // 定价模式：
        //     Standard("Standard", "标准价"),
        //     Customer("Customer", "自定义价格"),
        [NameInMap("price_mode")]
        [Validation(Required=true)]
        public string PriceMode { get; set; }

        // 支出配置单对象列表
        [NameInMap("quotation_items")]
        [Validation(Required=true)]
        public List<ExpenditureQuotationItem> QuotationItems { get; set; }

    }

}
