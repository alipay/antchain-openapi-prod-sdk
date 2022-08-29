// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class VerifyContractTextsignResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 业务结果码, 成功0
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 结果信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 签署信息, 包含签名与证书
        [NameInMap("sign_info")]
        [Validation(Required=false)]
        public ContractTextSignVerifySignInfo SignInfo { get; set; }

    }

}
