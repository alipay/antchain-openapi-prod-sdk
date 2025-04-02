// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 云通信短信发送结果
    public class SmsReponse : TeaModel {
        // 发送回执ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 请求状态码; OK表示成功, 其他表示失败
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 是否调用接口成功的描述
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 请求ID
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

    }

}
