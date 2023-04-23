// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 支出配置单商品价格
    public class ExpenditureQuotationOfferPrice : TeaModel {
        // 定价条件
        [NameInMap("condition_attrs")]
        [Validation(Required=false)]
        public List<ExpenditureQuotationOfferPriceConditionAttr> ConditionAttrs { get; set; }

        // 阶梯起始值
        [NameInMap("ladder_start")]
        [Validation(Required=true)]
        public string LadderStart { get; set; }

        // 阶梯结束值
        [NameInMap("ladder_end")]
        [Validation(Required=true)]
        public string LadderEnd { get; set; }

        // 价格
        [NameInMap("price")]
        [Validation(Required=true)]
        public string Price { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

    }

}
