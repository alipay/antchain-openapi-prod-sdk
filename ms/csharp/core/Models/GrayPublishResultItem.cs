// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 单机推送结果
    public class GrayPublishResultItem : TeaModel {
        // 推送目标 host
        [NameInMap("host")]
        [Validation(Required=false)]
        public string Host { get; set; }

        // 是否推送成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}
