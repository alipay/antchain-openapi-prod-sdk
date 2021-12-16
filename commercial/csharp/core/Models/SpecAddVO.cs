// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 新增规格VO
    public class SpecAddVO : TeaModel {
        // 规格code
        [NameInMap("spec_code")]
        [Validation(Required=true)]
        public string SpecCode { get; set; }

        // 产品Code
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

        // 付费方式
        [NameInMap("main_pay_method")]
        [Validation(Required=true)]
        public string MainPayMethod { get; set; }

        // 规格描述
        [NameInMap("spec_desc")]
        [Validation(Required=true)]
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
