// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class UpdateOrgRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 50字符，单平台幂等
        [NameInMap("id")]
        [Validation(Required=true, MaxLength=50)]
        public string Id { get; set; }

        // 500字符 机构简介
        [NameInMap("introduction")]
        [Validation(Required=false, MaxLength=500)]
        public string Introduction { get; set; }

        // 社会统一信用代码固定18位
        [NameInMap("unified_social_credit_code")]
        [Validation(Required=false)]
        public string UnifiedSocialCreditCode { get; set; }

        // 13位时间戳 签约时间
        [NameInMap("sign_time")]
        [Validation(Required=false)]
        public long? SignTime { get; set; }

    }

}
