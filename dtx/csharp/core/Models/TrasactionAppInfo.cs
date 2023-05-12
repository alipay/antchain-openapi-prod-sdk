// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 发起方appinfo
    public class TrasactionAppInfo : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // recovery_id
        [NameInMap("recovery_id")]
        [Validation(Required=true)]
        public long? RecoveryId { get; set; }

    }

}
