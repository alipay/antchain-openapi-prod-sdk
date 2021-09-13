// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 商品属性结构
    public class CommodityAttribute : TeaModel {
        // 属性编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 属性名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 默认值
        [NameInMap("default_value")]
        [Validation(Required=true)]
        public string DefaultValue { get; set; }

        // 属性值类型，离散值：DISCRETE，数值：NUMBER
        [NameInMap("value_type")]
        [Validation(Required=true)]
        public string ValueType { get; set; }

        // 当是离散值类型时，为多个离散值逗号分隔
        // 当是数值类型时，为JSON，结构为{"rangeType":"open", "min":1, "max": 100, "step:1}
        [NameInMap("value_range")]
        [Validation(Required=true)]
        public string ValueRange { get; set; }

        // 展示类型
        [NameInMap("display_type")]
        [Validation(Required=true)]
        public string DisplayType { get; set; }

        // 提示文案
        [NameInMap("tips")]
        [Validation(Required=true)]
        public string Tips { get; set; }

        // 单位
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

    }

}
