// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS.Models
{
    // 匹配规则
    public class ItemMatchingRule : TeaModel {
        // 计量项匹配规则
        [NameInMap("metering_matching_rule")]
        [Validation(Required=false)]
        public string MeteringMatchingRule { get; set; }

        // 1
        [NameInMap("metering_value")]
        [Validation(Required=true)]
        public string MeteringValue { get; set; }

    }

}
