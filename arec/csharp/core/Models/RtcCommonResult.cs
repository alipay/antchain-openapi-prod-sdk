// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 不动产中心通用应答结果
    public class RtcCommonResult : TeaModel {
        // 响应状态，包括值：S-成功，F-失败，已知的异常，U-未知，未知的异常或状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 结果码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 返回消息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
