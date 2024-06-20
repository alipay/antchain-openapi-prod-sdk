// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    // 分账明细
    public class RuleItem : TeaModel {
        // 分账方Id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 分账份额，总份额100，保留2位小数
        [NameInMap("proportion")]
        [Validation(Required=true)]
        public string Proportion { get; set; }

    }

}
