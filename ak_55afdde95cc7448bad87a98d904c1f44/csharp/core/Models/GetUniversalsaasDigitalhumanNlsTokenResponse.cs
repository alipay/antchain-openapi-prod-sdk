// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_55afdde95cc7448bad87a98d904c1f44.Models
{
    public class GetUniversalsaasDigitalhumanNlsTokenResponse : TeaModel {
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

        // appkey
        // 
        [NameInMap("app_key")]
        [Validation(Required=false)]
        public string AppKey { get; set; }

        // token
        [NameInMap("app_token")]
        [Validation(Required=false)]
        public string AppToken { get; set; }

        // token的有效期时间戳
        [NameInMap("expire_time")]
        [Validation(Required=false)]
        public long? ExpireTime { get; set; }

    }

}
