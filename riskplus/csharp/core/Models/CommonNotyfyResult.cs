// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 回调通用返回体
    public class CommonNotyfyResult : TeaModel {
        // 请求id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 业务响应Json
        [NameInMap("biz_response")]
        [Validation(Required=true)]
        public string BizResponse { get; set; }

    }

}
