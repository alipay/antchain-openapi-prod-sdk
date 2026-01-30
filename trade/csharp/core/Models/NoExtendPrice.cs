// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 非继承型一客一价
    public class NoExtendPrice : TeaModel {
        // 定价条件
        [NameInMap("condition_attrs")]
        [Validation(Required=false)]
        public List<PriceConditionAttr> ConditionAttrs { get; set; }

        // 阶梯开始
        [NameInMap("ladder_start")]
        [Validation(Required=true)]
        public string LadderStart { get; set; }

        // 阶梯结束
        [NameInMap("ladder_end")]
        [Validation(Required=true)]
        public string LadderEnd { get; set; }

        // 签约价
        [NameInMap("price")]
        [Validation(Required=true)]
        public string Price { get; set; }

        // 计价方法：具体公式、阶梯方法、自定义
        [NameInMap("pricing_method")]
        [Validation(Required=true)]
        public string PricingMethod { get; set; }

        // 阶梯区间类型，左开右闭/左闭右开
        [NameInMap("ladder_interval_type")]
        [Validation(Required=true)]
        public string LadderIntervalType { get; set; }

        // 定价对象code
        [NameInMap("price_object_code")]
        [Validation(Required=true)]
        public string PriceObjectCode { get; set; }

        // 计价模式：公式、阶梯、自定义
        [NameInMap("pricing_mode")]
        [Validation(Required=true)]
        public string PricingMode { get; set; }

        // 价格单位
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

        // 是否阶梯总价
        [NameInMap("ladder_price_fixed")]
        [Validation(Required=false)]
        public bool? LadderPriceFixed { get; set; }

    }

}
