// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class GetServiceaccountOnepartyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 系统来源
        [NameInMap("source_system")]
        [Validation(Required=true)]
        public string SourceSystem { get; set; }

        // accessKey
        [NameInMap("iam_access_key")]
        [Validation(Required=false)]
        public string IamAccessKey { get; set; }

        // 用户id（服务账号）。和iam_access_key参数二选一
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
