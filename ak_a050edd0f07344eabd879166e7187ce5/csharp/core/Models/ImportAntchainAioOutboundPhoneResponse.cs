// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    public class ImportAntchainAioOutboundPhoneResponse : TeaModel {
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

        // 返回结果
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 返回码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 描述
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 内容
        [NameInMap("data")]
        [Validation(Required=false)]
        public OutboundPhoneResponseData Data { get; set; }

    }

}
