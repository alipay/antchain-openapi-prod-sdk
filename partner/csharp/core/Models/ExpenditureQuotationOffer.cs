// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 支出配置单商品
    public class ExpenditureQuotationOffer : TeaModel {
        // 支出配置单商品主键id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 一客一价
        [NameInMap("personal_price")]
        [Validation(Required=false)]
        public List<ExpenditureQuotationOfferPrice> PersonalPrice { get; set; }

        // 外部业务单据号
        [NameInMap("out_business_no")]
        [Validation(Required=false)]
        public string OutBusinessNo { get; set; }

        // 支出订购id
        [NameInMap("arrangement_no")]
        [Validation(Required=false)]
        public string ArrangementNo { get; set; }

    }

}
