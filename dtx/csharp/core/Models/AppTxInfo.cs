// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // app简要信息
    public class AppTxInfo : TeaModel {
        // appInfo
        [NameInMap("app_info")]
        [Validation(Required=true)]
        public AppInfo AppInfo { get; set; }

        // Stats
        [NameInMap("stats")]
        [Validation(Required=true)]
        public Stats Stats { get; set; }

    }

}
