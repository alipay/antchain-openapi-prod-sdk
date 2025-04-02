// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 机构平台通知响应结果
    public class DefinInnerChannelNotifyResult : TeaModel {
        // 请求编号
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 业务响应Json
        [NameInMap("biz_response")]
        [Validation(Required=true)]
        public string BizResponse { get; set; }

    }

}
