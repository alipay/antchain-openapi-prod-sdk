// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 透明劫持应用治理连接池配置
    public class TransparentProxyConnPoolConfig : TeaModel {
        // 最大连接数
        [NameInMap("max_req")]
        [Validation(Required=false)]
        public long? MaxReq { get; set; }

    }

}
