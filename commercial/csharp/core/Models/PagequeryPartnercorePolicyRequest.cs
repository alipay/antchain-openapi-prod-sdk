// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class PagequeryPartnercorePolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 政策名称（字段保留） 不做调用
        [NameInMap("policy_name")]
        [Validation(Required=false)]
        public string PolicyName { get; set; }

        // 政策状态（字段保留） 不做调用
        [NameInMap("policy_status")]
        [Validation(Required=false)]
        public string PolicyStatus { get; set; }

        // 签约状态 SIGNED已签约 UNSIGNED 待签约
        [NameInMap("sign_status")]
        [Validation(Required=false)]
        public string SignStatus { get; set; }

        // 当前页码
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 每页记录数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
