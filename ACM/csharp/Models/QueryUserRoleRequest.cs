// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class QueryUserRoleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户类型
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 系统来源
        [NameInMap("source_system")]
        [Validation(Required=true)]
        public string SourceSystem { get; set; }

    }

}
