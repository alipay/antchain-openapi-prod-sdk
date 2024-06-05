// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0.Models
{
    // eKYT业务响应结果
    public class IifaaEkytResponse : TeaModel {
        // 响应头
        [NameInMap("head")]
        [Validation(Required=true)]
        public ResponseHead Head { get; set; }

        // 业务响应结果
        [NameInMap("biz_res")]
        [Validation(Required=true)]
        public string BizRes { get; set; }

    }

}
