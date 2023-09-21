// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class VerifyServiceaccountSignatureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 系统来源
        [NameInMap("source_system")]
        [Validation(Required=true)]
        public string SourceSystem { get; set; }

        // AK
        // 
        [NameInMap("user_access_key")]
        [Validation(Required=true)]
        public string UserAccessKey { get; set; }

        // aksk加签结果
        [NameInMap("signature_result")]
        [Validation(Required=true)]
        public string SignatureResult { get; set; }

        // 待加签内容
        [NameInMap("signature_text")]
        [Validation(Required=true)]
        public string SignatureText { get; set; }

        // 加签算法
        [NameInMap("signature_algorithm")]
        [Validation(Required=true)]
        public string SignatureAlgorithm { get; set; }

        // 租户名称，八位字母
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

    }

}
