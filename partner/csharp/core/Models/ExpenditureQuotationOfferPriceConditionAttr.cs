// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 支出配置单商品价格条件属性
    public class ExpenditureQuotationOfferPriceConditionAttr : TeaModel {
        // 属性code
        [NameInMap("attr_code")]
        [Validation(Required=true)]
        public string AttrCode { get; set; }

        // 属性值code
        [NameInMap("attr_value_code")]
        [Validation(Required=true)]
        public string AttrValueCode { get; set; }

        // 属性值名称
        [NameInMap("attr_value_name")]
        [Validation(Required=true)]
        public string AttrValueName { get; set; }

        // 运算符
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

    }

}
