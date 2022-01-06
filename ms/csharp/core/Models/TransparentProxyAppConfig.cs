// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 透明劫持配置
    public class TransparentProxyAppConfig : TeaModel {
        // 黑名单配置
        [NameInMap("blacklist")]
        [Validation(Required=true)]
        public TransparentProxyRuleConfig Blacklist { get; set; }

    }

}
