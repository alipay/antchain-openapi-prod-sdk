// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 通用响应结构体
    public class RpcommonResp : TeaModel {
        // 调用是否成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 结果描述
        [NameInMap("result_msg")]
        [Validation(Required=true)]
        public string ResultMsg { get; set; }

        // 结果码
        [NameInMap("response_code")]
        [Validation(Required=true)]
        public string ResponseCode { get; set; }

        // 具体返回值.jsonString形式
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
