// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetPrivatecontractSignurlResponse : TeaModel {
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

        // 流程签署地址
        [NameInMap("sign_url")]
        [Validation(Required=false)]
        public string SignUrl { get; set; }

        // 返回code,200成功，其他均为失败
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 返回信息，成功返回success，错误时会返回详细信息。
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
