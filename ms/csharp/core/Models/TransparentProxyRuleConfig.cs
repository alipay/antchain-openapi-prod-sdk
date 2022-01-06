// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 透明劫持规则
    public class TransparentProxyRuleConfig : TeaModel {
        // 入方向配置
        [NameInMap("in_bound")]
        [Validation(Required=true)]
        public List<TransparentProxyBound> InBound { get; set; }

        // 出方向配置
        [NameInMap("out_bound")]
        [Validation(Required=true)]
        public List<TransparentProxyBound> OutBound { get; set; }

    }

}
