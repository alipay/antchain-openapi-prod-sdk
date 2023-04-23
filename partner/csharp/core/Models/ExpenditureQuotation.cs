// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 支出配置单
    public class ExpenditureQuotation : TeaModel {
        // 支出配置单商品
        [NameInMap("quotation_offers")]
        [Validation(Required=false)]
        public List<ExpenditureQuotationOffer> QuotationOffers { get; set; }

    }

}
