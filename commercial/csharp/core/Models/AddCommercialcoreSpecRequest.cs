// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class AddCommercialcoreSpecRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 规格code
        [NameInMap("spec_code")]
        [Validation(Required=true)]
        public string SpecCode { get; set; }

        // 产品code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 商品code
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 售卖模式
        [NameInMap("sales_mode")]
        [Validation(Required=true)]
        public string SalesMode { get; set; }

        // 主要付款方式
        [NameInMap("main_pay_method")]
        [Validation(Required=true)]
        public string MainPayMethod { get; set; }

        // 规格描述
        [NameInMap("spec_desc")]
        [Validation(Required=false)]
        public string SpecDesc { get; set; }

        // 规格名称
        [NameInMap("spec_name")]
        [Validation(Required=true)]
        public string SpecName { get; set; }

        // 定价计划
        [NameInMap("price_plan")]
        [Validation(Required=true)]
        public PricePlanVO PricePlan { get; set; }

    }

}
