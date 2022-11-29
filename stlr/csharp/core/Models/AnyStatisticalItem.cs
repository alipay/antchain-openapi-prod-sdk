// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 排放统计项目
    public class AnyStatisticalItem : TeaModel {
        // 统计项目编码
        [NameInMap("item_code")]
        [Validation(Required=true)]
        public string ItemCode { get; set; }

        // 数据值，按字符串输出，最多保留6位小数
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 单位编码
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

        // 单位标签
        [NameInMap("unit_label")]
        [Validation(Required=true)]
        public string UnitLabel { get; set; }

    }

}
