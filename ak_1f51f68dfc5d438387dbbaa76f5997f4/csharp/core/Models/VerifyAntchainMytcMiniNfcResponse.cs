// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_1f51f68dfc5d438387dbbaa76f5997f4.Models
{
    public class VerifyAntchainMytcMiniNfcResponse : TeaModel {
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

        // 校验结果
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 校验信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 校验解析溯源码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // NFC UID
        [NameInMap("uid")]
        [Validation(Required=false)]
        public string Uid { get; set; }

    }

}
