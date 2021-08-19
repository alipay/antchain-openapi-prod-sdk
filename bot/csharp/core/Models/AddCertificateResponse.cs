// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class AddCertificateResponse : TeaModel {
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

        // 原始数据
        [NameInMap("raw_data")]
        [Validation(Required=false)]
        public string RawData { get; set; }

        // 对raw_data的签名
        [NameInMap("platform_signature")]
        [Validation(Required=false)]
        public string PlatformSignature { get; set; }

        // 执行结果成功与否
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public long? ErrorCode { get; set; }

    }

}
