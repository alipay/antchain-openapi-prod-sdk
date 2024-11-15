// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    // 商业化规则项
    public class BusinessRuleItem : TeaModel {
        // 规则表达式
        [NameInMap("condition")]
        [Validation(Required=true)]
        public string Condition { get; set; }

        // 规则值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
