// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 阿里云批量鉴权
    public class AliyunAuthenticateBatchEvent : TeaModel {
        // 金融云用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 阿里云鉴权列表
        [NameInMap("ram_auth_contexts")]
        [Validation(Required=true)]
        public List<AliyunRamAuthContext> RamAuthContexts { get; set; }

        // BSB透传下来的阿里云信息
        [NameInMap("request_info")]
        [Validation(Required=true)]
        public AliyunPopRequestInfo RequestInfo { get; set; }

    }

}
