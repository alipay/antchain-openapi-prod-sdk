// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class AssumeStsResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 安全令牌accessKey
        [NameInMap("access_key")]
        [Validation(Required=false)]
        public string AccessKey { get; set; }

        // 安全令牌accessSecret
        [NameInMap("access_secret")]
        [Validation(Required=false)]
        public string AccessSecret { get; set; }

        // 过期时间戳，单位为毫秒
        [NameInMap("expired_time")]
        [Validation(Required=false)]
        public long? ExpiredTime { get; set; }

        // 安全令牌
        [NameInMap("security_token")]
        [Validation(Required=false)]
        public string SecurityToken { get; set; }

    }

}
