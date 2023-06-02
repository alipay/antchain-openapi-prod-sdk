// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class GetMfaResponse : TeaModel {
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

        // 用户 id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // MFA状态, 取值范围：ENABLED, DISABLED
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 密钥
        [NameInMap("secret_key")]
        [Validation(Required=false)]
        public string SecretKey { get; set; }

        // 最后一次密钥生成时间
        [NameInMap("last_generated_time")]
        [Validation(Required=false)]
        public string LastGeneratedTime { get; set; }

        // (校验失败时)重试校验的次数
        [NameInMap("verify_attempts")]
        [Validation(Required=false)]
        public long? VerifyAttempts { get; set; }

        // 第一次校验失败时间
        [NameInMap("first_failure_time")]
        [Validation(Required=false)]
        public string FirstFailureTime { get; set; }

    }

}
