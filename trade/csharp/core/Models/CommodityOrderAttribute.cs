// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 商品订购属性结构
    public class CommodityOrderAttribute : TeaModel {
        // 属性编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 属性值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 属性值单位，部分数值型属性有多种单位，需要填入；其他情况不需要填
        [NameInMap("value_unit")]
        [Validation(Required=true)]
        public string ValueUnit { get; set; }

    }

}
