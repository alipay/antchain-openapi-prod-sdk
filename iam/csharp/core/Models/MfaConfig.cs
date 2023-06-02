// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // Mfa 配置
    public class MfaConfig : TeaModel {
        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // MFA状态, 取值范围：ENABLED, DISABLED
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // MFA类型，取值范围：SELF(自有MFA), SYMANTEC(赛门铁克MFA)
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 密钥
        [NameInMap("secret_key")]
        [Validation(Required=false)]
        public string SecretKey { get; set; }

        // 最后一次密钥生成时间
        [NameInMap("last_generated_time")]
        [Validation(Required=false)]
        public string LastGeneratedTime { get; set; }

        // (校验失败时)重试校验的次数, 0 代表不限次数
        [NameInMap("verify_attempts")]
        [Validation(Required=false)]
        public long? VerifyAttempts { get; set; }

        // 第一次校验失败时间, ISO8601格式
        [NameInMap("first_failure_time")]
        [Validation(Required=false)]
        public string FirstFailureTime { get; set; }

    }

}
