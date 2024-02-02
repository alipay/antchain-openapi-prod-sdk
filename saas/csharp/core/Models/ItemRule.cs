// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS.Models
{
    // 计量项
    public class ItemRule : TeaModel {
        // 上报次数
        [NameInMap("metering_item")]
        [Validation(Required=true)]
        public string MeteringItem { get; set; }

        // 计量项列表
        [NameInMap("item_matching_rules")]
        [Validation(Required=true)]
        public List<ItemMatchingRule> ItemMatchingRules { get; set; }

    }

}
