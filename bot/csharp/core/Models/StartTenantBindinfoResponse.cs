// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class StartTenantBindinfoResponse : TeaModel {
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

        // 实体did
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 非openapi访问模式https鉴权key_id,  暂保留
        [NameInMap("key_id")]
        [Validation(Required=false)]
        public string KeyId { get; set; }

        // 非openapi访问模式https鉴权key_secret,  暂保留
        [NameInMap("key_secret")]
        [Validation(Required=false)]
        public string KeySecret { get; set; }

        // 交易唯一ID
        [NameInMap("nonce")]
        [Validation(Required=false)]
        public string Nonce { get; set; }

    }

}
