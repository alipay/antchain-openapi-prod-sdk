// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDKSY.Models
{
    // 测试请求类
    public class TessReq : TeaModel {
        // 证件号
        [NameInMap("idcard")]
        [Validation(Required=true)]
        public string Idcard { get; set; }

    }

}
